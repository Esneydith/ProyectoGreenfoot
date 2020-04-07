import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yacimientoizquierdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YacimientoIzquierdo extends Yacimientos
{
   public int cantidadEnergiaYI = 0 ;
    public void act() 
    {
        colisiones();
        if (cantidadEnergiaYI >=1000){
        getWorld().removeObject(this);
        }
    } 
    public void colisiones (){
    Actor  mineroI =getOneIntersectingObject(ConstructorZerg.class);
    Actor  mineroD =getOneIntersectingObject(ConstructorTerran.class);
    if (mineroI != null||mineroD != null){
        cantidadEnergiaYI++;
        
    }
    
    }   
}
