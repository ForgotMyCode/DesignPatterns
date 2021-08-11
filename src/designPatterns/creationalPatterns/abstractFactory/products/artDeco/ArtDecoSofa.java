package designPatterns.creationalPatterns.abstractFactory.products.artDeco;

import designPatterns.creationalPatterns.abstractFactory.products.ISofa;

public class ArtDecoSofa implements ISofa {

	@Override
	public void lieOn() {
		System.out.println("Lying on art deco sofa.");
	}

}
