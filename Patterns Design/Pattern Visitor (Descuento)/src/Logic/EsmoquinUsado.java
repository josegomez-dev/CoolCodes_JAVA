package Logic;

import Visitor.Visitor;

public class EsmoquinUsado implements Visitable {

	private double precio;
	
	public EsmoquinUsado(double precio){
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
