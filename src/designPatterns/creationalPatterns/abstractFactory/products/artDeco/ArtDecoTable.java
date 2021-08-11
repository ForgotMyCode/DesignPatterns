package designPatterns.creationalPatterns.abstractFactory.products.artDeco;

import designPatterns.creationalPatterns.abstractFactory.products.ITable;

public class ArtDecoTable implements ITable {

	@Override
	public void putYourFeetOn() {
		System.out.println("Putting your feet on art deco table");
	}

}
