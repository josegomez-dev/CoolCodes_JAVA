package IU;
import Logic.ColorObservable;
import Logic.VentanaColor;
import Logic.VentanaOpciones;
import Logic.VentanaSeleccion;

public class Main {

	public static void main(String[] args) 
	{
		ColorObservable color = new ColorObservable();
		VentanaOpciones ventanaOpciones = new VentanaOpciones(color);
		VentanaColor ventanaColor = new VentanaColor(color);
		VentanaSeleccion ventanaSeleccion = new VentanaSeleccion(color);
	
		/*Aqui se Agregan los observadores*/
		color.addObserver(ventanaOpciones);
		color.addObserver(ventanaColor);
		color.addObserver(ventanaSeleccion);
	}
}
