import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstacol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstacol extends Actor
{
    /**
     * Act - do whatever the obstacol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act()
    {
        explodeOnCollison();
        if(Greenfoot.isKeyDown("right"))
        {
            move(-6);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(6);
        }
        if(getX() == 0)
            {
                getWorld().removeObject(this);
            }
    }
    private void explodeOnCollison(){
       Actor collidingSpiridus = getOneIntersectingObject(spiridus.class);
       if(collidingSpiridus!=null)
       {
           getWorld().removeObject(collidingSpiridus);
           setImage("explosion2.png");
           Greenfoot.delay(20);
           Greenfoot.setWorld(new endGame());
       }
    } 
}
