import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinaDerecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinaDerecha extends Minas
{
    public int cantidadOroMD = 0 ;
    public void act() 
    {
        colisiones();
        if (cantidadOroMD >=1000){
        getWorld().removeObject(this);
        }
    } 
    public void colisiones (){
    Actor  mineroI =getOneIntersectingObject(ConstructorZerg.class);
    Actor  mineroD =getOneIntersectingObject(ConstructorTerran.class);
    if (mineroI != null||mineroD != null){
        cantidadOroMD++;
        
    }
    
    }
}
