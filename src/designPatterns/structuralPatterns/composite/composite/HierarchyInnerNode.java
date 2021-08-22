package designPatterns.structuralPatterns.composite.composite;

import java.util.ArrayList;
import java.util.List;

public class HierarchyInnerNode extends HierarchyLeafNode {
	
	private List<HierarchyNode> descendants;
	
	public HierarchyInnerNode(String name, HierarchyNode... hierarchyNodes) {
		super(name);
		
		this.descendants = new ArrayList<>();
		
		for(final HierarchyNode hierarchyNode : hierarchyNodes) {
			this.descendants.add(hierarchyNode);
		}
	}
	
	@Override
	public String getName() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		

		sb.append("\nhas Descendants: \n");
		
		for(final HierarchyNode hierarchyNode : this.descendants) {
			sb.append(hierarchyNode.getName());
			sb.append("\n");
		}
		
		sb.append("--- END --- \n");
		
		return sb.toString();
	}

}
