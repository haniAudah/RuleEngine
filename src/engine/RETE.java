package engine;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.JFrame;

import org.antlr.runtime.tree.Tree;

import gui.RETE_printer;

/**
 * This is a direct implementation of the RETE algorithm (see the paper referenced in the manual for details).
 * 
 * @author Hani Audah
 */
public class RETE
{
	public RETE()
	{
		root = new RootNode();
		currentNode = new Stack<Node>();
		alphaMemory = new LinkedList<LinkedList<AlphaMemoryNode>>();
		betaMemory = new LinkedList<BetaMemoryNode>();
		terminalMemory = new LinkedList<TerminalNode>();
		bindings = new HashMap<String, BetaNode>();
	}

	/**
	 * Adds a TypeNode to the RETE
	 * 
	 * @param type
	 *            the name of the type to be added
	 */
	public void insertType(String type)
	{
		TypeNode tNode = new TypeNode(type);
		root.next.add(tNode);
		currentNode.push(tNode);
	}

	/**
	 * Adds an AlphaNode to the RETE that checks for a condition (determined by the parameter).
	 * 
	 * @param condition
	 *            represents the condition to be checked by this alpha node.
	 * @param args
	 *            the arguments (class attributes) on which the condition will be applied.
	 * @param last
	 *            whether or not the added node will be at the edge of the alpha network.
	 * @return the alpha node just inserted into the RETE.
	 */
	private void insertAlpha(String condition, String args[], boolean last)
	{
		AlphaNode aNode = new AlphaNode(condition, args);
		currentNode.peek().next.add(aNode);
		currentNode.push(aNode);

		// If this node is at the edge of the alpha network, it must be succeeded by a memory node (alpha mem)
		if (last)
		{
			AlphaMemoryNode temp = new AlphaMemoryNode();
			aNode.next.add(temp);
			alphaMemory.peekLast().add(temp);
		}
	}

	/**
	 * Constructs the Alpha Network of the RETE.
	 * 
	 * @param parser_AST
	 *            the AST (returned by ANTLR) of the DRL file for which a RETE is being constructed.
	 */
	public void constructRETE(Tree parser_AST)
	{
		// HashMap<String, BetaNode> bindMap = new HashMap<String, BetaNode>();
		int i = 0;
		Tree type = parser_AST.getChild(1).getChild(0);
		while (type != null)
		{
			insertType(type.toString());
			Tree pattern = type.getChild(0);

			// Create a list to hold the alpha memory nodes for this object type and add it to alphaMemory
			LinkedList<AlphaMemoryNode> temp = new LinkedList<AlphaMemoryNode>();
			alphaMemory.add(temp);

			LinkedList<String[]> toBind = constructAlpha_helper(pattern, true).toBind;

			if (!toBind.isEmpty())
			{
				for (AlphaMemoryNode a : alphaMemory.getLast())
				{
					BetaNode b = new BetaNode();
					BetaMemoryNode bm = new BetaMemoryNode();
					b.next.add(bm);
					a.next.add(b);
					for (String[] s : toBind)
					{
						bindings.put(s[0], b);
					}
				}
			}
			currentNode.pop();
			type = parser_AST.getChild(1).getChild(++i);
		}

		constructBeta();
		String ruleName = parser_AST.getChild(0).toStringTree().substring(10);
		ruleName = ruleName.substring(0, ruleName.length() - 1);
		constructTerminal(ruleName);
	}

	/**
	 * @see #constructAlpha_helper
	 */
	private class retval
	{
		boolean alpha;
		LinkedList<String[]> toBind;

		public retval()
		{
			alpha = false;
			toBind = new LinkedList<String[]>();
		}
	}

