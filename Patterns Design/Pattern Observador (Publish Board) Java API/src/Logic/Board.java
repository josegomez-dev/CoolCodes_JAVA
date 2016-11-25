package Logic;
import java.util.Observable;
import java.util.Observer;

public class Board extends Observable{

	private String msj;
	
	public String getMsj() {
		return msj;
		
	}
	
	public void setMsj(String msj) {
		this.msj = msj;
		this.setChanged();
		this.notifyObservers();
	}

	public void linkObserver(Observer observer){
		this.addObserver(observer);
	}
	
}
