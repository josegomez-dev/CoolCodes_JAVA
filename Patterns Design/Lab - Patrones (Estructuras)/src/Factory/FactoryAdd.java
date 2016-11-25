package Factory;

import Entity.Estructura;

public interface FactoryAdd {

	public Estructura addPanelTermico(Estructura e);
	public Estructura addPanelSonico(Estructura e);
	public Estructura addPanelRadioactivo(Estructura e);
	
}
