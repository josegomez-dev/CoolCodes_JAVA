package Logic;

import java.util.ArrayList;

import Custom.Observador;
import Custom.SujetoObservable;

public class Board implements SujetoObservable{

	public String msj;
	public ArrayList<Observador> observadores;
	
	
	public Board(){
		observadores = new ArrayList<Observador>();
	}
	
	public String getMsj(){
		return this.msj;
	}
	
	public void setMsj(String msj){
		this.msj = msj;
		this.notificar();
	}
	
	@Override
	public void notificar() {
		for(Observador o : observadores){
			o.update(this);
		}
	}

	@Override
	public void addObservador(Observador obs) {
		observadores.add(obs);
	}

}
