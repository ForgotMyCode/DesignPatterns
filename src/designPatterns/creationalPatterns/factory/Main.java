package designPatterns.creationalPatterns.factory;

import designPatterns.creationalPatterns.factory.factory.CarTransport;
import designPatterns.creationalPatterns.factory.factory.TrainTransport;
import designPatterns.creationalPatterns.factory.factory.VehicleTransport;

/**
 * 
 * @author ForgotMyCode
 * @implSpec Replaces {@code new} operator with factory method. Factory is abstract, concrete factories create different (also abstract) products. 
 * The factory can have concrete methods. It may not even expose the products is creates, as the logic may be contained within.
 * 
 */
public class Main {

	public enum PreferredVehicle {
		CAR,
		TRAIN
	}
	
	public static void main(String[] args) {
		// change this variable to produce different vehicles
		final PreferredVehicle preferredVehicle = PreferredVehicle.TRAIN;
		
		VehicleTransport myVehicleTransport = null;
		// pick a factory by user's preference
		switch(preferredVehicle) {
		case CAR:
			myVehicleTransport = new CarTransport();
			break;
		case TRAIN:
			myVehicleTransport = new TrainTransport();
			break;
		default:
			System.err.println("! Invalid vehicle.");
		}
		
		if(myVehicleTransport != null) {
			// enjoy your transport
			myVehicleTransport.makeTransport();
		} else {
			System.err.println("There is no factory!");
		}
	}

}
