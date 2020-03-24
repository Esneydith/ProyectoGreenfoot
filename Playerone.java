import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A car that can be driven with the right/left cursor keys.
 * 
 * @author mik 
 * @version 1.0
 */
public class Playerone extends Actor
{
    
    //variables de la clase
    public int vidaOpo =0;
    
    /**
     * Drive and allow steering.
     */
    public void act()
    {  move ();
       colisiones();
        
       
       
    }
    public void colisiones (){
      Actor limt =getOneIntersectingObject(limite.class);
      Actor bases =getOneIntersectingObject(BaseD.class);
      Actor basesE =getOneIntersectingObject(BaseI.class);
      Actor  Playerone =getOneIntersectingObject(Playerone.class);
      Actor  Rocas =getOneIntersectingObject(Roca1.class);
      Actor oponente =getOneIntersectingObject(Playerone.class);
      if ( Playerone != null ){
            vidaOpo = vidaOpo+2;
            turn (-10);
            if (vidaOpo >=500){
             getWorld().removeObject(oponente);
            // getWorld().removeObject(bsi);
            }
            }
        if (Rocas != null||limt != null ||bases != null||basesE != null ){
        turn (-10);
        }
    
    }
    public void move ()
    {
         if(Greenfoot.isKeyDown("w")){
        move(2);}
        if ( Greenfoot.isKeyDown("a") )
        {
            turn(-5);
        }
        if ( Greenfoot.isKeyDown("d") )
        {
            turn(5);
        }
    }
}