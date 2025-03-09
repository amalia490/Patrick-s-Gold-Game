import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gold extends Actor
{
    /**
     * Act - do whatever the gold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gold()
    {
        this(200,100);
    }
    public gold(int width, int height)
    {
        GreenfootImage image=getImage(); //asociaza brick la var image
        image.scale(width, height);
        setImage(image);
    }
    private void win()
       {Actor collidingGold = getOneIntersectingObject(spiridus.class);
       if(collidingGold!=null)
       {
           getWorld().removeObject(collidingGold);
           setImage("Untitled4.png");
           Greenfoot.delay(20);
           Greenfoot.setWorld(new End());
           
        }
    }

        public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(-6);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(6);
        }
        win();
    }
}
