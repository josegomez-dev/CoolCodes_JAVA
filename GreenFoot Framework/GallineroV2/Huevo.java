import greenfoot.*;

/**
 * Clase Huevo
 * 
 * @author Jose Alejandro Gomez Castro
 * @author Jose Ramirez Ocampo
 * @version 2.0
 */
public class Huevo extends Ave
{
    /**
     * Act - do whatever the Huevo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Constructor Huevo
    public Huevo() {
        super(true);
    }
    
    public String comer() {return null;}
    
    public void emitirSonido() {}
    
    public void dormir() {
        dormido = true;
    }
    
    public void ponerHuevo(World pmundo) {
        
    }
    
    public void empollar(Gallina pgallina) {}
    
    public void mover(Gallina pgallina) {
        
        //No hace nada pero si se quita lanza una excepción
        if( ( Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("s") ) || 
            ( Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d") ) ){
           pgallina.setLocation( pgallina.getX(), pgallina.getY());
        }     

    }
}
