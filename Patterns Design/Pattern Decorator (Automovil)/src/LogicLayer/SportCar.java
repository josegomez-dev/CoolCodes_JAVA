package LogicLayer;

public class SportCar implements Vehicle{

	private String name;
	
	public SportCar(String name){
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void accel() {
		System.out.println("The car is speeding up\n");
	}

	@Override
	public void start() {
		System.out.println("Start vehicle\n");
	}

	@Override
	public void stop() {
		System.out.println("Stop vehicle\n");
	}

}
