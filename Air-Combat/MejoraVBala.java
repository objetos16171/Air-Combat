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
    private int tam = 10;
    private int velX = 2;
    private int velY = 2;
    
    public void act() 
    {
        Animacion();
        Rebota();
    }
    
    public void Animacion()
    {
        setImage(mejora.getCurrentImage());
    }
    
    public void Rebota()
    {
       setLocation(getX() + velX, getY() + velY);
       
       if(getX()<tam||getX()>=480-tam)
       {
          velX=-1*velX;
       }
            
       if(getY()-tam<=tam)
       {
          velY=-1*velY;
       }
            
       if(getY()-tam<=tam)
       {
          velY=-1*velY;
       }
       
       if(getY()<=tam||getY()>=580)
       {
           velY=-1*velY; 
       }
    }
}
