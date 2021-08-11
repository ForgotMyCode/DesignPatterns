package designPatterns.creationalPatterns.abstractFactory.products.victorian;

import designPatterns.creationalPatterns.abstractFactory.products.IChair;

public class VictorianChair implements IChair {

	@Override
	public void sitOn() {
		System.out.println("Sitting on victorian chair.");
	}

}
