import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelea extends World
{
    
    
    public Pelea()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1, false);
    }
    
    public void act(){
        
    
    
    
    }
    
    public void prepare (){
    FondoPelea fondo= new  FondoPelea();
    addObject(fondo,getWidth()/2, getHeight()/2);
    
}
}
