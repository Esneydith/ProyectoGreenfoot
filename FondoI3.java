import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FondoI3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FondoI3 extends Actor
{
    /**
     * Act - do whatever the FondoI3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      setLocation(getX()-4, getY());
        
        if(getX()<-1200)
        {
            getWorld().removeObject(this);

        }
        
    }    
}
