import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller extends World
{

    /**
     * Constructor for objects of class Controller.
     * 
     */
    public Controller()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("CONTROLS", getWidth()/2, 50);
        showText("Player 1: ", getWidth()/2, 100);
        showText(" * upArrow - scroll up", getWidth()/2, 130);
        showText(" * downArrow - scroll down", getWidth()/2, 160);
        showText(" * boost - z", getWidth()/2, 190);
        showText("Player 2: ", getWidth()/2, 250);
        showText(" * w - scroll up", getWidth()/2, 280);
        showText(" * s - scroll down", getWidth()/2, 310);
        showText(" * boost - m", getWidth()/2, 340);
    }
}
