package designPatterns.creationalPatterns.abstractFactory.products.victorian;

import designPatterns.creationalPatterns.abstractFactory.products.ISofa;

public class VictorianSofa implements ISofa {

	@Override
	public void lieOn() {
		System.out.println("Lying on victorian sofa.");
	}

}
