import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int hSpeed = 3; 
    private int vSpeed = 5;
    //private String[] imgs = {"smiley1.png", "smiley2.png", "smiley3.png", "smiley4.png", "smiley5.png"};
    private int time = 0;
    private int nvl = 1;
    private int hit = 0;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int getHSpeed()
    {
        return this.hSpeed;
    }
    public void setHSpeed(int hSpeed)
    {
        this.hSpeed = hSpeed;
    }
    public int getVSpeed()
    {
        return this.vSpeed;
    }
    public void setVSpeed(int vSpeed)
    {
        this.vSpeed = vSpeed;
    }
    
    public void act() 
    {
       move();
       time++;
       if(time == 10){
            int random = (int)(Math.random()*5);
            //this.setImage(new GreenfootImage(imgs[random]));
            time = 0;
       }
       getWorld().addObject(new Trail(), getX(), getY());
       Actor paddle = getOneIntersectingObject(Paddle.class);
       if(paddle != null){
           hit++;
           if(hit > 10){
               Greenfoot.playSound("whistle.mp3");
               nvl++;
               hSpeed = hSpeed + 5;
               vSpeed = vSpeed + 5;
               hit = 0;
               setImage(new GreenfootImage("Heuristic POINT!: " + nvl, 30, Color.WHITE, Color.RED));
           }
           hSpeed = -hSpeed;
           Greenfoot.playSound("secret.mp3");
       }
       Actor barrel = getOneIntersectingObject(Barrel.class);
       if(barrel != null){
           getWorld().removeObject(barrel);
       }
       if(getX() < 5 || getX() > 595){
           gameover();
           if(getX()< 5){           
               displayWinner(2);
           }else if(getX() > 595){
               displayWinner(1);
           }
       }          
    }   
    
    public void move()
    {
        setLocation( getX() + hSpeed, getY() + vSpeed);
        if(getX() < 5){
            hSpeed = -hSpeed;
        }
        if(getY() < 5){
            vSpeed = -vSpeed;
        }
        if(getX() > getWorld().getWidth()-5){
            hSpeed = -hSpeed;
        }
        if(getY() > getWorld().getHeight()-5){
            vSpeed = -vSpeed;
        }
    }
    
    public void displayWinner(int winPlayer)
    {
        getWorld().showText("Player " + winPlayer + " WINNER!", getWorld().getWidth()/2, getWorld().getHeight()/2 - 168); 
    }
    
    public void gameover()
    {
        Greenfoot.playSound("ending.mp3");
        getWorld().addObject(new GameOver(), getWorld().getWidth()/2, getWorld().getHeight()/2);
    }
}
