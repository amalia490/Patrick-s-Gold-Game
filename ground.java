import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground extends Actor
{
    /**
     * Act - do whatever the ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ground()
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
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(550)+350);
        }
    }
}
