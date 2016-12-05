import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends Mundo
{

    /**
     * Constructor for objects of class Creditos.
     * 
     */
    public Creditos()
    {
        prepare();
    }


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        Regresar regresar = new Regresar();
        addObject(regresar,262,552);
        regresar.setLocation(250,552);

    }
}
