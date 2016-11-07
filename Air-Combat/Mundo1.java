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

    private Bala bala; //se declara una clase bala
    private int proyectil; //indica que tipo de proyectil se dispara
  
    public Mundo1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 600, 1); 
        prepare();
    }
    public void act()
    {

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
        Avion avion = new Avion();
        addObject(avion,240,560);
    }
}
