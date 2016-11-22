import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JuegoNuevo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JuegoNuevo extends Boton
{
    /**
     * Act - do whatever the JuegoNuevo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        click();
    }
    
    public void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            GreenfootImage image = getImage(); //guarda la imagen actual del avion para que no se pierda cuando se reemplaze
            JuegoNuevoP juegonuevo = new JuegoNuevoP(); //nueva clase ayuda para boton presionado
            setImage(juegonuevo.getImage()); //remplaza la imagen de el boton para ver animacion
            Greenfoot.delay(10); //retrazo para permitir ver la animacion
            setImage(image);
            Greenfoot.setWorld(new Mundo1());
        }
    } 
}
