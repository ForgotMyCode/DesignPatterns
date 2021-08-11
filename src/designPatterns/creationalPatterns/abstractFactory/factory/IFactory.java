package designPatterns.creationalPatterns.abstractFactory.factory;

import designPatterns.creationalPatterns.abstractFactory.products.IChair;
import designPatterns.creationalPatterns.abstractFactory.products.ISofa;
import designPatterns.creationalPatterns.abstractFactory.products.ITable;

public interface IFactory {
	
	IChair createChair();
	
	ISofa createSofa();
	
	ITable createTable();
}
