import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends World
{

    private int contador = -1;
    
    public Creditos() { 
    super(1200, 600, 1, false);
        setPaintOrder(Creditos1.class);
        prepare ();
        Greenfoot.setSpeed(30);

        }
    public void act(){
        
        
        contenidoWorld();
    }
    public void prepare (){
    FondoI2 fondo= new  FondoI2();
    addObject(fondo,getWidth()/2, getHeight()/2);
    Creditos1 texto= new Creditos1();
    addObject(texto,getWidth()/2, getHeight()/2);
    }
    public void contenidoWorld()
    {
    
       
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
