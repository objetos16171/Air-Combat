import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WAyuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WAyuda extends Mundo
{

    /**
     * Constructor for objects of class WAyuda.
     * 
     */
    public WAyuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(480 , 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Regresar regresar = new Regresar();
        addObject(regresar,242,592);
        regresar.setLocation(238,584);
    }
}
