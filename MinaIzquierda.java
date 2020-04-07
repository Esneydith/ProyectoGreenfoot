import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinaIzquierda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinaIzquierda extends Minas
{
    public int cantidadOroMI = 0 ;
    public void act() 
    {
        colisiones();
        if (cantidadOroMI >=1000){
        getWorld().removeObject(this);
        }
    } 
    public void colisiones (){
    Actor  mineroI =getOneIntersectingObject(ConstructorZerg.class);
    Actor  mineroD =getOneIntersectingObject(ConstructorTerran.class);
    if (mineroI != null||mineroD != null){
        cantidadOroMI++;
        
    }
    
    }   
}
