import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo extends World
{

    private int contador = -1;
    GreenfootSound musicaFondo = new GreenfootSound ("Destiny tema.mp3");
    public Fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1, false);
        setPaintOrder(Texto1.class);
        prepare ();
        Greenfoot.setSpeed(20);

        }
    public void act(){
        musicaFondo.playLoop();
        musicaFondo.setVolume(80);
        contenidoWorld();
    }
   
    public void contenidoWorld()
    {
    if(Greenfoot.isKeyDown("enter")) 
        {
            Greenfoot.setWorld(new Fondo2());
            musicaFondo.stop();
        }
        if(contador==-1)
        {
        Fondo1 fondo= new  Fondo1();
        addObject(fondo,getWidth()+getWidth()/2, getHeight()/2);
        contador=0;
        }
        
        contador++;
        
        if(contador==300)
        {
            Fondo1 fondo= new  Fondo1();
            addObject(fondo,getWidth()+getWidth()/2, getHeight()/2);
            contador=1;
            
            
            
        }
    
    }
     public void prepare (){
    Fondo1 fondo= new  Fondo1();
    addObject(fondo,getWidth()/2, getHeight()/2);
    Texto1 texto= new Texto1();
    addObject(texto,getWidth()/2, getHeight()/2);
    }
}