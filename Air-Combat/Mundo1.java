import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo1 extends Mundo
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    GreenfootSound myMusic = new GreenfootSound("M1.mp3");
    private Bala bala; //se declara una clase bala
    private int proyectil; //indica que tipo de proyectil se dispara
    private int numVidas = 3;//variable del contador de vidas del avion
    private int nucleos = 4;
    private Letrero textoVidas = null;//inicializacion de un texto para el contador de vidas
    public final int TIEMPO_ENEMIGO = 15;
    public final int TIEMPO_ITEM = 30;
    public final int TIEMPO_NIVEL = 60;
    private SimpleTimer reloj;
    private SimpleTimer reloji;
    private SimpleTimer relojn;
    private SimpleTimer relojj;
    private int xn = 0;
    private int xe;
    private int xi;
    private int xj;
    
    public Mundo1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        //super(480, 600, 1);
        relojn = new SimpleTimer();
        reloj = new SimpleTimer();
        reloji = new SimpleTimer();
        relojj = new SimpleTimer();
        prepare();
    }
    
    public void act()
    {
      myMusic.playLoop();
      llamaEnemigos();
      llamaItem();
      creaJefe();
      if(relojn.millisElapsed() > 1000)
        {
           xn++;
           relojn.mark();
        }
      
      if(xn == 60)
        {
          GreenfootImage Fondo2 = new GreenfootImage("Fondo.jpg");
          setBackground(Fondo2);
        }
        
      if(xn == 120)
      {
          GreenfootImage Fondo3 = new GreenfootImage("Fondo.jpg");
          setBackground(Fondo3);
      }
      
      if(xn == 180)
      {
          GreenfootImage Fondo4 = new GreenfootImage("Fondo.jpg");
          setBackground(Fondo4);
      }
    }
    
    public void creaJefe()
    {
        if(relojj.millisElapsed() > 180000)
        {
           Jefe jefe = new Jefe();
           addObject(jefe, Greenfoot.getRandomNumber(470) + 10, 85);
           relojj.mark();
        }

    }
    
    public void pierdeVida()//metodo para reducir el contador de vidas y cambiar el texto
    {
       nucleos --;
       textoVidas.setText("Vidas: " + numVidas + "    Nucleos:" + nucleos);//envia un texto para modificar el mensaje a mostrar en el letrero
       if(nucleos == 0){
           numVidas--;//reduce el numero de vidas del avion
           if (numVidas == 0)//verifica si se terminaron las vidas
           {
               textoVidas.setText("Perdiste");//envia un texto para modificar el mensaje a mostrar en el letrero
               Greenfoot.stop();//se detiene el juego al perder todas las vidas del avion
           }
           nucleos = 4;
       }    
    }
    
    public void llamaEnemigos()
    {
        if(reloj.millisElapsed() > 3000)
        {
           xe = Greenfoot.getRandomNumber(3);
           if(xe == 0)
           {
               Barco barco = new Barco();
               addObject(barco, Greenfoot.getRandomNumber(470) + 10, 10);
           }
           else
           if(xe == 1)
           {
              Helicoptero heli = new Helicoptero();
              addObject(heli, Greenfoot.getRandomNumber(470) + 10, 10); 
           }
           else
           if(xe == 2)
           {
              AvionEne AvE = new AvionEne();
              addObject(AvE, Greenfoot.getRandomNumber(470) + 10, 10); 
           }
           reloj.mark();
        }
    }
    
    public void llamaItem()
    {
       if(reloji.millisElapsed() > 15000)
        {
           xi = Greenfoot.getRandomNumber(3);
           if(xi == 0)
           {
               BombaMej bombam = new BombaMej();
               addObject(bombam, Greenfoot.getRandomNumber(470) + 10, 10);
           }
           else
           if(xi == 1)
           {
              MejoraVBala mVB = new MejoraVBala();
              addObject(mVB, Greenfoot.getRandomNumber(470) + 10, 10); 
           }
           if(xi == 2)
           {
              MejoraVBala2 mVB2 = new MejoraVBala2();
              addObject(mVB2, Greenfoot.getRandomNumber(470) + 10, 10); 
           }
           reloji.mark();
        } 
    }

    /*public void colocaProyectil() //coloca un proyectil para derrivar un enemigo
    {
    int x,y; // variable para guardar la posicion del avion
    Avion avion = new Avion(); //se crea una clase avion
    if(avion.dispara()==1) //decide que tipo de proyectil disparar 1=bala
    {
    bala = new Bala();
    addObject(bala,200,150);

    }

    }*/

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()//inicializacion de los objetos
    {
        addObject(new Avion(),240,560);
        textoVidas = new Letrero("Vidas: " + numVidas + "    Nucleos: " + nucleos);
        addObject(textoVidas,75,30);
        textoVidas.setText("Vidas: " + numVidas + "    Nucleos: " + nucleos);
    }
}
