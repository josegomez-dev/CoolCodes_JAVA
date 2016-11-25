package Logic;
import java.util.Observable;

public class ColorObservable extends Observable{
	
	private int colorSeleccionado;
	private String color;
	
	public ColorObservable(){
		
	}
		
	public void setColorSeleccionado(int i) {
		this.colorSeleccionado = i;
		setChanged();
	    notifyObservers();
	}

	public int getColorSeleccionado() {
		return colorSeleccionado;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
