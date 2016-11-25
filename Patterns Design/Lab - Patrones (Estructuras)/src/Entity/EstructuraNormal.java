package Entity;

public class EstructuraNormal extends Estructura{
	
	
	@Override
	public double getPrecio() {
		return 5.00;
	}

	@Override
	public String getResistencia() {
		return "Resistencia: Base";
	}

	@Override
	public int getCapacidad() {
		return 10;
	}
	
}
