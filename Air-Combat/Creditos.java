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
    private void prepare()
    {
        Regresar regresar = new Regresar();
        addObject(regresar,242,592);
        regresar.setLocation(238,584);
    }
}
