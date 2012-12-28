/**
 * 
 */
package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Stack;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

/**
 * @author Hani Audah
 * The purpose of this class is to print a crude graphical representation of the invoking RETE
 */
public class RETE_printer
{
	public static final Object lock = new Object();
	public static boolean monitorState = false;
	private Drawer frame;
	
	//The current depth when drawing the RETE nodes
	private int drawerLevel = 0;
	//The number of nodes already drawn on each depth
	private int drawnNodes[];
	
	//This stack serves the same purpose as when building the RETE
	Stack<Object> vertices;
	
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
			super("Alpha Network");
		}
		
		public Object insertNode(String label, int x, int y)
		{
			Object parent = graph.getDefaultParent();
			Object v;
			
			graph.getModel().beginUpdate();
			try
			{
				v = graph.insertVertex(parent, null, label, x, y, 80, 30);
			}
			finally
			{
				graph.getModel().endUpdate();
			}
			
			getContentPane().removeAll();
			mxGraphComponent graphComponent = new mxGraphComponent(graph);
			getContentPane().add(graphComponent);
			frame.setVisible(true);

			return v;
		}
		
		public void insertEdge(Object v1, Object v2)
		{
			if (v1 == null || v2 == null)
				return;
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
			getContentPane().add(graphComponent);
			frame.setVisible(true);
		}
	}
	
	/**
	 * Adds a JFrame (window) that will hold the RETE graph, and returns the thread running this JFrame
	 * @return the thread running the new JFrame
	 */
	public Thread openWindow()
	{
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize(640, 480);
		frame.setVisible(true);
		
		Thread t = new Thread() {
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
		frame.addWindowListener(new WindowAdapter() {
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
	
	public void insertNode(String label)
	{
		//Using the current drawerLevel and the number of nodes already drawn
		//in this level, we can get exactly where we need to add the node
		int y = 20 + 50*drawnNodes[drawerLevel];
		int x = 20 + 130*drawerLevel;
		Object new_v = frame.insertNode(label, x, y);
		if (!vertices.isEmpty())
			frame.insertEdge(vertices.peek(), new_v);
		
		vertices.push(new_v);
		drawnNodes[drawerLevel]++;
		drawerLevel++;
	}
	
	public void back()
	{
		vertices.pop();
		drawerLevel--;
	}
}
