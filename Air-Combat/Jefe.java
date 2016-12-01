import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jefe extends Actor
{
    private int tam = 10;
    private int velX = 2;
    private int velY;
    private int vida = 0;
    
    /**
     * Act - do whatever the Jefe wants to do. This method is called whenever
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
    }
    
    public void elimina()
    {
       if(isTouching(Bala.class))
       {
          vida++;
          World mundo = getWorld();
          if(vida==800)
          {
            Explocion explo = new Explocion(); //se crea una explocion
            setImage(explo.getImage()); //pone una explocion
            Greenfoot.delay(1); //se realiza un delay para visualizar explosion
            getWorld().removeObject(this);
            Greenfoot.stop();
          }
       }
       else if(isTouching(Bomba.class))
        {
          vida++;
          World mundo = getWorld();
          if(vida==800)
          {
             Explocion explo = new Explocion(); //se crea una explocion
             setImage(explo.getImage()); //pone una explocion
             Greenfoot.delay(1); //se realiza un delay para visualizar explosion
             getWorld().removeObject(this);
             Greenfoot.stop();
          }
        }
    }
}