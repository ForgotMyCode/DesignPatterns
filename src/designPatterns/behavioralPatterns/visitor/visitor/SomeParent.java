package designPatterns.behavioralPatterns.visitor.visitor;

public class SomeParent implements MyObject {

	private MyObject[] descendants;
	
	public SomeParent(MyObject... descentants) {
		this.descendants = descentants;
	}

	@Override
	public void accept(Visitor visitor) {
		for(final MyObject descendant : descendants) {
			descendant.accept(visitor);
		}
		
		visitor.visit(this);
	}
}
