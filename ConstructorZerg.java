import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorZerg extends ZergIzquierda
{
  

    
    public void act() 
    {
      move();
      colisiones();
      cambioDireccion();  
      if(oroTotalIzq >=500 && energiaTotalIzq>= 500){
            
            Greenfoot.setWorld(new Zerg());
            
        
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
    if (Greenfoot.isKeyDown("w")){
    turn (-3);
    }
    if (Greenfoot.isKeyDown("s")){
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
    Actor Nave =getOneIntersectingObject(NaveIzquierda.class);
    Actor Medico =getOneIntersectingObject(MedicoZerg.class);


   
    if (Rocas != null||Zerg != null || Healt != null||Terran!=null){
    turn (Greenfoot.getRandomNumber(90)-46);
    }
    if(Limite !=null){
    turn (180);
    }
    if(Terran !=null){
    vidaConsDer1=vidaConsDer1-3;
    }
    if (Yacimientos != null){
       
        energiaConsIzq1= energiaConsIzq1+20;
        
     if ( energiaConsIzq1 >100){
       energiaConsIzq1= 100;
      }
    }
    if (Minas != null){
        
        oroConsIzq1= oroConsIzq1+20;
        
     if ( oroConsIzq1 >100){
       oroConsIzq1= 100;
      }
    }
    if(Nave !=null){
        oroTotalIzq=oroTotalIzq+oroConsIzq1;
        oroConsIzq1=0;
        energiaTotalIzq= energiaTotalIzq+energiaConsIzq1;
        energiaConsIzq1=0;
    }
    if (Oponente !=null){
    vidaConsIzq1= vidaConsIzq1-20;
    }
    if(Medico !=null){
    
    vidaConsIzq1 = vidaConsIzq1+20;
    if(vidaConsIzq1 >100){
    vidaConsIzq1=100;
    }
    if(vidaConsIzq1<0){
    vidaConsIzq1=0;
    }
    }
    }
   
}
