import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avion extends Actor
{
    private SimpleTimer relojBala;
    private SimpleTimer relojBomba;
    private int item = 0;
    private int elapsedDisparo = 300;
    public Avion(){
        relojBala = new SimpleTimer();
        relojBomba = new SimpleTimer();
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
        adquiereItem();
        muere();
    }
    public void muevete()//metodo para realizar los movimientos del avion con las teclas
    {
        setLocation(getX(), getY());//se obtinen las variables de ubicacion del objeto
        if(Greenfoot.isKeyDown("left") && getX() > 45)//se verifica que se presione la tecla left y si ha golpeado la pared izquierda
            creaImagen(1,-3,0);
        if(Greenfoot.isKeyDown("right") && getX() < 480-45)//se verifica que se presione la tecla left y si ha golpeado la pared derecha
            creaImagen(2,3,0);
        if(Greenfoot.isKeyDown("down") && getY() < 600-40)//se verifica que se presione la tecla down y si ha golpeado la pared de abajo
            setLocation(getX(), getY()+3);//se mueve hacia abajo el avion
        if(Greenfoot.isKeyDown("up") && getY() > 40)//se verifica que se presione la tecla up y si ha golpeado la pared de arriba
            creaImagen(3,0,-3);
    }
    /**
     * decide que clase de proyectil se dispara
     * dispara el proyectil
     */
    public void dispara()
    {
        if(Greenfoot.isKeyDown("space") && relojBala.millisElapsed() > elapsedDisparo)
        {
            switch(item){
                case 0: creaImagen(4,0,-60);
                        break;
                case 1: creaImagen(4,10,-60);
                        creaImagen(4,-10,-60);
                        break;
                case 2: creaImagen(4,15,-60);
                        creaImagen(4,0,-60);
                        creaImagen(4,-15,-60);
                        break;
                case 3: creaImagen(4,15,-60);
                        creaImagen(4,-15,-60);
                        break;
            }
            relojBala.mark();
        }
    }
    
    public void bomba()
    {
        if(Greenfoot.isKeyDown("b") && relojBomba.millisElapsed() > elapsedDisparo)
        {
            creaImagen(5,0,-60);
            relojBomba.mark();
        }
    }
    
    public void muere(){
        if(isTouching(Enemigos.class)||isTouching(BalaE.class)){
            removeTouching(Enemigos.class);                
            removeTouching(BalaE.class);
            World mundo = getWorld();
            ((Mundo1)mundo).pierdeVida();
            setLocation(240,560);//se obtinen las variables de ubicacion del objeto
        }
    }

    public int adquiereItem(){
        if(isTouching(MejoraVBala2.class)){
            removeTouching(Item.class);
            item = 1;
        }
        if(isTouching(MejoraVBala.class)){
            removeTouching(Item.class);
            item = 2;
        }
        if(isTouching(BombaMej.class)){
            removeTouching(Item.class);
            item = 3;
        }
        return item;
    }

    public void creaImagen(int movimiento, int x, int y)
    {
        GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda
                    World mundo = getWorld();
        switch(movimiento){
            case 1: AvionIzquierda avionizq = new AvionIzquierda(); //se crea un avion con sentido a lado izquierdo
                    setImage(avionizq.getImage()); //remplaza la imagen del avion por una que simula que el avion va hacia la izquierda
                    break;
            case 2: AvionDerecha avionder = new AvionDerecha(); //se crea un avion con sentido a lado izquierdo
                    setImage(avionder.getImage()); //remplaza la imagen del avion por una que simula que el avion va hacia la izquierda
                    break;
            case 3: AvionFision avionfis = new AvionFision();//se crea un avion con sentido a lado izquierdo
                    setImage(avionfis.getImage());//remplaza la imagen del avion por una que simula que el avion va hacia la izquierda
                    break;
            case 4: Bala bala = new Bala();
                    ((World)mundo).addObject(bala,getX()+x,getY()+y); //coloca la bala justo enfrente del avion
                    if(x == 15)
                        bala.setGiro(30,1);
                    if(x == -15)
                        bala.setGiro(-30,-1);
                    AvionDisparo aviond = new AvionDisparo();
                    setImage(aviond.getImage()); //remplaza la imagen del avion por una que simula disparo
                    break;
            case 5: Bomba bomba = new Bomba();
                    ((World)mundo).addObject(bomba, getX()+x, getY()+y);
                    break;
        }
        Greenfoot.delay(1); //retrazo para permitir ver la animacion
        if(movimiento != 4 && movimiento != 5)
            setLocation(getX()+x, getY()+y);//se mueve hacia adelante el avion
        setImage(image); //se recupera la imagen original del avion
    }
}