package designPatterns.behavioralPatterns.visitor;

import designPatterns.behavioralPatterns.visitor.visitor.ConcreteVisitor;
import designPatterns.behavioralPatterns.visitor.visitor.MyObject;
import designPatterns.behavioralPatterns.visitor.visitor.SomeObject;
import designPatterns.behavioralPatterns.visitor.visitor.SomeParent;
import designPatterns.behavioralPatterns.visitor.visitor.Visitor;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Separates algorithm from object structure - easy to add new operations without modification of existing structures.
 * Visited objects implement the {@code accept} method, with {@code visitor} argument, which calls {@code visitor.visit(this)}.
 * The {@code visit} function is polymorphic. The {@code accept} method can also call {@code accept} on its descendants.
 *
 */
public class Main {

	public static void main(String[] args) {
		final MyObject objects = new SomeParent(
			new SomeObject(),
			new SomeObject(),
			new SomeParent(
				new SomeObject(),
				new SomeObject()
			),
			new SomeObject()
		);
		
		final Visitor visitor = new ConcreteVisitor();
		
		objects.accept(visitor);
	}

}
