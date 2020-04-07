import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuerreroTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuerreroTerran extends TerranDerecha
{
     GreenfootSound laser = new GreenfootSound ("laser.mp3");

    public void act() 
    {
       move();
       colisiones();
       cambioDireccion(); 
    }  
    public void move (){
        //turn(Greenfoot.getRandomNumber(40)-19);
        
        if (atWorldEdge()){
        turn(13);
        }
        if(vidaGueDer<=0){
        move (0);
        }
        else if (vidaGueDer >0){
        move(2);
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
    if (Greenfoot.isKeyDown("6")){
    turn (-3);
    }
    if (Greenfoot.isKeyDown("3")){
    turn (3);
    }
   }
   public void colisiones(){
    Actor  Zerg =getOneIntersectingObject(ZergIzquierda.class);
    Actor  Oponente =getOneIntersectingObject(GuerreroZerg.class);
    Actor  Rocas =getOneIntersectingObject(Rocas.class);
    Actor  Yacimientos =getOneIntersectingObject(Yacimientos.class);
    Actor  Limite =getOneIntersectingObject(LimiteSuperior.class);
    Actor Terran =getOneIntersectingObject(TerranDerecha.class);
    Actor  Minas =getOneIntersectingObject(Minas.class);
    Actor Healt  =getOneIntersectingObject(HealtDerecho.class);
    Actor Medico =getOneIntersectingObject(MedicoTerran.class);
    
    if (Rocas != null||Zerg != null || Healt != null||Terran!=null ||Yacimientos != null
    ){
    turn (Greenfoot.getRandomNumber(90)-46);
    }
    if(Limite !=null){
    turn (180);
    }
    if(Zerg != null){
        laser.play();
    vidaGueDer= vidaGueDer-5;
    }
    if (Medico !=null){
    
    vidaGueDer = vidaGueDer+20;
    if(vidaGueDer >100){
    vidaGueDer=100;
    }
        
    }
    if(vidaGueDer<0){
    vidaGueDer=0;
    }
    
    }
   
}
