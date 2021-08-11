package designPatterns.creationalPatterns.factory.vehicle;

public class Car implements IVehicle {

	@Override
	public void transport() {
		System.out.println("Car transport.");
	}

}
