package engine;

import java.util.LinkedList;

/**
 * This is a direct implementation of the RETE algorithm (see the paper referenced in the manual for details).
 * @author Hani Audah
 */
public class RETE {
	public RETE() {
		root = new RootNode();
		root.next = new LinkedList<TypeNode>();
	}
	public void insertType(String type) {
		TypeNode tNode = new TypeNode(type);
		root.next.add(tNode);
	}
	/**
	 * The root node is the first node any inserted objects must go through. It imposes no constraints. It's only
	 * use is to pass the nodes forward to the rest of the RETE.
	 */
	public static class RootNode {
		LinkedList<TypeNode> next;
	}
	/**
	 * TypeNodes check if incoming objects satisfy type requirements. They are thus the first nodes in the RETE
	 * following the root.
	 */
	public class TypeNode {
		LinkedList<AlphaNode> next;
		
		public TypeNode(String type) {
			this.type = type;
		}
		private String type;
	}
	/**
	 * AlphaNodes impose single-object constraints, that is, constraints that can be evaluated independently of
	 * any other objects previously inserted.
	 */
	public class AlphaNode {
		LinkedList<BetaNode> next;
	}
	public class BetaNode {
		
	}
	public class Terminal {
		
	}
	
	private RootNode root;
}
