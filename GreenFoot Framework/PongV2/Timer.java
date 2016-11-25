import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
 
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time = 30;
    private int count = 65;
    public void act() 
    {
        // Add your action code here.
        if(time == 0)
        {
            gameover();
            return;
        }
         
        if(counter())
        {
            time--;
            count = 65;
        }
        display();
    }    
     
    private boolean counter()
    {
        if(count > 0)
        {
            count--;
        }
        return count == 0;
    }
     
    private void display()
    {
        setImage(new GreenfootImage(""+time, 30, Color.WHITE, Color.BLACK));
    }
     
    public void setTime()
    {
        time = 20;
    }
     
    public boolean isTimeUp()
    {
        return time == 0;
    }
    
    public void gameover()
    {
        getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
    }
     
}