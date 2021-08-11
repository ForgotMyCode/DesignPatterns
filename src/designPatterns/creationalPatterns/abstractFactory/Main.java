package designPatterns.creationalPatterns.abstractFactory;

import designPatterns.creationalPatterns.abstractFactory.factory.ArtDecoFactory;
import designPatterns.creationalPatterns.abstractFactory.factory.IFactory;
import designPatterns.creationalPatterns.abstractFactory.factory.ModernFactory;
import designPatterns.creationalPatterns.abstractFactory.factory.VictorianFactory;
import designPatterns.creationalPatterns.abstractFactory.products.IChair;
import designPatterns.creationalPatterns.abstractFactory.products.ISofa;
import designPatterns.creationalPatterns.abstractFactory.products.ITable;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Replaces {@code new} operator with factory method. Factory is abstract, concrete factories create different (also abstract) products.
 * The factory is now fully abstract. Different factories create different "kinds" of products (whole families).
 * 
 */
public class Main {

	public enum PreferredStyle {
		ART_DECO,
		MODERN,
		VICTORIAN
	}
	
	public static void main(String[] args) {
		// change this variable to select your preferred style of furniture
		PreferredStyle preferredStyle = PreferredStyle.VICTORIAN;
		
		IFactory myFactory = null;
		// create the factory by user's preference
		switch(preferredStyle) {
		case ART_DECO:
			myFactory = new ArtDecoFactory();
			break;
		case MODERN:
			myFactory = new ModernFactory();
			break;
		case VICTORIAN:
			myFactory = new VictorianFactory();
			break;
		default:
			System.err.println("! Invalid factory.");	
		}
		
		if(myFactory != null) {
			// create the furniture
			IChair chair = myFactory.createChair();
			ISofa sofa = myFactory.createSofa();
			ITable table = myFactory.createTable();
			
			// enjoy the furniture
			chair.sitOn();
			sofa.lieOn();
			table.putYourFeetOn();
		} else {
			System.err.println("! Factory does not exist.");
		}
	}

}
