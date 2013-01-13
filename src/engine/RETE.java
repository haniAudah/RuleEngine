package engine;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import org.antlr.runtime.tree.CommonTree;
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
		bindings = new HashMap<String, attributeBindNodes>();
	}

	/**
	 * Adds a TypeNode to the RETE
	 * 
	 * @param type
	 *            the name of the type to be added
	 */
	public Node insertType(String type)
	{
		TypeNode tNode = new TypeNode(type);
		root.next.add(tNode);
		return tNode;
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
	private List<Node> insertAlpha(Tree condition, List<Node> currentNodes)
	{
		LinkedList<Node> nextCurrentNodes = new LinkedList<Node>();

		for (Node n : currentNodes)
		{
			AlphaNode aNode = new AlphaNode(condition);
			n.next.add(aNode);
			nextCurrentNodes.add(aNode);
		}

		return nextCurrentNodes;
	}

	/**
	 * Bindings bind to attributes of objects instead of the actual objects. The bindings hashmap
	 * will map previously bound variable identifiers to a single attributeBindNodes object
	 * that will contain the attribute's string and the
	 * 
	 * @see #constructRETE
	 */
	private class attributeBindNodes
	{
		public attributeBindNodes(String attribute, List<Node> bindNodes)
		{
			this.attribute = attribute;
			this.bindNodes = bindNodes;
			betaMemoryBindNodes = new LinkedList<BetaMemoryNode>();
			for (Node n : bindNodes)
			{
				BetaMemoryNode bm = new BetaMemoryNode();
				n.next.add(bm);
				betaMemoryBindNodes.add(bm);
			}
		}

		public String getAttribute()
		{
			return attribute;
		}

		public List<BetaMemoryNode> betaMemoryBindNodes;
		public List<Node> bindNodes;// TODO Probably dont need this anymore.
		private String attribute;
	}

	/**
	 * Constructs the Alpha Network of the RETE.
	 * 
	 * @param parser_AST
	 *            the AST (returned by ANTLR) of the DRL file for which a RETE is being constructed.
	 */
	public void constructRETE(Tree parser_AST)
	{
		int i = 0;
		Tree type = parser_AST.getChild(1).getChild(0);
		while (type != null)
		{
			Node newType = insertType(type.toString());
			LinkedList<Node> currentType = new LinkedList<Node>();
			currentType.add(newType);
			Tree pattern = type.getChild(0);

			// Create a list to hold the alpha memory nodes for this object type and add it to alphaMemory
			LinkedList<AlphaMemoryNode> temp = new LinkedList<AlphaMemoryNode>();
			alphaMemory.add(temp);

			retval ret = constructAlpha_helper(pattern, currentType);

			// TODO Remove this mess!!
			// Append alpha memory nodes to the ends of all branches returned from the alpha construction TODO Moved to constructAlpha
			// for (Node n : ret.currentNodes)
			// {
			// AlphaMemoryNode am = new AlphaMemoryNode();
			// n.next.add(am);
			// temp.add(am);
			// }

			// A binding $var that was bound in this object pattern will need to refer to all objects of
			// this type that passed the pattern test. The hashmap containing bindings is thus of the type
			// <String, attributeBindNodes>.
			// if (!ret.toBind.isEmpty())
			// {
			// for (String[] s : ret.toBind)
			// {
			// // Note that there is no redundancy here, since java will pass the reference (by value)
			// // to the abind. So different keys will point to different references, to the same map.
			// attributeBindNodes abind = new attributeBindNodes(s[1], (List<Node>) (List<?>) alphaMemory.getLast());
			// bindings.put(s[0], abind);
			// }
			// }
			type = parser_AST.getChild(1).getChild(++i);
		}

		// constructBeta(parser_AST.getChild(1));
		// String ruleName = parser_AST.getChild(0).toStringTree().substring(10);
		// ruleName = ruleName.substring(0, ruleName.length() - 1);
		// constructTerminal(ruleName);
	}

	/**
	 * @see #constructAlpha_helper
	 */
	private class retval
	{
		List<String[]> toBind;
		// currentNodes holds all nodes that will be used for the next stage of the RETE. For
		// example, a recursive algorithm that needs to branch each node in a graph into two
		// nodes to form a tree of some depth would need to know the currentNodes from which
		// to branch (though in that case currentNodes will have size of 1).
		List<Node> currentNodes;

		public retval()
		{
			toBind = new LinkedList<String[]>();
			currentNodes = new LinkedList<Node>();
		}
	}

	/**
	 * Private helper function to construct the alpha network recursively. This function needs
	 * to return two things: a boolean representing whether or not the conditions could be left
	 * inside the alpha network (true for yes) and a list of bindings that are presumably
	 * referenced later in the rule.
	 **/
	private retval constructAlpha_helper(Tree pattern, List<Node> currentNodes)
	{
		// Return values encapsulated in retval
		retval r = new retval();
		String op = pattern.toString();

		if (op.equals("BREAK"))
		{
			r.currentNodes = currentNodes;
			return r;
		}
		else if (op.equals(",") || op.equals("COMMA"))
		{
			int i = 0;
			retval ret = constructAlpha_helper(pattern.getChild(i), currentNodes);
			// The alpha network can only handle binding-free patterns
			while (!pattern.getChild(i).toString().equals("BREAK"))
			{
				// TODO what if there is only 1? Is that even possible??
				r.toBind.addAll(ret.toBind);
				ret = constructAlpha_helper(pattern.getChild(++i), ret.currentNodes);
			}
			r.currentNodes.addAll(ret.currentNodes);

			// Append alpha memory nodes to the ends of all branches returned from the alpha construction
			LinkedList<AlphaMemoryNode> temp = alphaMemory.getLast();
			for (Node n : r.currentNodes)
			{
				AlphaMemoryNode am = new AlphaMemoryNode();
				n.next.add(am);
				temp.add(am);
			}

			// A binding $var that was bound in this object pattern will need to refer to all objects of
			// this type that passed the pattern test. The hashmap containing bindings is thus of the type
			// <String, attributeBindNodes>.
			if (!r.toBind.isEmpty())
			{
				for (String[] s : r.toBind)
				{
					// Note that there is no redundancy here, since java will pass the reference (by value)
					// to the abind. So different keys will point to different references, to the same map.
					attributeBindNodes abind = new attributeBindNodes(s[1], (List<Node>) (List<?>) temp);
					bindings.put(s[0], abind);
				}
			}

			// The beta network will handle the rest, if there are any left.
			while (++i < pattern.getChildCount())
			{
				constructBeta_helper(pattern.getChild(i), temp);
			}
		}
		else if (op.equals("&&"))
		{
			retval ret = constructAlpha_helper(pattern.getChild(0), currentNodes);
			r.toBind.addAll(ret.toBind);
			ret = constructAlpha_helper(pattern.getChild(1), ret.currentNodes);
			r.toBind.addAll(ret.toBind);
			r.currentNodes.addAll(ret.currentNodes);
		}
		else if (op.equals("||"))
		{
			retval ret = constructAlpha_helper(pattern.getChild(0), currentNodes);
			r.toBind.addAll(ret.toBind);
			r.currentNodes.addAll(ret.currentNodes);
			ret = constructAlpha_helper(pattern.getChild(1), currentNodes);
			r.toBind.addAll(ret.toBind);
			r.currentNodes.addAll(ret.currentNodes);
		}
		else if (op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("=="))
		{
			String attr1 = pattern.getChild(0).toString(), attr2 = pattern.getChild(1).toString();

			// If the attribute being used is not a member of this object, then it should be left to the Beta network.
			// Since variables from other objects are referenced using $var (assuming they have been first bound
			// using $var : attribute), the check is simple and was handled by the grammar.
			if (attr1.equals("$"))
			{
				if (pattern.getChild(0).getChildCount() == 1)
				{
					// TODO No longer possible
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
					// TODO No longer possible
					return r;
				}
				else
				{
					attr2 = pattern.getChild(1).getChild(2).toString();
					r.toBind.add(new String[] { pattern.getChild(1).getChild(0).toString(), pattern.getChild(1).getChild(3).toString() });
				}
			}

			// Now we can proceed
			r.currentNodes.addAll(insertAlpha(pattern, currentNodes));
		}
		return r;
	}

	/**
	 * Adds a beta join node between two beta memory nodes. TODO Probably keep only this??
	 */
	private BetaMemoryNode insertBeta(BetaMemoryNode b1, BetaMemoryNode b2, Tree pattern)
	{
		BetaNode b = new BetaNode(pattern);
		b1.next.add(b);
		b2.next.add(b);
		BetaMemoryNode bm = new BetaMemoryNode();
		b.next.add(bm);
		return bm;
	}

	/**
	 * TODO Obsolete; remove!
	 * Adds a beta join node between a specified alpha memory-beta memory pair.
	 * 
	 * @param mAlpha
	 *            the alpha memory whose elements will be passed through the created beta node.
	 * @param mBeta
	 *            the beta memory whose elements will be passed through the created beta node.
	 */
	private BetaMemoryNode insertBeta(AlphaMemoryNode mAlpha, BetaMemoryNode mBeta)
	{
		BetaNode b = new BetaNode(null);
		mAlpha.next.add(b);
		mBeta.next.add(b);
		BetaMemoryNode bm = new BetaMemoryNode();
		b.next.add(bm);
		return bm;
	}

	/**
	 * TODO Obsolete; remove!
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

		BetaNode b = new BetaNode(null);
		m1.next.add(b);
		m2.next.add(b);
		BetaMemoryNode bm = new BetaMemoryNode();

		// Assume it will be a dangling mem node
		betaMemory.add(bm);
		b.next.add(bm);
		// return bm;
	}

	/**
	 * Private helper function to join two sets of nodes with beta nodes, returning the set
	 * of beta memory nodes created.
	 */
	private List<BetaMemoryNode> joinNodes(List<BetaMemoryNode> currentNodes, List<BetaMemoryNode> otherCurrentNodes, Tree condition)
	{
		// TODO Resolve binding here!!
		resolveBindings(condition);
		List<BetaMemoryNode> newCurrentNodes = new LinkedList<BetaMemoryNode>();
		for (BetaMemoryNode bm1 : currentNodes)
		{
			for (BetaMemoryNode bm2 : otherCurrentNodes)
			{
				BetaMemoryNode bm = insertBeta(bm1, bm2, condition);
				newCurrentNodes.add(bm);
			}
		}
		return newCurrentNodes;
	}

	/**
	 * Private helper function to construct the beta network.
	 */
	private List<BetaMemoryNode> constructBeta_helper(Tree expressionTree, List<? extends Node> currentNodes)
	{
		Set<String> bindUses = getBindUses(expressionTree.toStringTree());

		if (bindUses.size() == 0)
		{
			// base case
			return null;
		}
		if (bindUses.size() == 1)
		{
			// Only 1 bind use, which must already be in the HashMap
			List<BetaMemoryNode> otherCurrentNodes = bindings.get(bindUses.iterator().next()).betaMemoryBindNodes;

			List<BetaMemoryNode> memAdapter = null;
			// "Adapt" AlphaMemoryNodes into BetaMemoryNodes (see RETE algorithm).
			if (currentNodes.get(0) instanceof AlphaMemoryNode)
			{
				memAdapter = new LinkedList<BetaMemoryNode>();
				for (AlphaMemoryNode am : (List<AlphaMemoryNode>) (List<?>) currentNodes)
				{
					BetaMemoryNode bm = new BetaMemoryNode();
					am.next.add(bm);
					memAdapter.add(bm);
				}
			}
			else
			{
				memAdapter = (List<BetaMemoryNode>) (List<?>) currentNodes;
			}

			List<BetaMemoryNode> boundCurrentNodes = joinNodes(memAdapter, otherCurrentNodes, expressionTree);
			return boundCurrentNodes;
		}
		else if (expressionTree.getChildCount() > 1)
		{
			// Recursion: do the children have single bind uses?
			// 1) If one side has no uses, we needn't add beta nodes after those created by
			// the beta nodes of the other side (we simply add the constraints)
			// 2) In the general case, append the beta nodes created by the left side to the
			// beta nodes created by the right side, where those of left side are in turn
			// determined by these two rules applied to that side.
			String op = expressionTree.toString();
			if (op.equals("&&"))
			{
				List<BetaMemoryNode> right;
				List<BetaMemoryNode> left;
				if (getBindUses(expressionTree.getChild(1).toStringTree()).size() > 0)
				{
					// Right side has no bind uses. Leave the whole condition for left.
					left = constructBeta_helper(expressionTree, currentNodes);
				}
				else
				{
					left = constructBeta_helper(expressionTree.getChild(0), currentNodes);
				}
				if (left == null)
				{
					// Left side has no bind uses. We can simply leave the whole condition for right.
					right = constructBeta_helper(expressionTree, currentNodes);
				}
				else
				{
					right = constructBeta_helper(expressionTree.getChild(1), left);
				}
				return right;
			}
			else if (op.equals("||"))
			{
				List<BetaMemoryNode> left = constructBeta_helper(expressionTree.getChild(0), currentNodes);
				List<BetaMemoryNode> right;
				if (left == null)
				{
					// Append left's conditions to right and return right's nodes.
					right = constructBeta_helper(expressionTree, currentNodes);
				}
				else
				{
					right = constructBeta_helper(expressionTree.getChild(1), currentNodes);
				}
				left.addAll(right); // we need to return the list of all currentNodes
				return left;
			}
			else if (op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("=="))
			{
				// The way the language is defined we cannot have $v1 op $v2, with both being bindings.
				// This branch will never be reached.
				return null;
			}
			else
			{
				return null;
			}
		}
		else
		{
			// TODO Only one child node but multiple uses?? Impossible! This branch will never be reached.
			return null;
		}
	}

	/**
	 * Private helper function to construct beta network. TODO REMOVE THIS!!
	 */
	public void constructBeta(Tree objectPatternList)
	{
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

		// Now go through the tree to find those expressions that used bindings, then use beta nodes
		// where needed.
		for (int i = 0; i < objectPatternList.getChildCount(); i++)
		{
			// List<String> bindUses;

			// Get the first object
			Tree objectPattern = objectPatternList.getChild(i);
			if (objectPattern.getChild(0).toString().equals(","))
			{
				// Cycle through the comma-separated expressions for this object until you find the BREAK node.
				// All nodes after that are patterns using bindings.
				int j = 0;
				Tree t = objectPattern.getChild(0).getChild(0);

				// Skip ahead to the patterns that use at least 1 binding
				while (!t.toString().equals("BREAK"))
				{
					j++;
					t = objectPattern.getChild(0).getChild(j);
				}
				// Loop through known bind-users
				for (int k = j + 1; k < objectPattern.getChild(0).getChildCount(); k++)
				{
					String expression = objectPattern.getChild(0).getChild(k).toStringTree();

					// We can quickly scan the expression's toStringTree() to get the number of
					// different bindings (hence the use of Set instead of List).
					Set<String> bindUses = getBindUses(expression);
					if (bindUses.size() == 1)
					{
						// There is only 1 bind use, so we can create the necessary beta node

					}
				}
			}
		}
	}

	/**
	 * TODO This function is no longer needed and should be removed??
	 * Private helper function to get all bind uses in an expression.
	 * 
	 * @param expression
	 *            the string representation of the expression to be checked.
	 * @return a set of all unique bindings used in expression.
	 */
	private Set<String> getBindUses(String expression)
	{
		Set<String> bindUses = new HashSet<String>();
		// Search for a possible bind-use
		int i = expression.indexOf('$');
		while (i != -1)
		{
			int j = i;

			// Is it a bind-use ($ var) or a binding ($ var : attribute)
			for (j = i; expression.charAt(j) != ')'; j++)
			{
				if (expression.charAt(j) == ':')
				{
					// ':' beat the ')' --> not a bind use
					break;
				}
			}

			if (expression.charAt(j) == ')')
			{
				bindUses.add(expression.substring(i + 2, j));
				expression = expression.substring(j + 1);
			}
			i = expression.indexOf('$');
		}
		return bindUses;
	}

	/**
	 * Private helper function that resolves a pattern's bindings using the hashmap bindings.
	 * Only call this function when bindings are known to be in this map; unresolved bindings
	 * will be skipped, but the rest will still be changed.
	 */
	private void resolveBindings(Tree pattern)
	{
		if (pattern.toString().equals("$"))
		{
			// It's a bind use if it has only 1 child: ($ var) as opposed to ($ var : attribute)
			if (pattern.getChildCount() == 1)
			{
				// Lookup hashmap bindings to determine if the binding is known
				attributeBindNodes abind = bindings.get(pattern.getChild(0).toString());
				if (abind != null)
				{
					// pattern.set abind.attribute; TODO Set it to the attribute
				}
			}
		}
		else if (pattern.getChildCount() > 0)
		{
			// Either && or ||
			resolveBindings(pattern.getChild(0));
			resolveBindings(pattern.getChild(1));
		}
		else
		{
			// No bind uses here
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
		public AlphaNode(Tree condition)
		{
			this.condition = condition;
		}

		public String getLabel()
		{
			return condition.toStringTree();
		}

		private Tree condition;
	}

	public class BetaNode extends Node
	{
		public BetaNode(Tree pattern)
		{
			this.pattern = pattern;
		}
		public String getLabel()
		{
			return pattern.toStringTree();
		}

		private Tree pattern;
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
	private List<BetaMemoryNode> betaMemory;

	/**
	 * A map containing all variable bindings encoutered so far. Each string is mapped to an object of type
	 * attributeBindNode, which can be used to determine both the alphaMemoryNodes for the object that made
	 * that binding, as well as the specific attribute of that object that was bind.
	 * 
	 * @see #attributeBindNodes
	 */
	private HashMap<String, attributeBindNodes> bindings;

	/**
	 * A list of lists (one list per object in the LHS) of the nodes terminating an object's RETE due to
	 * unresolved bindings. These toBeta nodes would have to be picked up again (TODO) when the bindings
	 * hashmap contains the needed bindings.
	 */
	private List<List<Node>> toBeta;
}
