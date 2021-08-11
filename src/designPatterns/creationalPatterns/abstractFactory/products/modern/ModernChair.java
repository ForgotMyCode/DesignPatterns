package designPatterns.creationalPatterns.abstractFactory.products.modern;

import designPatterns.creationalPatterns.abstractFactory.products.IChair;

public class ModernChair implements IChair {

	@Override
	public void sitOn() {
		System.out.println("Sitting on modern chair.");
	}

}
