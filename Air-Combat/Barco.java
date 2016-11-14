import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eneBarco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barco extends Enemigos
{
    private int tam = 10;
    private int velX;
    private int velY = 2;
    private SimpleTimer reloj;
    /**
     * Act - do whatever the eneAvion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Barco()
    {
        setLocation(Greenfoot.getRandomNumber(480), 0);
        reloj = new SimpleTimer();
    }
    
    public void act() 
    {
        muevete();
        if(reloj.millisElapsed() > 1000){
           disparaEnemigo();
           reloj.mark();
        }
        elimina();
    }
    
    public void muevete()
    {
       setLocation(getX() + velX, getY() + velY); 
       if(getX()<tam||getX()>=480-tam)
       {
          velX=-1*velX;
       }
            
       //if(getY()<=tam||getY()>=480-tam)
       //{
       //  World mundo = getWorld();
       //  getWorld().removeObject(this);
       //}
    }
    
    public void elimina()
    {
      if(getY()<=tam||getY()>=480-tam)
      {
         World mundo = getWorld();
         getWorld().removeObject(this); 
      }  
      else if(isTouching(Bala.class))
      {
         World mundo = getWorld();
         getWorld().removeObject(this);
      }
      else if(isTouching(Bomba.class)) 
      {
         World mundo = getWorld();
         getWorld().removeObject(this);
      }
    }
    public void disparaEnemigo()
    {
            GreenfootImage image = getImage();
            BalaE balaE = new BalaE();
            World mundo = getWorld();
            ((World)mundo).addObject(balaE, getX(), getY()+100);
            //Greenfoot.delay(1);
            setImage(image); 
    }
}
