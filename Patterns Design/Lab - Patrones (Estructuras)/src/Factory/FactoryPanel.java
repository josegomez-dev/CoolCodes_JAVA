package Factory;

import Decorator.PanelSonico;
import Decorator.PanelTermico;
import Entity.Estructura;

public class FactoryPanel implements FactoryAdd{

	@Override
	public Estructura addPanelTermico(Estructura e) {
		return new PanelTermico(e);
	}

	@Override
	public Estructura addPanelSonico(Estructura e) {
		return new PanelSonico(e);
	}

	@Override
	public Estructura addPanelRadioactivo(Estructura e) {
		//return new PanelRadioactivo(e);
		return null;
	}

}
