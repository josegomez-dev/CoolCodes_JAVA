package Logic;

/**
 * 
 * <p>
 * Clase para simular digitalmente el funcionamiento de una o varias lavadoras,
 * Para asi poner en practica los conocimientos adquiridos y consejos en clase.
 * </p>
 * <p>
 * La clase contiene los metodos necesarios para:
 * <ul>
 * <li>Cargar agua</li>
 * <li>Cargar ropa</li>
 * <li>Cargar detergente</li>
 * <li>Especificar tiempo</li>
 * <li>Drenar</li>
 * <li>Mostrar estado general</li>
 * <li>Mostrar estado de la ropa</li>
 * <li>Pausar lavadora</li>
 * <li>Reanudar lavadora</li>
 * </ul>
 * </p>
 * <p>
 * Enlace
 * <a href="http://ecolecua.me/alego/Progra/index.html">Integrantes... POO Software - Lavadora (Server Test)</>
 * </p>
 * 
 * @author Jose Alejnadro Gomez
 * @version %I%, %G%
 * @since 1.0
 */

public class Lavadora {
	
	/**
	 * 
	 * Entero que se refiere al identificador de cada lavadora:
	 */
	private long id;
	private static long cantLavadoras = 0;
	
	/**
	 * 
	 * Cadena que se refiere a la serie de la lavadora.
	 */
	private String serie;
	/**
	 * 
	 * Cadena que se refiere al modelo de la lavadora.
	 */
	private String modelo;
	/**
	 * 
	 * Entero que se refiere al tipo de ropa 
	 * que contiene la lavadora actualmente.
	 */
	private int tipoRopa;
	/**
	 * 
	 * Booleano que se refere a la presencia 
	 * de detergente actualmente.
	 */
	private boolean detergente;
	/**
	 * 
	 * Real que se refiere a los litros actuales 
	 * de agua en el tanque de la lavadora.
	 */
	private double litrosActuales;
	/**
	 * 
	 * Real que se refiere a la capacidad maxima de agua en litros de todas las lavadoras.
	 */
	private final static double MAX_NVL_AGUA = 80.0;
	/**
	 * 
	 * Objeto de tipo Thread con realacion de dependencia para simular 
	 * una lavadora en funcionamiento.
	 */
	private Thread hilo;
	
	
	/**
	 * 
	 * Constructor que inicializa los atributos en un estado 
	 * valido, en funcion del dominio del problema.
	 * @see Proceso
	 */
	public Lavadora() {
		setId();
		setSerie("LV-" + id);
		setModelo("Whirlpool");
		setTipoRopa(-1);
		setDetergente(false);
		setLitrosActuales(0.0);
		hilo = new Proceso();
	}

	public long getId() { return id; }
	private void setId() { id = ++cantLavadoras; }
	public static long getCantLavadoras() { return cantLavadoras; }
	
	public String getSerie() { return serie; }
	public void setSerie(String pserie) { serie = pserie; }
	
	public String getModelo() { return modelo; }
	public void setModelo(String pmodelo) { modelo = pmodelo; }
	
	public int getTipoRopa() { return tipoRopa; }
	public void setTipoRopa(int ptipoRopa) {
		if(ptipoRopa >= 1 && ptipoRopa <= 4){
			tipoRopa = ptipoRopa;
		}else{
			tipoRopa = -1;
		}
		 
	}
	
	public boolean getDetergente(){ return detergente; };
	public void setDetergente(boolean b){ detergente = b; };
	
	public double getLitrosActuales(){ return litrosActuales; };
	public void setLitrosActuales(double plitrosActuales){ litrosActuales = plitrosActuales; };
	
	public static double getMAX_NVL_AGUA(){ return MAX_NVL_AGUA; };
	
	/**
	 * 
	 * El metodo cargar agua, llena el tanque incrementalmente hasta
	 * completar el 100% de capacidad de litros en la lavadora.
	 *
	 * @return String
	 */
	public String cargarAgua() {
		for(int i = 0; i < 5; i++){
			System.out.println(" * Llenando el taque " + obtenerPorcentaje(5, i) + "% * "); 
			
			if(getLitrosActuales() <= getMAX_NVL_AGUA()){
				litrosActuales = obtenerPorcentaje(5, i);	
			}else{
				litrosActuales = getMAX_NVL_AGUA();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}; 
			
		}
		return " * Tanque lleno 100% * ";
	}
	