	/**
	 * Private helper function to construct the alpha network recursively. This function needs
	 * to return two things: a boolean representing whether or not the conditions could be left
	 * inside the alpha network (true for yes) and a list of bindings that are presumably
	 * referenced later in the rule.
	 **/
	private retval constructAlpha_helper(Tree pattern, boolean last)
	{
		// Return values encapsulated in retval
		retval r = new retval();
		String op = pattern.toString();

		if (op.equals(","))
		{
			int i = 0;
			while (!pattern.getChild(i).toString().equals("BREAK"))
			{
				// TODO what if there is only 1?? Fix this up
				boolean lst = (i == pattern.getChildCount());
				retval ret = constructAlpha_helper(pattern.getChild(i), lst);
				r.toBind.addAll(ret.toBind);
				i++;
			}
		}

		if (op.equals("&&"))
		{
			// An "&&" can be evaluated in the alpha network if both conditions can.
			retval ret1 = constructAlpha_helper(pattern.getChild(0), false);
			r.toBind.addAll(ret1.toBind);
			r.alpha = r.alpha || ret1.alpha;
			if (r.alpha)
			{
				retval ret2 = constructAlpha_helper(pattern.getChild(1), true);
				r.toBind.addAll(ret2.toBind);
				r.alpha = r.alpha && ret2.alpha;
			}
			if (r.alpha)
			{
				currentNode.pop();
			}
		}
		else if (op.equals("||"))
		{
			retval ret = constructAlpha_helper(pattern.getChild(0), true);
			if (ret.alpha)
			{
				r.toBind.addAll(ret.toBind);
				currentNode.pop();
			}
			ret = constructAlpha_helper(pattern.getChild(1), true);
			if (ret.alpha)
			{
				r.toBind.addAll(ret.toBind);
				currentNode.pop();
			}
		}
		else if (op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("=="))
		{
			String attr1 = pattern.getChild(0).toString(), attr2 = pattern.getChild(1).toString();
			r.alpha = true;

			// If the attribute being used is not a member of this object, then it should be left to the Beta network.
			// Since variables from other objects are referenced using $var (assuming they have been first bound
			// using $var : attribute), the check is simple and is handled mostly by the grammar
			if (attr1.equals("$"))
			{
				if (pattern.getChild(0).getChildCount() == 1)
				{
					// using a previously bound variable
					return r;
				}
				else
				{
					// binding now
					attr1 = pattern.getChild(0).getChild(2).toString();
					r.toBind.add(new String[] { pattern.getChild(0).getChild(0).toString(), pattern.getChild(0).getChild(2).toString() });
				}
			}
			else if (attr2.equals("$"))
			{
				if (pattern.getChild(1).getChildCount() == 1)
				{
					return r;
				}
				else
				{
					attr2 = pattern.getChild(1).getChild(2).toString();
					r.toBind.add(new String[] { pattern.getChild(1).getChild(0).toString(), pattern.getChild(1).getChild(3).toString() });
				}
			}

			// Now we can proceed
			insertAlpha(op, new String[] { attr1, attr2 }, last);
		}
		return r;
	}

	/**
	 * Adds a beta join node between a specified alpha memory-beta memory pair.
	 * 
	 * @param mAlpha
	 *            the alpha memory whose elements will be passed through the created beta node.
	 * @param mBeta
	 *            the beta memory whose elements will be passed through the created beta node.
	 */
	private BetaMemoryNode insertBeta(AlphaMemoryNode mAlpha, BetaMemoryNode mBeta)
	{
		BetaNode b = new BetaNode();
		mAlpha.next.add(b);
		mBeta.next.add(b);
		BetaMemoryNode bm = new BetaMemoryNode();
		b.next.add(bm);
		return bm;
	}

	/**
	 * BetaNodes can only be placed after an alpha memory-beta memory pair. Calls to this function will
	 * simply result in the necessary dummy nodes being placed where needed.
	 * 
	 * @param m1
	 *            alpha memory whose elements will be passed through the created beta node.
	 * @param m2
	 *            alpha memory whose elements will be passed through the created beta node.
	 */
	private void insertBeta(AlphaMemoryNode m1, AlphaMemoryNode m2)
	{
		// TODO This should insert dummy nodes!!

		// BetaMemoryNode dummy = new BetaMemoryNode();
		// //m1.next.add();
		// BetaMemoryNode dummy2 = insertBeta(m1, dummy);
		// insertBeta(m2, dummy2);

		BetaNode b = new BetaNode();
		m1.next.add(b);
		m2.next.add(b);
		BetaMemoryNode bm = new BetaMemoryNode();

		// Assume it will be a dangling mem node
		betaMemory.add(bm);
		b.next.add(bm);
		// return bm;
	}

	/**
	 * Private helper function to construct beta network.
	 */
	public void constructBeta()
	{
		// TODO Fix this; very naive
		// All of the last nodes for each type contain objects that satisfied the pattern (possibly duplicated in
		// different last nodes). We should beta-join these with the objects of the different types. Since each type
		// will have several last nodes, we thus need to form all possible different combinations.

		// 1: For each object type in the rule
		for (int i = 0; i < alphaMemory.size(); i++)
		{
			// 2: For each memory node ending this object type's alpha network
			for (AlphaMemoryNode n1 : alphaMemory.get(i))
			{
				// 3: Find a different alpha memory node from another object's list
				for (int j = i + 1; j < alphaMemory.size(); j++)
				{
					for (AlphaMemoryNode n2 : alphaMemory.get(j))
					{
						// 4: and join them with a beta node
						insertBeta(n1, n2);
					}
				}
			}
		}
	}

	/**
	 * Private helper function to attach terminal nodes at the ends of all dangling beta nodes.
	 */
	public void constructTerminal(String ruleName)
	{
		for (BetaMemoryNode b : betaMemory)
		{
			TerminalNode t = new TerminalNode(ruleName);
			b.next.add(t);
			terminalMemory.add(t);
		}
	}

