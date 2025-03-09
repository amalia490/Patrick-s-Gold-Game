import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1350, 600, 1);
        
        prepare();
   
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) <= 2)
        {
            addObject(new coin(), getWidth()-1, Greenfoot.getRandomNumber(250)+500);
        }
    }
    
    private void prepare()
    {
        spiridus spiridus = new spiridus();
        addObject(spiridus,407,132);
        spiridus.setLocation(407,132);

        Counter counter = new Counter();
        addObject(counter,80,42);
        SecretDoor secretDoor = new SecretDoor();
        addObject(secretDoor,975,260);

        secretDoor.setLocation(1311,112);
        ground ground = new ground();
        addObject(ground,62,349);
        ground ground2 = new ground();
        addObject(ground2,279,432);
        ground ground3 = new ground();
        addObject(ground3,394,194);
        spiridus.setLocation(40,273);
        ground ground4 = new ground();
        addObject(ground4,658,334);
        ground ground5 = new ground();
        addObject(ground5,799,317);
        ground5.setLocation(848,335);
        ground ground6 = new ground();
        addObject(ground6,963,493);
        ground6.setLocation(1043,494);
        ground ground7 = new ground();
        addObject(ground7,1202,348);
        ground7.setLocation(1238,343);
        removeObject(secretDoor);
        coin coin = new coin();
        addObject(coin,143,294);
        coin coin2 = new coin();
        addObject(coin2,319,164);
        coin coin3 = new coin();
        addObject(coin3,408,153);
        coin coin4 = new coin();
        addObject(coin4,675,291);
        coin coin5 = new coin();
        addObject(coin5,774,269);
        coin coin6 = new coin();
        addObject(coin6,862,283);
        coin coin7 = new coin();
        addObject(coin7,226,397);
        coin coin8 = new coin();
        addObject(coin8,315,377);
        coin coin9 = new coin();
        addObject(coin9,981,416);
        coin coin10 = new coin();
        addObject(coin10,1003,421);
        coin coin11 = new coin();
        addObject(coin11,555,248);
        coin.setLocation(117,292);
        coin7.setLocation(245,385);
        coin8.setLocation(308,384);
        coin2.setLocation(341,155);
        coin5.setLocation(760,288);
        coin6.setLocation(866,287);
        coin10.setLocation(1004,449);
        coin9.setLocation(1066,453);
        coin coin12 = new coin();
        addObject(coin12,1190,294);
        coin coin13 = new coin();
        addObject(coin13,1289,294);
        coin coin14 = new coin();
        addObject(coin14,1102,346);
        SecretDoor secretDoor2 = new SecretDoor();
        addObject(secretDoor2,1328,277);
        ground3.setLocation(395,224);
        ground3.setLocation(324,238);
        coin2.setLocation(293,185);
        coin3.setLocation(358,178);
        obstacol obstacol = new obstacol();
        addObject(obstacol,278,381);
        obstacol obstacol2 = new obstacol();
        addObject(obstacol2,1096,444);
    }
}
