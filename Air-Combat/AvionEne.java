import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eneAvion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvionEne extends Enemigos
{
    private int tam = 10;
    private int velX = 2;
    private int velY = 2;
    /**
     * Act - do whatever the eneAvion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();
        elimina();
    }
    
    public void muevete()
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
            
       //if(getY()<=tam||getY()>=480-tam)
       //{
       //   World mundo = getWorld();
       //   getWorld().removeObject(this);
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
}
