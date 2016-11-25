package Logic;

import Visitor.Visitor;

public class EsmoquinNuevo implements Visitable {

	private double precio;
	
	public EsmoquinNuevo(double precio){
		this.precio = precio;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public void setPrecio(double precio){
		this.precio = precio;
	}

	@Override
	public double aceptar(Visitor visitante) {	
		return visitante.visitar(this);
	}
	
}
