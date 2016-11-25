package Decorator;

import Entity.Estructura;

public class PanelSonico extends PanelDecorator{

	public PanelSonico(Estructura e){
		this.e = e;
	}

	@Override
	public double getPrecio() {
		return this.e.getPrecio() + 5.00;
	}

	@Override
	public String getResistencia() {
		return this.e.getResistencia() + " /// Resistiendo contra el sonido";
	}

	@Override
	public int getCapacidad() {
		return this.e.getCapacidad() + 0;
	}
	
}
