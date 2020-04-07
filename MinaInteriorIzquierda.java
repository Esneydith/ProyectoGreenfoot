import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinaInteriorIzquierda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinaInteriorIzquierda extends Minas
{
       public int cantidadOroIMI = 0 ;
    public void act() 
    {
        
        colisiones();
        if (cantidadOroIMI >=4000){
        getWorld().removeObject(this);
        }
    } 
    public void colisiones (){
    Actor  mineroI =getOneIntersectingObject(ConstructorZerg.class);
    Actor  mineroD =getOneIntersectingObject(ConstructorTerran.class);
    if (mineroI != null||mineroD != null){
        cantidadOroIMI++;
        
    }
    
    }   
}
