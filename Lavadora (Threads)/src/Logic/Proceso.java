package Logic;

/**
 * 
 * <p>
 * Clase que simula el proceso de una lavadora cuando esta en funcionamiento, lavando y/o drenando. 
 * Se implementa synchronized para lograr el entendimiento correcto en tiempo de ejecucion de los metodos en cuestion.
 * </p>
 * <p>
 * La clase contiene los metodos necesarios para:
 * <ul>
 * <li>Simular el proceso de lavado y/o drenaje</li>
 * <li>Pausar el hilo de ejecucion</li>
 * <li>Reanudar el hilo de ejecucion</li>
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

public class Proceso extends Thread{
	
	/**
	 * 
	 * Booleano que se refiere al actividad 
	 * o inactividad de la lavadora.
	 */
	private boolean	lavando;
	/**
	 * 
	 * Entero que se refiere a los minutos que la lavadora 
	 * sugiere dependiendo del tipo de ropa.
	 */
	private int minSugeridos;
	
	
	public Proceso(){
		setLavando(false);
		setMinSugeridos(-1);
	}
	
	public int getMinSugeridos() { return minSugeridos; }
	public void setMinSugeridos(int minSugeridos) { this.minSugeridos = minSugeridos; }
	public boolean isLavando() { return lavando; }
	public void setLavando(boolean lavando) { this.lavando = lavando; }
	
	/**
	 * 
	 * El metodo run simula el proceso de una lavadora funcionando.
	 * @see java.lang.Thread#run()
	 */
	public synchronized void run() {

		this.lavando = true;
		notifyAll();
		
		for(int i = 0; i < getMinSugeridos(); i++){
			if(isLavando()){
				System.out.println("\n * Progreso " + ((i * 100 ) / getMinSugeridos()) + "% * "); 
				try{
					this.wait(500); 
				}catch(InterruptedException e){ System.out.println("Hilo Bloqueado: Imposible interrupccion"); };	
			}else{
				try {
					this.wait();
				} catch (InterruptedException e) { e.printStackTrace(); }
			}	
		}	
		System.out.println(" * Proceso terminado " + "100% * ");
		setMinSugeridos(-1);	
	}	
	/**
	 * 
	 * El metodo pausar lavadora, si la lavadora esta en funcionamiento,
	 * le asigna false al attr de instancia lavando, y notifica a los demas metodos,
	 * para detener el ciclo del proceso del lavado.
	 */
	public synchronized void pausar(){
		if(this.lavando){
			this.lavando = false;
			notifyAll();
		}
	}
	/**
	 * 
	 * El metodo reanudar lavadora asigna true al attr de instancia lavando, 
	 * y notifica a los demas metodos, para pasar la condicion
	 * y seguir ejecutando el ciclo del lavado.
	 */
	public synchronized void reanudar(){
		this.lavando = true;
		notifyAll();
	}
	
}