import greenfoot.*;

/**
 * Clase GallinaGrande
 * 
 * @author Jose Alejandro Gomez Castro
 * @author Jose Ramirez Ocampo
 * @version 2.0
 */
public class GallinaGrande extends Ave
{
    /**
     * Act - do whatever the GallinaGrande wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int SPEED = 5;
    
    //Constructor GallinaGrande
    public GallinaGrande() {
        super(false);
    }
    
    public String comer() {
        System.out.println("Estoy cominedo maíz, qué rico");
        
        return null;
    }
    
    public void emitirSonido() {
        Greenfoot.playSound("RoosterSound.mp3");     
    }
    
    public void dormir() {
        if (!dormido) {
           dormido = true;
        } else {
           dormido = false;
        }
    }
    
    public void ponerHuevo(World pmundo) {
        
        pmundo.addObject(new Gallina(new Huevo()), Greenfoot.getRandomNumber(780), Greenfoot.getRandomNumber(400)+200);
    }
    
    public void empollar(Gallina pgallina) {
        pgallina.objectAve = new GallinaGrande();
        pgallina.setImage(pgallina.objectAve.getImage());
    }
    
    public void mover(Gallina pgallina) {
       
       if (!dormido) {
            
        if(Greenfoot.isKeyDown("w")){
           pgallina.setLocation( pgallina.getX(), pgallina.getY() - SPEED );
        }
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("S")){
           pgallina.setLocation( pgallina.getX(), pgallina.getY()+ SPEED );
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("S")){
           pgallina.setLocation( pgallina.getX() - SPEED, pgallina.getY() );
        }
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("S")){
           pgallina.setLocation( pgallina.getX() + SPEED, pgallina.getY() );    
        }
    }
    }
}
