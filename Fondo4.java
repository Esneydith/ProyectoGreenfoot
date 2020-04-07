import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo4 extends World
{
    private int contador = -1;
    GreenfootSound musicaFondo = new GreenfootSound ("Destiny tema.mp3");
    public Fondo4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1, false);
        setPaintOrder(Texto4.class);
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
            musicaFondo.stop();
            Greenfoot.setWorld(new Inicio());
            
        }
        if(contador==-1)
        {
        FondoI4 fondo= new  FondoI4();
        addObject(fondo,getWidth()+getWidth()/2, getHeight()/2);
        contador=0;
        }
        
        contador++;
        
        if(contador==300)
        {
            FondoI4 fondo= new  FondoI4();
            addObject(fondo,getWidth()+getWidth()/2, getHeight()/2);
            contador=1;
            
            
            
        }
    
    }
     public void prepare (){
    FondoI4 fondo= new  FondoI4();
    addObject(fondo,getWidth()/2, getHeight()/2);
    Texto4 texto= new Texto4();
    addObject(texto,getWidth()/2, getHeight()/2);
    }
  
}
