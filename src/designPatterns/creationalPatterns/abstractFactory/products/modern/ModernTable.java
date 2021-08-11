package designPatterns.creationalPatterns.abstractFactory.products.modern;

import designPatterns.creationalPatterns.abstractFactory.products.ITable;

public class ModernTable implements ITable {

	@Override
	public void putYourFeetOn() {
		System.out.println("Putting your feet on modern table");
	}

}
