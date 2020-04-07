import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorTerran extends TerranDerecha
{
   
    
    public void act() 
    {
      move();
      colisiones();
      cambioDireccion();
      if(oroTotalDer >=500 && energiaTotalDer>= 500){
            
            Greenfoot.setWorld(new Terran());
            
        
        }
    }  
    public void move (){
        //turn(Greenfoot.getRandomNumber(40)-19);
        
        if (atWorldEdge()){
        turn(13);
        }
        if(vidaConsDer1<=0){
        move (0);
        }
        else if (vidaConsDer1 >0){
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
    if (Greenfoot.isKeyDown("2")){
    turn (-3);
    }
    if (Greenfoot.isKeyDown("5")){
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
    Actor Nave =getOneIntersectingObject(NaveDerecha.class);
    Actor Medico =getOneIntersectingObject(MedicoTerran.class);

   
    if (Rocas != null||Zerg != null ||Healt != null||Terran!=null){
    turn (Greenfoot.getRandomNumber(90)-46);
    }
    if(Limite !=null){
    turn (180);
    }
    if (Yacimientos != null){
    
     energiaConsDer1= energiaConsDer1+20;
        
     if ( energiaConsDer1 >100){
       energiaConsDer1= 100;
      }
    }
    if (Minas !=null){
     

    oroConsDer1=oroConsDer1+20;
    if(oroConsDer1 >100){
        oroConsDer1=100;
    }
    }
    if(Zerg != null){
    vidaConsDer1=vidaConsDer1-4;
    
    }
    if(Nave !=null){
        oroTotalDer=oroTotalDer+oroConsDer1;
        oroConsDer1=0;
        energiaTotalDer= energiaTotalDer+energiaConsDer1;
        energiaConsDer1=0;
    }
    if(Medico !=null){
    vidaConsDer1 = vidaConsDer1+20;
    if(vidaConsDer1 >100){
    vidaConsDer1=100;
    }
    if(vidaConsDer1>= 100){
    vidaConsDer1=100;
    }
    }
    if (Oponente !=null){
    vidaConsDer1= vidaConsDer1-20;
    }
    
    }
}
