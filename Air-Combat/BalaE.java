import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaE extends Actor
{
    private int velBalaE=2; //variable para indicar la velocidad a la que se mueve la bala
    /**
     * Act - do whatever the BalaE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete(); 
    }
    public void muevete() //metodo lograr el movimiento de la bala
    {
        setLocation(getX(),getY()+velBalaE); //moviemiento de la bala hacia arriba
        if(isAtEdge())
        {
            World mundo = getWorld();
            ((Mundo1)mundo).removeObject(this); //borra la bala al llegar al borde de la pantalla
        }
    }
}
