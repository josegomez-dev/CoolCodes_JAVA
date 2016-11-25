package Visitor;

import Logic.EsmoquinNuevo;
import Logic.EsmoquinUsado;

public interface Visitor {

	public double visitar (EsmoquinNuevo esmNuevo);
	public double visitar (EsmoquinUsado esmUsado);
	
}
