import greenfoot.*;

/**
 * Clase abstracta Ave
 * 
 * @author Jose Alejandro Gomez Castro
 * @author Jose Ramirez Ocampo
 * @version 2.0
 */
public abstract class Ave extends Actor
{
    /**
     * Clase abstarcta Ave
     */
    
    boolean dormido;
    
    //Constructor de la clase
    public Ave (boolean pdormido) {
        dormido = pdormido;
    }
    
    public void mostrarEstado() {
    
        
    }

    //Métodos abstractos
    
    public abstract String comer();
    public abstract void emitirSonido();
    public abstract void dormir();
    public abstract void ponerHuevo(World pmundo);
    public abstract void empollar(Gallina pgallina);
    public abstract void mover(Gallina gallina);
}
