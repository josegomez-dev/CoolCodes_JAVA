package IU;

import LogicLayer.ElectricFeature;
import LogicLayer.SportCar;
import LogicLayer.Vehicle;
import LogicLayer.VintageFeature;

public class Main {

	public static void main(String[] args) {

		Vehicle v = new SportCar("Supra");
		//v = new ElectricFeature(v); // Implement Decorator Pattern
		v = new VintageFeature(v); // Implement Decorator Pattern
		
		v.start();
		v.accel();
		v.stop();
		
	}

}
