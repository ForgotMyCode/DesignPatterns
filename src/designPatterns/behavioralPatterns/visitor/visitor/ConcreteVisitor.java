package designPatterns.behavioralPatterns.visitor.visitor;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(SomeObject someObject) {
		System.out.println("Visiting some object!");
	}

	@Override
	public void visit(SomeParent someParent) {
		System.out.println("Visiting some parent!");
	}

}
