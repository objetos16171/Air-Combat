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
    
    /**
     * decide que clase de proyectil se dispara
     * dispara el proyectil
     */
    public void dispara()
    {
        if(Greenfoot.isKeyDown("space"))
        {
           GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda cuando se reemplaze
           Bala bala = new Bala();
           World mundo = getWorld();
           ((World)mundo).addObject(bala,getX(),getY()-60); //coloca la bala justo enfrente del avion
           AvionDisparo aviond = new AvionDisparo();
           setImage(aviond.getImage()); //remplaza la imagen del avion por una que simula disparo
           Greenfoot.delay(1); //retrazo para permitir ver la animacion
           setImage(image);
        }
        
       
    }
    
        
}
