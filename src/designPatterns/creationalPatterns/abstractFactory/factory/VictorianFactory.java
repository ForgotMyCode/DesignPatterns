package designPatterns.creationalPatterns.abstractFactory.factory;

import designPatterns.creationalPatterns.abstractFactory.products.IChair;
import designPatterns.creationalPatterns.abstractFactory.products.ISofa;
import designPatterns.creationalPatterns.abstractFactory.products.ITable;
import designPatterns.creationalPatterns.abstractFactory.products.victorian.VictorianChair;
import designPatterns.creationalPatterns.abstractFactory.products.victorian.VictorianSofa;
import designPatterns.creationalPatterns.abstractFactory.products.victorian.VictorianTable;

public class VictorianFactory implements IFactory {

	@Override
	public IChair createChair() {
		return new VictorianChair();
	}

	@Override
	public ISofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public ITable createTable() {
		return new VictorianTable();
	}

}
