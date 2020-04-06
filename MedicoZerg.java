import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicoZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoZerg extends ZergIzquierda
{
    /**
     * Act - do whatever the MedicoZerg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        colisiones();
        cambioDireccion();
    } 
    public void move (){
        //turn(Greenfoot.getRandomNumber(40)-19);
        move(2);
        if (atWorldEdge()){
        turn(13);
        }
     
    }
    public boolean atWorldEdge(){
       if(getX() < 10 || getX() > getWorld().getWidth() - 10) {
        return true;
    }

     if(getY() < 10 || getY() > getWorld().getHeight() - 10) {
     return true; 
    }
    else {
        return false;
    }
    }
    public void cambioDireccion(){
    if (Greenfoot.isKeyDown("e")){
    turn (-3);
    }
    if (Greenfoot.isKeyDown("d")){
    turn (3);
    }
    
    
    }
    public void colisiones (){
    Actor  Zerg =getOneIntersectingObject(ZergIzquierda.class);
    Actor  Rocas =getOneIntersectingObject(Rocas.class);
    Actor  Yacimientos =getOneIntersectingObject(Yacimientos.class);
    Actor  Limite =getOneIntersectingObject(LimiteSuperior.class);
    Actor Terran =getOneIntersectingObject(TerranDerecha.class);
    Actor  Minas =getOneIntersectingObject(Minas.class);
    Actor Healt  =getOneIntersectingObject(HealtIzquierdo.class);


   
    if (Rocas != null||Zerg != null || Yacimientos != null || Limite != null||Minas != null){
    turn (Greenfoot.getRandomNumber(90)-46);
    }
    if (Healt != null){
       // Greenfoot.playSound("healtCenter.mp3");
        
        if ( curacionMedIzq <100){
            
       
        curacionMedIzq= curacionMedIzq+20;
        if (curacionMedIzq >100){
        curacionMedIzq=100;    
        }
        }
    }
    if (Zerg != null){
        turn(-13);
     //guardar metodo para curacion...
    }
    }
}
