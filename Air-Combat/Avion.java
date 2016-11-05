import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avion extends Actor
{
    /**
     * Act - do whatever the Avion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();
        dispara();
    }
    
    public void muevete()
    {
        if(Greenfoot.isKeyDown("up")) //moverce hacia arriba
        {
            setLocation(getX(),getY()-1);
            
        }
    }
    
    public void dispara()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            
        }
    }
        
}
