import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jefe extends Actor
{
    private SimpleTimer reloj;
    private int tam = 10;
    private int velX = 2;
    private int velY;
    private int vida = 0;
    
    /**
     * Act - do whatever the Jefe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jefe(){
        reloj = new SimpleTimer();
    }
    
    public void act() 
    {
        muevete();
        disparaEnemigo();
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
<<<<<<< HEAD
           vida++;
       }
       if(isTouching(Bomba.class))
       {
           vida += 5;
       }
       if(vida==800)
       {
           explosion();
       }
    }
    public void explosion(){
             Explocion explo = new Explocion(); //se crea una explocion
             setImage(explo.getImage()); //pone una explocion
             Greenfoot.delay(1); //se realiza un delay para visualizar explosion
             getWorld().removeObject(this);        
    }
    
    public void disparaEnemigo()
    {
        if(reloj.millisElapsed() > 1000){
            creaImagen(30,95);
            creaImagen(-30,95);
            creaImagen(90,55);
            creaImagen(-90,55);
            reloj.mark();
=======
          vida++;
          World mundo = getWorld();
          if(vida==1000)
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
          if(vida==1000)
          {
             Explocion explo = new Explocion(); //se crea una explocion
             setImage(explo.getImage()); //pone una explocion
             Greenfoot.delay(1); //se realiza un delay para visualizar explosion
             getWorld().removeObject(this);
             Greenfoot.stop();
          }
>>>>>>> origin/master
        }
    }
    
    public void creaImagen(int x, int y)
    {
        GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda
        World mundo = getWorld();
        BalaE bala = new BalaE();
        ((World)mundo).addObject(bala,getX()+x,getY()+y); //coloca la bala justo enfrente del avion
        if(x == 90)
            bala.setGiro(30,1);
        if(x == -90)
            bala.setGiro(-30,-1);
        setImage(image); //se recupera la imagen original del avion
    }
}