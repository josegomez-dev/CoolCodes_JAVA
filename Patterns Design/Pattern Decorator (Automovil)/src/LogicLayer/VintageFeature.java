package LogicLayer;

public class VintageFeature extends VehicleDecorator {

	
	public VintageFeature(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public void accel() {
		System.out.println("-> Cool");
		getVehicle().accel();
	}

	@Override
	public void start() {
		System.out.println(" *** ON *** Fire");
		getVehicle().start();
	}

	@Override
	public void stop() {
		System.out.println(" *** OFF *** Vintage");
		getVehicle().stop();
	}
	
}
