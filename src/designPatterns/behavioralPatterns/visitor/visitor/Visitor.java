package designPatterns.behavioralPatterns.visitor.visitor;

public interface Visitor {

	public void visit(SomeObject someObject);
	
	public void visit(SomeParent someParent);
	
}
