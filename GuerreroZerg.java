import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuerreroZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuerreroZerg extends ZergIzquierda
{
    GreenfootSound pelea = new GreenfootSound ("laser.mp3");

    
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
        else if (vidaGueIzq >0){
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
    if (Greenfoot.isKeyDown("q")){
    turn (-3);
    }
    if (Greenfoot.isKeyDown("a")){
    turn (3);
    }
   }
   public void colisiones(){
    Actor  Zerg =getOneIntersectingObject(ZergIzquierda.class);
    Actor  Oponente =getOneIntersectingObject(GuerreroTerran.class);
    Actor  Rocas =getOneIntersectingObject(Rocas.class);
    Actor  Yacimientos =getOneIntersectingObject(Yacimientos.class);
    Actor  Limite =getOneIntersectingObject(LimiteSuperior.class);
    Actor Terran =getOneIntersectingObject(TerranDerecha.class);
    Actor  Minas =getOneIntersectingObject(Minas.class);
    Actor Healt  =getOneIntersectingObject(HealtDerecho.class);
    Actor Medico =getOneIntersectingObject(MedicoZerg.class);
    
    if (Rocas != null||Zerg != null ||Healt != null||Terran!=null ||Yacimientos != null
    ){
    turn (Greenfoot.getRandomNumber(90)-46);
    }
    if(Limite !=null){
    turn (180);
    }
    if(Terran != null){
        pelea.play();
    vidaGueIzq= vidaGueIzq-4;
    }
    if (Medico !=null){
    vidaGueIzq = vidaGueIzq+20;
    if(vidaGueIzq >100){
    vidaGueIzq=100;
    }
    if(vidaGueIzq<0){
    vidaGueIzq=0;
    }
    
        
    }
    
    
    }   
}
