import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground3 extends Actor
{
    /**
     * Act - do whatever the ground3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ground3()
    {
        GreenfootImage image = getImage();
        image.scale(200, 30);
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
        if (getX() == 0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(198)+125);
        }
    }
}
