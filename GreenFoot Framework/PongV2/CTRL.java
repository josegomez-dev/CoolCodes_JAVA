import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CTRL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CTRL extends Actor
{
    /**
     * Act - do whatever the CTRL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Controller controllerScreen = new Controller();
            Greenfoot.setWorld(controllerScreen);    
        }        
    }    
}
