package designPatterns.creationalPatterns.abstractFactory.factory;

import designPatterns.creationalPatterns.abstractFactory.products.IChair;
import designPatterns.creationalPatterns.abstractFactory.products.ISofa;
import designPatterns.creationalPatterns.abstractFactory.products.ITable;
import designPatterns.creationalPatterns.abstractFactory.products.modern.ModernChair;
import designPatterns.creationalPatterns.abstractFactory.products.modern.ModernSofa;
import designPatterns.creationalPatterns.abstractFactory.products.modern.ModernTable;

public class ModernFactory implements IFactory {

	@Override
	public IChair createChair() {
		return new ModernChair();
	}

	@Override
	public ISofa createSofa() {
		return new ModernSofa();
	}

	@Override
	public ITable createTable() {
		return new ModernTable();
	}

}
