import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class abeja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playertwo extends Actor
{
    /**
     * Act - do whatever the abeja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public GreenfootImage[] images= new GreenfootImage[8];
   public int jeda =0, num=0, vidaOponente = 0;

   
    public void act() 
    {
        move();
        colisiones();
       
        if(jeda==0)jeda=10;
       if(jeda==1)
       {
           setImage(images[num]);
           num++;
           if(num>=images.length)num=0;
       }
       if(jeda>0)jeda--;
        
      } 
    public void move(){
        
        if ( Greenfoot.isKeyDown("left") )
        {
            turn(-5);
            
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("up"))
        {move(3);
        }
        
    }
    public void colisiones (){  
      Actor  Playerone =getOneIntersectingObject(Playerone.class);
      Actor  Rocas =getOneIntersectingObject(Roca1.class);
      Actor oponente =getOneIntersectingObject(Playerone.class);
      //BarraSaludDerecha bsi = (BarraSaludDerecha)getOneIntersectingObject(BarraSaludDerecha.class);
      Actor limt =getOneIntersectingObject(limite.class);
      Actor bases =getOneIntersectingObject(BaseD.class);
      Actor basesE =getOneIntersectingObject(BaseI.class);

      

        if ( Playerone != null ){
            vidaOponente = vidaOponente+2;
            turn (-10);
            if (vidaOponente >=500){
             getWorld().removeObject(oponente);
            // getWorld().removeObject(bsi);
            }
            }
        if (Rocas != null||limt != null ||bases != null||basesE != null ){
        turn (-10);
        }
        
        
       

    }
    
    //metodo para la animacion
    public void addedToWorld(World Ground){
        for(int i=0; i<images.length; i++)
        {
            images[i]=new GreenfootImage("Playertwo"+i+".png");
        }
        setImage(images[0]);
    }
    
}
