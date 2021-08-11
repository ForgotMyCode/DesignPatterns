package designPatterns.creationalPatterns.abstractFactory.products.artDeco;

import designPatterns.creationalPatterns.abstractFactory.products.IChair;

public class ArtDecoChair implements IChair {

	@Override
	public void sitOn() {
		System.out.println("Sitting on art deco chair.");
	}

}
