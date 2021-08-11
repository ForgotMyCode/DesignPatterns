package designPatterns.creationalPatterns.abstractFactory.products.victorian;

import designPatterns.creationalPatterns.abstractFactory.products.ITable;

public class VictorianTable implements ITable {

	@Override
	public void putYourFeetOn() {
		System.out.println("Putting your feet on victorian table");
	}

}
