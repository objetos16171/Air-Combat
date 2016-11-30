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
        mueveyExplota();
    }
    
    public void mueveyExplota()
    {
        setLocation(getX(), getY()-velBomb);
        if(getY() == 150 || isTouching(Enemigos.class)||isAtEdge())
        {
            GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda
            
            fase2 f2 = new fase2(); ///se crea nuevo objero fase2
            setImage( f2.getImage());//se reemplaza la imagen por la de fase 2
            fase3 f3 = new fase3(); ///se crea nuevo objero fase3
            setImage( f3.getImage());//se reemplaza la imagen por la de fase 3
            Greenfoot.delay(2); //delay para ver la animacion
            World mundo = getWorld();
            ((Mundo1)mundo).removeObject(this);
            
        }
    }
}
