package Decorator;

import Entity.Estructura;

public class PanelRadioactivo extends PanelDecorator {

	public PanelRadioactivo(Estructura e){
		this.e = e;
	}
	
	@Override
	public double getPrecio() {
		return this.e.getPrecio() + 5.00;
	}

	@Override
	public String getResistencia() {
		return this.e.getResistencia() + " /// Resistiendo radiaciones extraterrestres";
	}

	@Override
	public int getCapacidad() {
		return this.e.getCapacidad() + 0;
	}

}
