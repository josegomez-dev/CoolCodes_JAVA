package LogicLayer;

public abstract class VehicleDecorator implements Vehicle {

	private Vehicle vehicle;
	
	public VehicleDecorator(Vehicle vehicle){
		setVehicle(vehicle);
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
