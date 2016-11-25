package Logic;

import java.util.Observable;
import java.util.Observer;

public class Institucion extends Observable{

	private String catastrofe;
	
	public Institucion(){
		this.catastrofe = "N/A";
	}
	
	public void suscribirEquipo(Observer obs){
		this.addObserver(obs);
	}

	public String getCatastrofe() {
		return catastrofe;
	}

	public void setCatastrofe(String catastrofe) {
		this.catastrofe = catastrofe;
		this.setChanged();
		this.notifyObservers();
	}
	
}
