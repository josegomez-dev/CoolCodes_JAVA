import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int nPlayer;
    public Paddle(int player)
    {
        GreenfootImage img = new GreenfootImage(20, 100);
        //img.setColor(new Color(128, 24, 32));
        img.setColor(Color.LIGHT_GRAY);
        img.fill();
        setImage(img);
        nPlayer = player;
    }    
    public void act() 
    {
        /*
        if(Greenfoot.isKeyDown("left")){
            setLocation( getX()-3, getY() );
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation( getX()+3, getY() );
        }
        */
       if(nPlayer == 1){
           if(Greenfoot.isKeyDown("w")){
               setLocation( getX(), getY()-3 );
               if(Greenfoot.isKeyDown("z")){
                   setLocation( getX(), getY()-8 );
               }
           }
           if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("S")){
               setLocation( getX(), getY()+3 );
               if(Greenfoot.isKeyDown("z")){
                   setLocation( getX(), getY()+8 );
               }
           }
           
       }else{
           if(Greenfoot.isKeyDown("up")){
               setLocation( getX(), getY()-3 );
               if(Greenfoot.isKeyDown("m")){
                   setLocation( getX(), getY()-8 );
               }
           }
           if(Greenfoot.isKeyDown("down")){
               setLocation( getX(), getY()+3 );
               if(Greenfoot.isKeyDown("m")){
                   setLocation( getX(), getY()+8 );
               }
           }
       }
    }    
}
