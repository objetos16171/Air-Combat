import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MejoraVBala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MejoraVBala extends Item
{
    /**
     * Act - do whatever the MejoraVBala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage mejora = new GifImage("MejoraVBala.gif");
    
    public void act() 
    {
        Animacion();
        
    }
    
    public void Animacion()
    {
        setImage(mejora.getCurrentImage());
    }
}
