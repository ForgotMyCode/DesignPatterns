package designPatterns.behavioralPatterns.visitor.visitor;

public class SomeObject implements MyObject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
