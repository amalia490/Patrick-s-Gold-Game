import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin extends Actor
{
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public coin()
    {
        this(20, 20);
    }
    public coin(int width, int height)
    {
        GreenfootImage image=getImage(); //asociaza brick la var image
        image.scale(width, height);
        setImage(image);
       
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
        if(getX() == 0)
            {
                getWorld().removeObject(this);
            }
    }
}
