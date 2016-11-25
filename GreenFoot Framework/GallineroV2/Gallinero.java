import greenfoot.*;
import java.lang.Math;

/**
 * Clase Gallinero
 * 
 * @author Jose Alejandro Gomez Castro
 * @author Jose Ramirez Ocampo
 * @version 2.0
 */
public class Gallinero extends World
{
    //Gallina seleccionada
    public Gallina gallinaActual = null;
    
    /**
     * Constructor for objects of class Gallinero.
     * 
     */
    public Gallinero()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        addObject(new Gallina(new GallinaGrande()), 300, 300);
        
        addObject(new Gallina(new Huevo()), 400, 400);
        
        controls();
    }
    
    /*
     * Método act del objeto tipo Gallinero [extends World]
       */
    public void act() {
        
        //Verifica si la tecla '4' del teclado fue presionada y añade una gallina al mundo
        if(Greenfoot.isKeyDown("4")){
            this.addObject(new Gallina(new GallinaGrande()), Greenfoot.getRandomNumber(780), Greenfoot.getRandomNumber(400)+200);
        }
        
        //Verifica si la gallina actual (gallina seleccionada) es diferente de nulo
        if (gallinaActual != null) {
            
            //Mover la gallina
            gallinaActual.move();
            
            //Mostrar estado gallinero
            if(Greenfoot.isKeyDown("1")){ 
                showText("Poblacion: " + numberOfObjects(), 700, 550);
            }
            //Emitir sonido
            if (Greenfoot.isKeyDown("3")) {
                gallinaActual.emitirSonido();
            }
            
            //Empollar huevo
            if ( Greenfoot.isKeyDown("2")) {
                gallinaActual.empollar();
            }
            
            //Poner huevo
            if ( Greenfoot.isKeyDown("5")) {
                gallinaActual.ponerHuevo();
            }
            
            //Dormir gallina
            if ( Greenfoot.isKeyDown("6")) {
                gallinaActual.dormir();
            }        
        }
    }
    
    //Se añaden los controles al mundo
    public void controls(){
        showText("Estado Gallinero: 1", 600, 25);
        showText("Empollar: 2", 600, 50);
        showText("Emitir Sonido: 3", 600, 75);
        showText("Crear Gallina: 4", 600, 100);
        showText("Poner Huevo: 5", 600, 125);
        showText("Dormir/Despertar: 6", 600, 150);
        showText("Seleccionar Gallina: Hacer Click", 600, 175);
    }
    
    //Se hace el set de la gallina actual
    public void setGallina(Gallina pgallina) 
    {
        gallinaActual = pgallina;
        
    }
}
