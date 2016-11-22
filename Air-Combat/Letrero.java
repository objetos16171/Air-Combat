import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letrero extends Actor
{
    private String texto;//inicializacion de la variable que va a contener el texto a mostrar
    public Letrero()//consructor inicial de la clase
    {
        
    }
    public Letrero(String textoRecibido)//constructor para inicializar el contenido del letrero nuevo
    {
        texto = textoRecibido;//iguala el texto que se muestra al texto recibido
        updateImage();//llamada al metodo que mostrara el texto en el juego
    }
    /**
     * Act - do whatever the Letrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    public void setText(String textoRecibido)//metodo para modificar el contenido del texto a mostrar
    { 
        texto = textoRecibido;//iguala el texto que se muestra al texto recibido
        updateImage();//llamada al metodo que mostrara el texto en el juego
    }
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(150,50);//inicializacion del cuadro de texto que se mostrara en el juego
        image.clear();//limpia el contenido que ya tenia el cuadro de texto
        image.setColor(Color.CYAN);//color del texto
        image.drawString(texto, 5, 20);//se le asigna su contenido al cuadro de texto
        setImage(image);//se muestra el cuadro de texto en la pantalla del juego
    }  
}
