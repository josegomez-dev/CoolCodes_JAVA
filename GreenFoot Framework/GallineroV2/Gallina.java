import greenfoot.*;

/**
 * Clase Gallina
 * 
 * @author Jose Alejandro Gomez Castro
 * @author Jose Ramirez Ocampo
 * @version 2.0
 */
public class Gallina extends Actor
{
    /**
     * Act - do whatever the Gallina wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Ave objectAve;
    
    //Constructor clase Gallina
    public Gallina(Ave pave) {
        objectAve = pave;
        this.setImage(objectAve.getImage());
    }
    
    //Método act de la clase Gallina
    public void act() 
    {
        //Se inicializa la variable galinaActual que se encuntra en el mundo luego de hacer click
        if (Greenfoot.mouseClicked(this)) {
            Gallinero gallinero = (Gallinero)this.getWorld();
            gallinero.setGallina(this);
        }
        
    }
    
    //Método comer [Falta*]
    public String comer() {
        objectAve.comer();
        
        return null;
    }
    
    //Método emitir sonido
    public void emitirSonido() {
        objectAve.emitirSonido();
    }
    
    //Método dormir
    public void dormir() {
        objectAve.dormir();
    }
    
    //Método poner huevo
    public void ponerHuevo() {
        objectAve.ponerHuevo(getWorld());
    }
    
    //Método empollar
    public void empollar() {
        if ( this.isTouching(Gallina.class) ) {
            Gallina gallinaIntersect = (Gallina)this.getOneIntersectingObject(Gallina.class);
            objectAve.empollar(gallinaIntersect);
        }
    }
    
    //Método mover
    public void move() {
        objectAve.mover(this);
    }
}
