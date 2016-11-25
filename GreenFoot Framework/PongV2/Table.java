import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Table here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Table extends World
{

    /**
     * Constructor for objects of class Table.
     * 
     */
    public Table() 
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1);
        //Greenfoot.playSound("ending.mp3");
        addObject( new Timer(), getWidth()/2, getHeight() - getHeight()+35 );
        addObject( new Ball(), getWidth()/2, getHeight()/2 );
        addPlayer(1, 50);
        addPlayer(2, 550);
        addObject(new CTRL(), 550, 50);
        //addBarrels(5);
    }
    public void addPlayer(int player, int x)
    { 
        showText( "Player " + player, x, getHeight()-25 );
        addObject( new Paddle(player), x, getHeight()/2);
    }
    
    public void addBarrels(int n){
        for(int i= 0; i < n; i++){
            addObject( new Barrel(), 530,65 + (60*i) );
        }
    }
    
}
