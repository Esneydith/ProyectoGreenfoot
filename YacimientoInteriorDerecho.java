import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YacimientoInteriorDerecho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YacimientoInteriorDerecho extends Yacimientos
{
    public int cantidadEnergiaYID = 0 ;
    public void act() 
    {
        colisiones();
        if (cantidadEnergiaYID >=4000){
        getWorld().removeObject(this);
        }
    } 
    public void colisiones (){
    Actor  mineroI =getOneIntersectingObject(ConstructorZerg.class);
    Actor  mineroD =getOneIntersectingObject(ConstructorTerran.class);
    if (mineroI != null||mineroD != null){
        cantidadEnergiaYID++;
        
    }
    
    }      
}
