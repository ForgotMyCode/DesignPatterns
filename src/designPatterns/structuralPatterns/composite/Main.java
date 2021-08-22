package designPatterns.structuralPatterns.composite;

import designPatterns.structuralPatterns.composite.composite.HierarchyInnerNode;
import designPatterns.structuralPatterns.composite.composite.HierarchyLeafNode;
import designPatterns.structuralPatterns.composite.composite.HierarchyNode;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Way of storing objects in tree-like hierarchy.
 *
 */
public class Main {

	public static void main(String[] args) {
		final HierarchyNode hierarchy = new HierarchyInnerNode("Root",
			new HierarchyInnerNode("RootD1",
				new HierarchyLeafNode("Leaf1"), new HierarchyLeafNode("Leaf2"), new HierarchyLeafNode("Leaf3")
			),
			new HierarchyLeafNode("Leaf4"),
			new HierarchyInnerNode("RootD2", new HierarchyLeafNode("Leaf5"))
		);
		
		System.out.println(hierarchy.getName());
	}

}
