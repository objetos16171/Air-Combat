import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    GreenfootSound myMusic = new GreenfootSound("M1.mp3");
    private Bala bala; //se declara una clase bala
    private int proyectil; //indica que tipo de proyectil se dispara
    private int numVidas = 3;//variable del contador de vidas del avion
    private Letrero textoVidas = null;//inicializacion de un texto para el contador de vidas
    public final int TIEMPO_ENEMIGO = 15;
    private SimpleTimer reloj;
    private int xe; 
    public Mundo1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(480, 600, 1);
        reloj = new SimpleTimer();
        prepare();
    }
    
    public void act()
    {
        myMusic.playLoop();
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
    
    public void pierdeVida()//metodo para reducir el contador de vidas y cambiar el texto
    {
       numVidas--;//reduce el numero de vidas del avion
       if (numVidas <= 0)//verifica si se terminaron las vidas
       {
           textoVidas.setText("Perdiste");//envia un texto para modificar el mensaje a mostrar en el letrero
           Greenfoot.stop();//se detiene el juego al perder todas las vidas del avion
       }
       else
       {
          addObject(new Avion(), 200, 560);
          textoVidas.setText("Vidas: " + numVidas);//envia un texto para modificar el mensaje a mostrar en el letrero
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
        textoVidas = new Letrero("Vidas: " + numVidas);
        addObject(textoVidas,30,90);
        textoVidas.setText("Vidas: " + numVidas);
    }
}
