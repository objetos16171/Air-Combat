import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BombaMej here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BombaMej extends Item
{
    /**
     * Act - do whatever the BombaMej wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage bomba = new GifImage("Bomba.gif");
    
    public void act() 
    {
        Animacion(); //llamada a metodo animacion
        
    }
    
    public void Animacion()
    {
        setImage(bomba.getCurrentImage()); //actualiza la imagen a el gif
    }    
}
