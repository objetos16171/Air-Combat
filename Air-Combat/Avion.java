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
        bomba();
    }
    public void muevete()//metodo para realizar los movimientos del avion con las teclas
    {
        setLocation(getX(), getY());//se obtinen las variables de ubicacion del objeto
        if(Greenfoot.isKeyDown("left") && getX() > 45)//se verifica que se presione la tecla left y si ha golpeado la pared izquierda
            move(-1);//se mueve hacia la izquierda el avion
        if(Greenfoot.isKeyDown("right") && getX() < 480-45)//se verifica que se presione la tecla left y si ha golpeado la pared derecha
            move(1);//se mueve hacia la derecha el avion
        if(Greenfoot.isKeyDown("down") && getY() < 600-40)//se verifica que se presione la tecla down y si ha golpeado la pared de abajo
            setLocation(getX(), getY()+1);//se mueve hacia abajo el avion
        if(Greenfoot.isKeyDown("up") && getY() > 40)//se verifica que se presione la tecla up y si ha golpeado la pared de arriba
            setLocation(getX(), getY()-1);//se mueve hacia arriba el avion
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
}