	/**
	 * 
	 * El metodo obtener porcentaje hace el calculo del porcentaje
	 * segun los parametros que recive.
	 * @param ptotal
	 * @param pnum
	 * 
	 * @return porcentaje
	 */
	private int obtenerPorcentaje(int ptotal, int pnum){
		return pnum * 100 / ptotal;
	}
	
	/**
	 * 
	 * @param ptipoRopa
	 */
	public void cargarRopa(int ptipoRopa) {
		setTipoRopa(ptipoRopa);
	}
	
	/**
	 * 
	 * El metodo cargar detergente asigna el valor true para establecer la presencia del detergente
	 */
	public void cargarDetergente() {
		setDetergente(true);
	}
	
	/**
	 * 
	 * El metodo especificarTiempo recomienda una cantidad de minutos de lavado
	 * en funcion del tipo de ropa que la lavadora contenga en ese momento. Ademas
	 * hace la llamada a inicaraLavado().
	 * @return String
	 */
	public String especificarTiempo() {
		hilo = new Proceso();
		if(getTipoRopa() >= 1 && getTipoRopa() <= 3 && getLitrosActuales() > 70 && getDetergente()){
			switch(tipoRopa){
				case 1: // Ropa Sucia:
					((Proceso) hilo).setMinSugeridos(10);
					iniciarProceso();
					break;
				case 2: // Ropa Ligeramente sucia:
					((Proceso) hilo).setMinSugeridos(6);
					iniciarProceso(); 
					break;
				case 3: // Muy sucuia:
					((Proceso) hilo).setMinSugeridos(17);
					iniciarProceso(); 
					break;
			}
			setTipoRopa(4);
		}else{
			if(getTipoRopa() == 4 && getLitrosActuales() > 70){
				((Proceso) hilo).setMinSugeridos(5);
				iniciarProceso();
				
				return "Enjuagando la ropa //////";
			}
			return (getLitrosActuales() < 70) ? "Agua insuficiente" : ((getDetergente() != true)? "No hay detergente" : ((getTipoRopa() == -1) ? "No hay ropa" : ""));
		}
		return "Proceso finalizado ////";
	}
	
	/**
	 * El metodo drenar vacia incrementalmente el agua del tanque.
	 */
	public void drenar() {
		if(getLitrosActuales() > 0){
			hilo = new Proceso();
			((Proceso) hilo).setMinSugeridos(6);
			hilo.start();
			setLitrosActuales(0.0);
			setDetergente(false);
		}
	}

	/**
	 * 
	 * El metodo iniciar proceso comienza el hilo de ejecucion
	 * para simular el proceso del lavado y al mismo tiempo tener 
	 * la posibilidad de seguir utilizando la aplicaion.
	 */
	private void iniciarProceso() {
		if( ((Proceso) hilo).getMinSugeridos() != -1 ){
				hilo.start();
		}
	}
	
	/**
	 * 
	 * El metodo pausar lavadora verifica si el proceso esta llevandose acabo, 
	 * de ser asi reanuda el proceso del hilo, de lo contrario pausara el hilo en ejecucion.
	 */
	public void pausarReanudarLavadora(){
		if(((Proceso) hilo).isLavando() != true){
			((Proceso)hilo).reanudar();
		}else{
			((Proceso)hilo).pausar();
		}
	}
	
	/**
	 * 
	 * El metodo toString devuelve en una cadena el valor de todos los atributos de instancia,
	 * para conocer su estado detalladamente.
	 * @return String 
	 */
	public String toString() {
		String s;
		
		s = "id: " + getId() + "\n";
		s += "Serie: " + getSerie() + "\n";
		s += "Modelo: " + getModelo() + "\n";
		s += "Tipo de Ropa: " + ((getTipoRopa() != -1) ? getTipoRopa() : " --- ") + "\n";
		s += "Detergente?: " + ((getDetergente())? "si" : "no" ) + "\n";
		s += "Litros actuales: " + getLitrosActuales() + " litros\n";
		
		return s;
	}

}
