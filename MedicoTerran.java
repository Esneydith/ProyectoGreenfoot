import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoTerran extends TerranDerecha
{
    /**
     * Act - do whatever the Medico wants to do. This method is called whenever
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
    if (Greenfoot.isKeyDown("1")){
    turn (-3);
    }
    if (Greenfoot.isKeyDown("4")){
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
    Actor Healt  =getOneIntersectingObject(HealtDerecho.class);


   
    if (Rocas != null||Zerg != null || Yacimientos != null || Limite != null||Minas != null){
    turn (Greenfoot.getRandomNumber(90)-46);
    }
    if (Healt != null){
       // Greenfoot.playSound("healtCenter.mp3");
        
        if ( curacionMedDer <100){
            
       
        curacionMedDer= curacionMedDer+20;
        if (curacionMedDer >100){
        curacionMedDer=100;    
        }
        }
    }
    if (Terran != null){
    turn (-13);
    //guardar metodo para curaciones...
    }
    }
    
    
    
    
    
    
    
    
    
    
}
