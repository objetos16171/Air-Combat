import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Actor
{
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int velBomb = 2;
    
    public void act() 
    {
        mueve();
    }
    
    public void mueve()
    {
        setLocation(getX(), getY()-velBomb);
        if(isAtEdge())
        {
            World mundo = getWorld();
            ((Mundo1)mundo).removeObject(this);
        }
    }
}
