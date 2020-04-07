import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terran extends World
{

   private int contador = -1;
   

   
    public Terran()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1, false);
        setPaintOrder(GananTerran.class);
        prepare ();
        Greenfoot.setSpeed(20);

        }
    public void act(){
        
        
        contenidoWorld();
    }
    public void prepare (){
    FondoI2 fondo= new  FondoI2();
    addObject(fondo,getWidth()/2, getHeight()/2);
    GananTerran texto= new GananTerran();
    addObject(texto,getWidth()/2, getHeight()/2);
    }
    public void contenidoWorld()
    {
        if(Greenfoot.isKeyDown("enter")) 
        {
            Greenfoot.setWorld(new Creditos());
            
        }
    
        if(contador==-1)
        {
        FondoI2 fondo= new  FondoI2();
        addObject(fondo,getWidth()+getWidth()/2, getHeight()/2);
        contador=0;
        }
        
        contador++;
        
        if(contador==300)
        {
            FondoI2 fondo= new  FondoI2();
            addObject(fondo,getWidth()+getWidth()/2, getHeight()/2);
            contador=1;
            
            
            
        }
    
    }
}
