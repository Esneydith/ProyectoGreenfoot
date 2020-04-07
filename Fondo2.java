import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo2 extends World
{

   private int contador = -1;
   GreenfootSound musicaFondo = new GreenfootSound ("Destiny tema.mp3");

   
    public Fondo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1, false);
        setPaintOrder(Texto2.class);
        prepare ();
        Greenfoot.setSpeed(20);

        }
    public void act(){
        musicaFondo.playLoop();
        musicaFondo.setVolume(80);
        contenidoWorld();
    }
    public void prepare (){
    FondoI2 fondo= new  FondoI2();
    addObject(fondo,getWidth()/2, getHeight()/2);
    Texto2 texto= new Texto2();
    addObject(texto,getWidth()/2, getHeight()/2);
    }
    public void contenidoWorld()
    {
    if(Greenfoot.isKeyDown("enter")) 
        {
            Greenfoot.setWorld(new Fondo3());
            musicaFondo.stop();
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
