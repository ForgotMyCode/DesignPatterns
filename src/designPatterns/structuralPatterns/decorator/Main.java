package designPatterns.structuralPatterns.decorator;

import designPatterns.structuralPatterns.decorator.decorator.DoorOpener;
import designPatterns.structuralPatterns.decorator.decorator.DoorOpenerDecorator;
import designPatterns.structuralPatterns.decorator.decorator.DoorType;
import designPatterns.structuralPatterns.decorator.decorator.FingerprintDoorOpener;
import designPatterns.structuralPatterns.decorator.decorator.IOpener;
import designPatterns.structuralPatterns.decorator.decorator.LockedDoorOpener;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Adds functionality to existing object without modifying it. Wrapper.
 * Decorator takes original object as an argument, implements the same interface.
 * Decorator's overriden method call original method of the wrapped object (+ some extra functionality).
 *
 */
public class Main {

	public static void main(String[] args) {
		IOpener doorOpener = new DoorOpenerDecorator(
			new FingerprintDoorOpener(
				new LockedDoorOpener(
					new DoorOpener(DoorType.WOODEN)
				)
			)
		);
		
		doorOpener.open();
	}

}
