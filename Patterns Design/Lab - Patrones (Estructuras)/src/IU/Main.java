package IU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import Entity.Estructura;
import Factory.Factory;
import Factory.FactoryAdd;
import Factory.FactoryEstructura;
import Factory.FactoryPanel;

public class Main {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static DecimalFormat df = new DecimalFormat("$ ##.##");
	
	static Factory factoryEstructura = new FactoryEstructura();
	static FactoryAdd factoryPanel = new FactoryPanel();
	static Estructura e;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		seleccionarEstructura();
		
		boolean noSalir = true;
		int opc;
		
		do{
			mostrarMenu();
			opc = leerOpcion();
			noSalir = ejecutarOpcion(opc);
			
		}while(noSalir);
		
	}
	
	private static int leerOpcion() throws NumberFormatException, IOException{
		System.out.print("Seleccione_ ");
		
		return Integer.parseInt(in.readLine());
	}
	
	private static void seleccionarEstructura() throws NumberFormatException, IOException{
		
		boolean OK = true;
		int tipoEstructura;
		
		do{
			tipoEstructura = mostrarEstructurasDisponibles();
			OK = construirElemento(tipoEstructura);
		
		}while(!OK);
		
	}
	
	private static int mostrarEstructurasDisponibles() throws NumberFormatException, IOException{
		StringBuffer menu = new StringBuffer();
		
		menu.append("******************************************\n");
		menu.append("*     SELECCIONE UN TIPO DE ESTRUCTURA   *\n");
		menu.append("* 1- Normal.    2- Superior   0- Premium *\n");
		menu.append("******************************************\n");
		
		System.out.println(menu.toString());
		
		return leerOpcion();
	}
	
	private static boolean construirElemento(int opc){
				
		boolean OK = true;
		
		switch(opc){
			case 1:
				e = factoryEstructura.CreateEstructuraNormal();
				break;
			case 2:
				e = factoryEstructura.CreateEstructuraSuperior();
				break;
			case 3:
				e = factoryEstructura.CreateEstructuraPremium();
				break;
			default:
				System.out.println("\n!/* Opcion Invalida */!\n");
				OK = false;
				break;
		}
		
		return OK;
	}
	
	static void mostrarMenu() {
		System.out.println();
		System.out.println("1. Consultar informacion.");
		System.out.println("2. Agregar panel sonico.");
		System.out.println("3. Agregar panel termico.");
		System.out.println("4. Poner a prueba.");
		System.out.println("5. Salir.");
		System.out.println();
	}
	
	static boolean ejecutarOpcion(int opc) throws IOException {
		
		boolean noSalir = true;
		
		System.out.println();
		
		switch(opc){
			case 1:
				System.out.println("Precio: " + df.format(e.getPrecio()) + "\n" + e.getResistencia() + "\nCapacidad: " + e.getCapacidad() + " G");
				break;
			case 2:
				e = factoryPanel.addPanelSonico(e);
				System.out.println("Se agrego un nuevo panel");
				break;
			case 3:
				e = factoryPanel.addPanelTermico(e);
				System.out.println("Se agrego un nuevo panel");
				break;
			case 4:
				System.out.println("Ingrese la cantidad de grados del terremoto:");
				probarEstructura(Integer.parseInt(in.readLine()));
				break;
			case 5:
				noSalir = false;
				break;
			default:
				System.out.println("\n!/* Opcion invalida */!\n");
				break;
				
		}
		
		return noSalir;
	}

	private static void probarEstructura(int testGrados) {
		System.out.println();
		if(testGrados <= e.getCapacidad() ){
			System.out.println("Soportando correctamente");
		}else{
			System.out.println("La estructura se derrumbo");
		}
	}
	
}
