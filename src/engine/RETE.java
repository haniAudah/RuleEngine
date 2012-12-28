package engine;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.JFrame;

import gui.RETE_printer;

/**
 * This is a direct implementation of the RETE algorithm (see the paper referenced in the manual for details).
 * @author Hani Audah
 */
public class RETE
{
	public RETE()
	{
		root = new RootNode();
		root.next = new LinkedList<Node>();
		newNodes = new LinkedList<Node>();
		currentNodes = new Stack<LinkedList<Node>>();
		currentNodes.push(new LinkedList<Node>());
	}
	
	/**
	 * Adds a TypeNode to the RETE
	 * @param type the name of the type to be added
	 */
	public void insertType(String type)
	{
		TypeNode tNode = new TypeNode(type);
		root.next.add(tNode);
		//New TypeNodes are automatically added to the currentNodes
		//currentNodes.peek().add(tNode);
		LinkedList<Node> temp = new LinkedList<Node>();
		temp.add(tNode);
		currentNodes.push(temp);
	}
	
	/**
	 * Adds an AlphaNode to the RETE that checks for a condition (determined by the parameter).
	 * @param condition represents the condition to be checked by this alpha node. 
	 */
	public void insertAlpha(String condition, String args[])
	{
		AlphaNode aNode = new AlphaNode(condition, args);
		for (Node n : currentNodes.peek())
		{
			n.next.add(aNode);
		}
		newNodes.add(aNode);
	}
	
	/**
	 * TODO Do you still need this?
	 * Needed during RETE construction. It is the responsibility of the KnowledgeBuilder to clear the stack when
	 * necessary, or to apply all the necessary currentNodes manipulations below.
	 * @see #currentNodes
	 */
	public void emptyCurrentStack()
	{
		currentNodes.empty();
	}
	
	/**
	 * Pushes the set of newNodes onto the stack of currentNodes.
	 */
	public void push()
	{
		currentNodes.push(newNodes);
		newNodes = new LinkedList<Node>();
	}
	
	/**
	 * Pops the stack of currentNodes.
	 */
	public void pop()
	{
		currentNodes.pop();
	}
	
	/**
	 * This function is used to print the graphical representation of the RETE on a new window.
	 */
	public void print()
	{
		RETE_printer p = new RETE_printer();
		Thread t = p.openWindow();
		
		//TODO Walk through the rest of the graph, passing nodes to be printed
		print_helper(root, p);
		try
		{
			t.join();
		}
		catch (InterruptedException e)
		{
		}
	}
	
	private void print_helper(Node current, RETE_printer p)
	{
		p.insertNode(current.getLabel());
		for (Node n : current.next)
		{
			print_helper(n, p);
		}
		p.back();
	}
	
	/**
	 * The root node is the first node any inserted objects must go through. It imposes no constraints. It's only
	 * use is to pass the nodes forward to its connected nodes.
	 */
	public class RootNode extends Node
	{
		public String getLabel()
		{
			return "root";
		}
	}
	
	/**
	 * TypeNodes check if incoming objects satisfy type requirements. They are thus the first nodes in the RETE
	 * following the root.
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
	 * AlphaNodes impose single-object constraints, that is, constraints that can be evaluated independently of
	 * any other objects previously inserted.
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
			return null;
		}
	}
	public class TerminalNode extends Node
	{
		public String getLabel()
		{
			return "Terminal";
		}
	}
	public abstract class Node
	{
		public LinkedList<Node> next;
		
		public Node()
		{
			next = new LinkedList<Node>();
		}
		
		/**
		 * Returns a label to be used on Nodes in the graphical represenation of the rete
		 * @return the node label
		 */
		public abstract String getLabel();
	}
	
	public RootNode root;
	/**
	 * TODO
	 * currentNodes is needed when constructing the RETE. It is assumed that the RETE is constructed once and cannot
	 * be modified later, so no method to randomly insert nodes into the RETE is needed, only one to insert a new
	 * node, and a stack of elements to be linked to this node.
	 * @see knowledge.KnowledgeBuilder#getRETE()
	 */
	private Stack<LinkedList<Node>> currentNodes;
	private LinkedList<Node> newNodes;
}
