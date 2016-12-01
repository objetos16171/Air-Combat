import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eneHeli here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicoptero extends Enemigos
{
    private SimpleTimer reloj;
    private int vida = 0;
    public Helicoptero(){
        reloj = new SimpleTimer();
    }
    /**
     * Act - do whatever the eneHeli wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        if(Greenfoot.getRandomNumber(100) < 10)
        {
           turn(Greenfoot.getRandomNumber(90)); 
        }
        if(reloj.millisElapsed() > 1000){
           disparaEnemigo();
           reloj.mark();
        }
        elimina();
    }
    
    public void elimina()
    {
      if(isTouching(Bala.class))
      {
        vida++;
        World mundo = getWorld();
        if(vida==2)
        {
         Explocion explo = new Explocion(); //se crea una explocion
         setImage(explo.getImage()); //pone una explocion
         Greenfoot.delay(1); //se realiza un delay para visualizar explosion
         getWorld().removeObject(this);
        }
      }
      else if(isTouching(Bomba.class))
      {
         World mundo = getWorld();
         Explocion explo = new Explocion(); //se crea una explocion
         setImage(explo.getImage()); //pone una explocion
         Greenfoot.delay(1); //se realiza un delay para visualizar explosion
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
