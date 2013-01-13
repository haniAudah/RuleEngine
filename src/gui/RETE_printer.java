package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

/**
 * The purpose of this class is to print a crude graphical representation of the invoking RETE.
 * 
 * @author Hani Audah
 */
public class RETE_printer
{
	public RETE_printer()
	{
		frame = new Drawer();
		drawnNodes = new int[100];
		vertices = new Stack<Object>();
	}

	public class Drawer extends JFrame
	{
		private static final long serialVersionUID = 1L;
		private final mxGraph graph = new mxGraph();

		public Drawer()
		{
			super("RETE Network");
			graph.setAllowDanglingEdges(false);
			graph.setConnectableEdges(false);
		}

		public Object insertNode(String label, int drawerLevel)
		{
			int y = 20 + 50 * drawnNodes[drawerLevel];
			int x = 20 + 130 * drawerLevel;

			Object parent = graph.getDefaultParent();
			Object v;

			graph.getModel().beginUpdate();
			try
			{
				v = graph.insertVertex(parent, null, label, x, y, 80, 30, "fillColor=white");
			}
			finally
			{
				graph.getModel().endUpdate();
			}

			getContentPane().removeAll();
			mxGraphComponent graphComponent = new mxGraphComponent(graph);
			graphComponent.setConnectable(false);
			getContentPane().add(graphComponent);
			frame.setVisible(true);

			return v;
		}

		public void insertEdge(Object v1, Object v2)
		{
			if (v1 == null || v2 == null)
			{
				return;
			}

			Object parent = graph.getDefaultParent();

			graph.getModel().beginUpdate();
			try
			{
				graph.insertEdge(parent, null, null, v1, v2);
			}
			finally
			{
				graph.getModel().endUpdate();
			}

			getContentPane().removeAll();
			mxGraphComponent graphComponent = new mxGraphComponent(graph);
			graphComponent.setConnectable(false);
			getContentPane().add(graphComponent);
			frame.setVisible(true);
		}

		public void highlightNodes(Object node)
		{
			graph.getModel().beginUpdate();
			try
			{
				graph.getModel().setStyle(node, "fillColor=green");
			}
			finally
			{
				graph.getModel().endUpdate();
			}

			getContentPane().removeAll();
			mxGraphComponent graphComponent = new mxGraphComponent(graph);
			graphComponent.setConnectable(false);
			getContentPane().add(graphComponent);
			frame.setVisible(true);
		}

		public void unhighlightNodes(Object node)
		{
			graph.getModel().beginUpdate();
			try
			{
				graph.getModel().setStyle(node, "fillColor=white");
			}
			finally
			{
				graph.getModel().endUpdate();
			}

			getContentPane().removeAll();
			mxGraphComponent graphComponent = new mxGraphComponent(graph);
			graphComponent.setConnectable(false);
			getContentPane().add(graphComponent);
			frame.setVisible(true);
		}
	}

	public void insertNode(String label)
	{
		// Using the current drawerLevel and the number of nodes already drawn
		// in this level, we can get exactly where we need to add the node
		Object new_v = frame.insertNode(label, drawerLevel);
		drawnNodes[drawerLevel]++;
		drawerLevel++;
		if (!vertices.isEmpty())
		{
			frame.insertEdge(vertices.peek(), new_v);
		}

		vertices.push(new_v);
	}

	/**
	 * BetaNodes need to be inserted using insertBeta, since a reference needs
	 * to be kept to each beta node so that the other input will be mapped to
	 * the same node. Newly inserted nodes are added to an array and the index
	 * of node will be inserted to a Map referenced by the beta node's unique
	 * id. The next time this id is encountered, only the required edge is
	 * added.
	 * 
	 * @param id the unique id of the node being inserted.
	 * @return true if the beta node was already added previously, and false otherwise.
	 */
	public boolean insertBeta(String label, int id)
	{
		frame.highlightNodes(vertices.peek());
		if (betaMap.containsKey(id))
		{
			Object beta = betaMap.get(id);
			if (!vertices.isEmpty())
			{
				frame.insertEdge(vertices.peek(), beta);
			}
			frame.unhighlightNodes(vertices.peek());
			return true;
		}

		// same as insertNode
		frame.unhighlightNodes(vertices.peek());
		Object beta = frame.insertNode(label, drawerLevel);
		drawnNodes[drawerLevel]++;
		drawerLevel++;

		if (!vertices.isEmpty())
		{
			frame.insertEdge(vertices.peek(), beta);
		}

		betaMap.put(id, beta);

		vertices.push(beta);

		return false;
	}

	/**
	 * Goes back one level above the current tree depth while drawing the RETE.
	 */
	public void back()
	{
		vertices.pop();
		drawerLevel--;
	}

	/**
	 * Adds a JFrame (window) that will hold the RETE graph, and returns the
	 * thread running this JFrame
	 * 
	 * @return the thread running the new JFrame
	 */
	public Thread openWindow()
	{
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize(640, 480);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		Thread t = new Thread()
		{
			public void run()
			{
				synchronized (lock)
				{
					while (frame.isVisible())
					{
						try
						{
							lock.wait();
						}
						catch (InterruptedException e)
						{
						}
					}
				}
			}
		};

		t.start();
		frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent arg0)
			{
				synchronized (lock)
				{
					frame.setVisible(false);
					lock.notify();
				}
			}
		});

		return t;
	}

	private static final Object lock = new Object();
	private Drawer frame;

	// The current depth when drawing the RETE nodes
	private int drawerLevel = 0;
	// The number of nodes already drawn on each depth
	private int drawnNodes[];

	// This stack serves the same purpose as when building the RETE
	public Stack<Object> vertices;

	// A map of beta nodes previously added, indexed by their unique ids.
	private HashMap<Integer, Object> betaMap = new HashMap<Integer, Object>();
}
