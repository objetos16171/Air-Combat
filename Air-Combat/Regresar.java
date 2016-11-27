import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es un boton que funciona para regresar al menu principal
 * 
 * @author (jhidarthy) 
 * @version (27/11/2016)
 */
public class Regresar extends Boton
{
    /**
     * El boton tiene como funcion
     * regresarnos al  menu principal del juego
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
            RegresarP regresarpres = new RegresarP(); //nueva clase ayuda para boton presionado
            setImage(regresarpres.getImage()); //remplaza la imagen de el boton para ver animacion
            Greenfoot.delay(10); //retrazo para permitir ver la animacion
            setImage(image);
            Greenfoot.setWorld(new Menu());
        }
    } 
}
