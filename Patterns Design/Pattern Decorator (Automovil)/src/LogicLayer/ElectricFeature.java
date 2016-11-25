package LogicLayer;
public class ElectricFeature extends VehicleDecorator{

	// WRAPPER CLASS
	
	public ElectricFeature(Vehicle vehicle){
		super(vehicle);
	}
	
	@Override
	public void accel() {
		System.out.println(" -> Electric Feature");
		getVehicle().accel();
	}

	@Override
	public void start() {
		System.out.println(" *** ON *** OS OperatingSystem");
		getVehicle().start();
	}

	@Override
	public void stop() {
		System.out.println(" *** OFF *** OS OperationSystem");
		getVehicle().stop();
	}

}
