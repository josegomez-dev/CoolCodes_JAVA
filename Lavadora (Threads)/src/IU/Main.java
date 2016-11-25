package IU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

import Logic.Lavadora;

/**
 * 
 * <p>
 * Clase Main para manipular la interaccion del usuario con la aplicacion 
 * y los servicios que ofrece el objeto Lavadora en su interfaz.
 * </p>
 * <p>
 * La clase contiene los metodos necesarios para:
 * <ul>
 * <li>Mostrar menu</li>
 * <li>Leer accion</li>
 * <li>Ejecutar accion</li>
 * </ul>
 * </p>
 * <p>
 * Enlace
 * <a href="http://ecolecua.me/alego/Progra/index.html">Integrantes... POO Software - Lavadora (Server Test)</>
 * </p>
 * 
 * @author Jose Alejnadro Gomez
 * @author Roberto Rojas J.
 * @version %I%, %G%
 * @since 1.0
 */


public class Main {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;

	static ArrayList<Lavadora> lista = new ArrayList<Lavadora>();
	static int SELECTNOW = -1;
	
	public static void main(String[] args) throws IOException {
		
		boolean noSalir = true;
		int opc;
		
		do{
			mostrarMenu();
			opc = leerOpcion();
			noSalir = ejecutarAccion(opc);

		}while (noSalir);

    }
 
	/**
	 * 
	 * El metodo mostrar menu contiene los servicios 
	 * que la aplicacion ofrece al cliente.
	 */
 	static void mostrarMenu(){
 		
		out.println();
		out.println("1. Crear lavadora.");
		out.println("2. Mostrar lavadoras.");
		out.println("3. Seleccionar lavadora.");
		out.println("4. Cargar agua.");
		out.println("5. Cargar ropa.");
		out.println("6. Cargar detergente.");
		out.println("7. Especificar tiempo.");
		out.println("8. Drenar.");
		out.println("9. Mostrar estado de la lavadora.");
		out.println("10. Mostrar estado de la ropa.");
		out.println("11. Pausar o Reanudar lavadora");
		out.println("12. Probar sistema.");
		out.println("13. Reiniciar sistema.");
		out.println("22. Salir");
		out.println((SELECTNOW != -1) ? "!/*!/* Lv seleccionada: " + SELECTNOW + " !/*!/*": "");
		out.println();
	}
	
 	/**
 	 * El metodo leer opcion, almacena y retorna la opcion dada por el usuario.
 	 * @return
 	 * @throws java.io.IOException
 	 */
	static int leerOpcion()throws java.io.IOException{
		
		int opcion;

		out.print("Seleccione su opcion: ");
		opcion = Integer.parseInt(in.readLine()); 
		out.println();

		return opcion;
	}
	
	/**
	 * 
	 * El metodo ejecutarAccion llevara a cabo el proceso segun la opcion dada por el usuario.
	 * @param popcion
	 * @return
	 * @throws java.io.IOException
	 */
	static boolean ejecutarAccion(int popcion)throws java.io.IOException{

		boolean noSalir = true;
		
		if(popcion >= 4 && popcion <= 11 && SELECTNOW == -1){
			if(lista.size() == 0){
				out.println("!/*!/* No hay lavadoras registradas, y ademas... !/*!/*");
			}
			out.println("!/*!/* No se ha seleccionado ninguna lavadora !/*!/*");
			return noSalir;
		}
		
		if(popcion >= 2 && popcion <= 3 && lista.size() == 0){
			out.println("!/*!/* No hay lavadoras registradas !/*!/*");
			return noSalir;
		}
		
		switch(popcion){
		
			case 1: // Crear lavadora:
				
				lista.add(new Lavadora());	
				out.println("!/*!/* Se ha creado una nueva lavadora !/*!/*");
				
				break;
			
			case 2:	// Mostar lavadoras:
				
				for(int i = 0; i < lista.size(); i++){
					out.println("Lavadora " + lista.get(i) + "\n");
				}	
					
				break;
			
			case 3: // Seleccionar lavadora:
				boolean resul;
				for(int i = 0; i < lista.size(); i++){
					out.println((i+1) + ". Lavadora " + (i+1));
				}
				do{
					out.print(" Seleccione una lavadora ");
					SELECTNOW =	Integer.parseInt(in.readLine());
					
					resul = SELECTNOW < 1 || SELECTNOW > lista.size();
					
					if(resul){
						out.println("\n!/*!/* Lavadora seleccionada no existe !/*!/*");
					}
				}while(resul);
				
				break;
	
			case 4: // Cargar agua:
					out.println(lista.get(SELECTNOW-1).cargarAgua());
				break;
				
			case 5: // Cargar ropa:
				int tipoRopa;
				do{
					out.println("Ingrese el tipo de ropa\n1. Sucia\n2. Ligeramente sucia\n3. Muy sucia\n4. Limpia");
					tipoRopa = Integer.parseInt(in.readLine());	
				}while(tipoRopa < 1 || tipoRopa > 4);
				
				lista.get(SELECTNOW-1).cargarRopa(tipoRopa);
				break;
				
			case 6: // Cargar detergente:
				lista.get(SELECTNOW-1).cargarDetergente();
				break;
				
			case 7: // Especificar tiempo:
				out.println(lista.get(SELECTNOW-1).especificarTiempo());
				break;
				
			case 8: // Drenar:
				lista.get(SELECTNOW-1).drenar();
				break;
				
			case 9: // Mostrar estado de la lavadora:
				out.println(lista.get(SELECTNOW-1));
				break;
				
			case 10: // Mostrar estado de la ropa:
				switch(lista.get(SELECTNOW-1).getTipoRopa()){
					case 1:
						out.println("Sucia");
						break;
					case 2:
						out.println("Ligeramente sucia");
						break;
					case 3:
						out.println("Muy sucia");
						break;
					case 4:
						out.println("Limpia");
						break;
					default:
						out.println("Opcion invalida");
						break;
						
				}
				break;
				
			case 11: // Pausar o reanudar:
				lista.get(SELECTNOW-1).pausarReanudarLavadora();
				break;
				
			case 12: // Probar sistema.
				for(int i = 0; i < 5; i++){
					lista.add(new Lavadora());
				}
				out.println("   ********************************");
				out.println(" Modo prueba: Se han creado 5 Lavadoras");
				out.println("   ********************************");
				break;
							
			case 13: // Reiniciar sistema.
				lista = new ArrayList<Lavadora>();
				SELECTNOW = -1;
				
				out.println("   ********************************");
				out.println(" Se reincio el sistema");
				out.println("   ********************************");
				break;
			
			case 22:
				
				noSalir = false;
				break;
				
			default:
				out.println("Opcion no valida");
				break;
		}
		return noSalir;
	}      

}
