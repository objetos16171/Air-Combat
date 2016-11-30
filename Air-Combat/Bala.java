import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int velBala=2; //variable para indicar la velocidad a la que se mueve la bala
    private int X = 0;
    public void act() 
    {
        muevete(); 
    }
    
    public void setGiro(int recibeGiro,int x){
            turn(recibeGiro);
            X = x;
    }

    public void muevete() //metodo lograr el movimiento de la bala
    {
        setLocation(getX()+X,getY()-velBala); //moviemiento de la bala hacia arriba
        if(isAtEdge())
        {
            World mundo = getWorld();
            ((Mundo1)mundo).removeObject(this); //borra la bala al llegar al borde de la pantalla
        }
    }
}
