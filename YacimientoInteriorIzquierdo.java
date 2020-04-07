import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YacimientoInteriorIzquierdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YacimientoInteriorIzquierdo extends Yacimientos
{
  public int cantidadEnergiaYII = 0 ;
    public void act() 
    {
        colisiones();
        if (cantidadEnergiaYII >=4000){
        getWorld().removeObject(this);
        }
    } 
    public void colisiones (){
    Actor  mineroI =getOneIntersectingObject(ConstructorZerg.class);
    Actor  mineroD =getOneIntersectingObject(ConstructorTerran.class);
    if (mineroI != null||mineroD != null){
        cantidadEnergiaYII++;
        
    }
    
    }  
}