	/**
	 * Prints the graphical representation of the RETE.
	 */
	public void print()
	{
		RETE_printer p = new RETE_printer();
		Thread t = p.openWindow();

		// TODO Walk through the rest of the graph, passing nodes to be printed
		print_helper(root, p);
		try
		{
			t.join();
		}
		catch (InterruptedException e)
		{
		}
	}

	/**
	 * Private helper function to traverse nodes while printing.
	 */
	private void print_helper(Node current, RETE_printer p)
	{
		// Beta nodes need special handling, since we can reach them from two different locations
		if (current instanceof BetaNode)
		{
			// if it was already inserted before, subtree was already done. insertBeta will just add branch
			// and we should just exit.
			if (p.insertBeta(current.getLabel(), current.getID()))
			{
				return;
			}
			for (int i = 0; i < current.next.size(); i++)
			{
				print_helper(current.next.get(i), p);
			}
			p.back();
		}
		else
		{
			p.insertNode(current.getLabel());
			for (int i = 0; i < current.next.size(); i++)
			{
				print_helper(current.next.get(i), p);
			}
			p.back();
		}
	}

	/**
	 * The root node is the first node any inserted objects must go through. It imposes no constraints.
	 * It's only use is to pass the nodes forward to its connected nodes.
	 */
	public class RootNode extends Node
	{
		public String getLabel()
		{
			return "root";
		}
	}

	/**
	 * TypeNodes check if incoming objects satisfy type requirements. They are thus the first nodes in the
	 * RETE following the root.
	 */
	public class TypeNode extends Node
	{
		private String type;

		public TypeNode(String type)
		{
			this.type = type;
		}

		public String getLabel()
		{
			return type;
		}
	}

	/**
	 * AlphaNodes impose single-object constraints, that is, constraints that can be evaluated independently
	 * of any other objects previously inserted.
	 */
	public class AlphaNode extends Node
	{
		public AlphaNode(String condition, String args[])
		{
			this.condition = condition;
			this.args = args;
		}

		public String getLabel()
		{
			return args[0] + condition + args[1];
		}

		private String condition;
		private String args[];
	}

	public class BetaNode extends Node
	{
		public String getLabel()
		{
			return "join";
		}
	}

	public class TerminalNode extends Node
	{
		public TerminalNode(String ruleName)
		{
			this.ruleName = ruleName;
		}

		public String getLabel()
		{
			return "terminal: " + '\n' + ruleName;
		}

		private String ruleName;
	}

	public class AlphaMemoryNode extends Node
	{
		public String getLabel()
		{
			return "alpha mem";
		}

		private LinkedList<Integer> WME_list;

		// TODO Fix whole implementation
		private String type;
	}

	public class BetaMemoryNode extends Node
	{
		public String getLabel()
		{
			return "beta mem";
		}
	}

	public abstract class Node
	{
		public LinkedList<Node> next;
		private int uniqueID;

		public Node()
		{
			next = new LinkedList<Node>();

			// set then increment
			uniqueID = idCounter++;
		}

		/**
		 * Returns a label to be used on Nodes in the graphical representation of the RETE.
		 * 
		 * @return the node label
		 */
		public abstract String getLabel();

		/**
		 * Returns the node's unique id.
		 * 
		 * @return node id
		 */
		public int getID()
		{
			return uniqueID;
		}
	}

	private RootNode root;

	/**
	 * currentNode is needed when constructing the RETE. It is assumed that the RETE is constructed once and cannot
	 * be modified later, so no method to randomly insert nodes into the RETE is needed, only one to insert a new node
	 * at the current position, and a stack of elements to be linked to this node. The stack will then be set to this node.
	 * 
	 * @see #constructAlpha(Tree)
	 */
	private Stack<Node> currentNode;

	/**
	 * While building the alpha network, nodes to be used in the Beta network are placed in the alpha mem.
	 * The member alphaMemory is actually a list of lists; one list for each different type of object in
	 * the rule's RETE.
	 */
	private LinkedList<LinkedList<AlphaMemoryNode>> alphaMemory;

	/**
	 * Need to keep track of ids used so far.
	 */
	private int idCounter = 0;

	/**
	 * Keeps a list of terminal nodes containing the passing tuples. These are the tuples that will cause the
	 * rules to fire.
	 */
	private LinkedList<TerminalNode> terminalMemory;

	/**
	 * Keeps a list of dangling beta memory nodes. These would need to be followed by the terminal nodes.
	 */
	private LinkedList<BetaMemoryNode> betaMemory;

	/**
	 * A map containing all variable bindings encoutered so far.
	 */
	private HashMap<String, BetaNode> bindings;
}
