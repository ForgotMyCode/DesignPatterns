package designPatterns.creationalPatterns.factory.vehicle;

public class Train implements IVehicle {

	@Override
	public void transport() {
		System.out.println("Train transport.");
	}

}
