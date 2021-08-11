package designPatterns.creationalPatterns.factory.factory;

import designPatterns.creationalPatterns.factory.vehicle.IVehicle;

public abstract class VehicleTransport {	
	
	public abstract IVehicle createVehicle();
	
	public void makeTransport() {
		IVehicle transportVehicle = createVehicle();
		transportVehicle.transport();
	}
	
}
