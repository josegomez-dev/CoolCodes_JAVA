package Visitor;

import Logic.EsmoquinNuevo;
import Logic.EsmoquinUsado;

public class PromocionDiciembre implements Visitor{

	private final double descuentoNuevo = 0.813333333333;
	private final double descuentoUsado = 0.33333333333;
	
	
	@Override
	public double visitar(EsmoquinNuevo esmNuevo) {
		return esmNuevo.getPrecio() * this.descuentoNuevo;
	}
	@Override
	public double visitar(EsmoquinUsado esmUsado) {
		return esmUsado.getPrecio() * this.descuentoUsado;
	}
	
}
