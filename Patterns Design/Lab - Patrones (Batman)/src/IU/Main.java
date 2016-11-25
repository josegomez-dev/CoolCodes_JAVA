package IU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import LogicLayer.Heroe;

public class Main {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static Heroe h = new Heroe();
	
	public static void main(String[] args) throws IOException {
		
		boolean noSalir = true;
		int opc;
		
		do{
			mostrarMenu();
			opc = leerOpcion();
			noSalir = ejecutarOpcion(opc);
			
		}while(noSalir);
		
	}

	static void mostrarMenu() {
		System.out.println();
		System.out.println("1. Disfrazar.");
		System.out.println("2. Quitar disfraz.");
		System.out.println("3. Activar murcielago.");
		System.out.println("4. Combatir.");
		System.out.println("5. Defender.");
		System.out.println("6. Hacerse el muertito.");
		System.out.println("7. Suspender.");
		System.out.println("8. Informacion.");
		System.out.println("9. Salir.");
		System.out.println();
	}
	
	static int leerOpcion() throws IOException {
		System.out.print("Seleccione su opcion: \n");
		return Integer.parseInt(in.readLine()); 
	}

	static boolean ejecutarOpcion(int opc) throws IOException {
		
		boolean noSalir = true;
		
		switch(opc){
			case 1:
				h.disfrazarse();
				break;
			case 2:
				h.quitarDisfraz();
				break;
			case 3:
				h.activarMurcielago();
				break;
			case 4:
				h.combatir();
				break;
			case 5:
				h.defender();
				break;
			case 6:
				h.hacerseMuertito();
				break;
			case 7:
				h.suspender();
				break;
			case 8:
				h.informacion();
				break;
			case 9: // Salir
				noSalir = false;
				break;
			default: // Opcion invalida
				System.out.println("/*!/*! Opcion invalida /*!/*!");
				break;
				
		}
		
		return noSalir;
	}
	
}
