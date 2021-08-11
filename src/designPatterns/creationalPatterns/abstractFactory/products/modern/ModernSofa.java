package designPatterns.creationalPatterns.abstractFactory.products.modern;

import designPatterns.creationalPatterns.abstractFactory.products.ISofa;

public class ModernSofa implements ISofa {

	@Override
	public void lieOn() {
		System.out.println("Lying on modern sofa.");
	}

}
