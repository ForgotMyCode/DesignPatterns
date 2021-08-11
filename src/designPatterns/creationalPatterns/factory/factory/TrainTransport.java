package designPatterns.creationalPatterns.factory.factory;

import designPatterns.creationalPatterns.factory.vehicle.Train;
import designPatterns.creationalPatterns.factory.vehicle.IVehicle;

public class TrainTransport extends VehicleTransport {

	@Override
	public IVehicle createVehicle() {
		return new Train();
	}

}
