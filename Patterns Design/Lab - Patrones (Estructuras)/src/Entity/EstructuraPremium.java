package Entity;

public class EstructuraPremium extends Estructura {

	@Override
	public double getPrecio() {
		return 30.00;
	}

	@Override
	public String getResistencia() {
		return "Resistencia: Base";
	}

	@Override
	public int getCapacidad() {
		return 30;
	}
	
}
