package designPatterns.creationalPatterns.factory.factory;

import designPatterns.creationalPatterns.factory.vehicle.Car;
import designPatterns.creationalPatterns.factory.vehicle.IVehicle;

public class CarTransport extends VehicleTransport {

	@Override
	public IVehicle createVehicle() {
		return new Car();
	}

}
