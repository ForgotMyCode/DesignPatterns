package designPatterns.creationalPatterns.abstractFactory.factory;

import designPatterns.creationalPatterns.abstractFactory.products.IChair;
import designPatterns.creationalPatterns.abstractFactory.products.ISofa;
import designPatterns.creationalPatterns.abstractFactory.products.ITable;
import designPatterns.creationalPatterns.abstractFactory.products.artDeco.ArtDecoChair;
import designPatterns.creationalPatterns.abstractFactory.products.artDeco.ArtDecoSofa;
import designPatterns.creationalPatterns.abstractFactory.products.artDeco.ArtDecoTable;

public class ArtDecoFactory implements IFactory {

	@Override
	public IChair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public ISofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public ITable createTable() {
		return new ArtDecoTable();
	}

}
