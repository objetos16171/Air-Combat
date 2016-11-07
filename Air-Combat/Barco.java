import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eneBarco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barco extends Actor
{
    private int tam = 10;
    private int velX;
    private int velY = 2;
    /**
     * Act - do whatever the eneAvion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();
    }
    
    public void muevete()
    {
        {
            setLocation(getX() + velX, getY() + velY);
            
            if(getX()<tam||getX()>=480-tam)
            {
                velX=-1*velX;
            }
        }
    }
}
