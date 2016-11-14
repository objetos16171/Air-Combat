import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avion extends Actor
{
    private SimpleTimer reloj;
    public Avion(){
        reloj = new SimpleTimer();
    }
    /**
     * Act - do whatever the Avion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        muevete();
        dispara();
        bomba();
        if(isTouching(Enemigos.class)||isTouching(BalaE.class)){
            World mundo = getWorld();
            ((Mundo1)mundo).pierdeVida();
            getWorld().removeObject(this);
        }
    }
    public void muevete()//metodo para realizar los movimientos del avion con las teclas
    {
        setLocation(getX(), getY());//se obtinen las variables de ubicacion del objeto
        if(Greenfoot.isKeyDown("left") && getX() > 45)//se verifica que se presione la tecla left y si ha golpeado la pared izquierda
            mueveteIzquierda();
        if(Greenfoot.isKeyDown("right") && getX() < 480-45)//se verifica que se presione la tecla left y si ha golpeado la pared derecha
            mueveteDerecha();
        if(Greenfoot.isKeyDown("down") && getY() < 600-40)//se verifica que se presione la tecla down y si ha golpeado la pared de abajo
            setLocation(getX(), getY()+1);//se mueve hacia abajo el avion
        if(Greenfoot.isKeyDown("up") && getY() > 40)//se verifica que se presione la tecla up y si ha golpeado la pared de arriba
            mueveteAdelante();
    }
    /**
     * decide que clase de proyectil se dispara
     * dispara el proyectil
     */
    public void dispara()
    {
        if(Greenfoot.isKeyDown("space") && reloj.millisElapsed() > 300)
        {
           GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda cuando se reemplaze
           Bala bala = new Bala();
           World mundo = getWorld();
           ((World)mundo).addObject(bala,getX(),getY()-60); //coloca la bala justo enfrente del avion
           AvionDisparo aviond = new AvionDisparo();
           setImage(aviond.getImage()); //remplaza la imagen del avion por una que simula disparo
           Greenfoot.delay(1); //retrazo para permitir ver la animacion
           setImage(image);
           reloj.mark();
        }
    }
    
    public void bomba()
    {
        if(Greenfoot.isKeyDown("b"))
        {
            GreenfootImage image = getImage();
            Bomba bomba = new Bomba();
            World mundo = getWorld();
            ((World)mundo).addObject(bomba, getX(), getY()-60);
            Greenfoot.delay(1);
            setImage(image); 
        }
    }
    
    /**
     * metodo para mover al avion a la izquierda
     * y simula decline hacia la izquierda del mismo
     */
    
    public void mueveteIzquierda()
    {
        GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda
        AvionIzquierda avionizq = new AvionIzquierda(); //se crea un avion con sentido a lado izquierdo
        setImage(avionizq.getImage()); //remplaza la imagen del avion por una que simula que el avion va hacia la izquierda
        Greenfoot.delay(1); //retrazo para permitir ver la animacion
        move(-1);//se mueve hacia la izquierda el avion
         setImage(image); //se recupera la imagen original del avion
    }
    
     /**
     * metodo para mover al avion a la derecha
     * y simula decline hacia la derecha del mismo
     */
    
    public void mueveteDerecha()
    {
        GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda
        AvionDerecha avionder = new AvionDerecha(); //se crea un avion con sentido a lado izquierdo
        setImage(avionder.getImage()); //remplaza la imagen del avion por una que simula que el avion va hacia la izquierda
        Greenfoot.delay(1); //retrazo para permitir ver la animacion
        move(1);//se mueve hacia la derecha el avion
        setImage(image); //se recupera la imagen original del avion
    }
    
     /**
     * metodo para mover al avion hacia adelante
     * y simula la fision del reactor
     */
    
    public void mueveteAdelante()
    {
        GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda
        AvionFision avionfis = new AvionFision(); //se crea un avion con sentido a lado izquierdo
        setImage(avionfis.getImage()); //remplaza la imagen del avion por una que simula que el avion va hacia la izquierda
        Greenfoot.delay(1); //retrazo para permitir ver la animacion
        setLocation(getX(), getY()-1);//se mueve hacia adelante el avion
        setImage(image); //se recupera la imagen original del avion
    }
}
