import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        JuegoNuevo juegonuevo = new JuegoNuevo();
        addObject(juegonuevo,225,268);
        juegonuevo.setLocation(233,245);
        juegonuevo.setLocation(229,244);
        juegonuevo.setLocation(232,246);
        Ayuda ayuda = new Ayuda();
        addObject(ayuda,241,324);
        ayuda.setLocation(229,324);
        ayuda.setLocation(234,310);
    }
}
