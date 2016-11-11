import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    public void act() 
    {
        move(4);
        if(Greenfoot.getRandomNumber(100) < 10)
        {
           turn(Greenfoot.getRandomNumber(90)); 
        }
    }    
}
