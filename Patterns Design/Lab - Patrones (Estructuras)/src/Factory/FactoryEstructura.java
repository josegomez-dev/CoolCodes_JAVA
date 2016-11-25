package Factory;

import Entity.Estructura;
import Entity.EstructuraNormal;
import Entity.EstructuraPremium;
import Entity.EstructuraSuperior;

public class FactoryEstructura implements Factory {
	
	@Override
	public Estructura CreateEstructuraNormal() {
		return new EstructuraNormal();
	}

	@Override
	public Estructura CreateEstructuraSuperior() {
		return new EstructuraSuperior();
	}

	@Override
	public Estructura CreateEstructuraPremium() {
		return new EstructuraPremium();
		
	}

}
