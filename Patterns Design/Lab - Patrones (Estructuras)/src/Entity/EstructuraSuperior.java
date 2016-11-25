package Entity;

public class EstructuraSuperior extends Estructura {
	
	@Override
	public double getPrecio() {
		return 18.00;
	}

	@Override
	public String getResistencia() {
		return "Resistencia: Base";
	}

	@Override
	public int getCapacidad() {
		return 20;
	}
	
}
