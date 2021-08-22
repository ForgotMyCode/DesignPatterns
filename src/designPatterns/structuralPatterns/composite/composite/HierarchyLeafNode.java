package designPatterns.structuralPatterns.composite.composite;

public class HierarchyLeafNode implements HierarchyNode {
	
	private String name;

	public HierarchyLeafNode(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
}
