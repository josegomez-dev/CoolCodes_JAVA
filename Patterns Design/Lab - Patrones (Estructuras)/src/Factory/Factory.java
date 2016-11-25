package Factory;

import Entity.Estructura;

public interface Factory {

	public Estructura CreateEstructuraNormal();
	public Estructura CreateEstructuraSuperior();
	public Estructura CreateEstructuraPremium();
	
}
