import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spiridus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spiridus extends Actor
{
    /**
     * Act - do whatever the spiridus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //game over-bomba-cazut, start screen, nivel 1
    private int collect = 0;
    private final int GRAVITY = 1;
    private int velocity;
    boolean CoinsCollected = false;
    public spiridus()
    {
        this(90, 90);   //unul anume  
    }
    public spiridus(int width, int height)
    {
        GreenfootImage image=getImage(); //asociaza brick la var image
        image.scale(width, height);
        setImage(image);
    }
    public void act()
    {
        //if(Greenfoot.isKeyDown("space") && isOnGround()) jump();
        move();
        fall();
        eat();
        SecondLevel();
        over();
      if(Greenfoot.isKeyDown("space") && isOnGround()) jump();
    }
    
    public void fall()
    {
        setLocation(getX(), getY()+velocity);
        if(isOnGround()) {
            velocity = 0;
            while(isOnGround()) 
            {
                  setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY() + 1);
        }
        else if(velocity < 0 && didBumpHead()) velocity = 0;
        else velocity += GRAVITY;
    }
    public void jump()
    {
        velocity = -20;
    }
    public void move()
    {
        int y = getY();
        int x = getX();
        
        setLocation(x, y);
    }
    public boolean isOnGround()
    {
        boolean isOnGround = false;
        if (getY() > getWorld().getHeight() - 50) isOnGround = true;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, ground.class) != null || 
        getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, ground.class) != null)
        isOnGround = true;
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, ground2.class) != null || 
        getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, ground2.class) != null)
        isOnGround = true;
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, ground3.class) != null || 
        getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, ground3.class) != null)
        isOnGround = true;
        return isOnGround;
    }
    public boolean didBumpHead()
    {
        boolean bumpedHead = false;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, ground.class) != null || 
        getOneObjectAtOffset(imageWidth / 2, imageHeight / -2, ground.class) != null)
        bumpedHead = true;
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, ground2.class) != null || 
        getOneObjectAtOffset(imageWidth / 2, imageHeight / -2, ground2.class) != null)
        bumpedHead = true;
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, ground3.class) != null || 
        getOneObjectAtOffset(imageWidth / 2, imageHeight / -2, ground3.class) != null)
        bumpedHead = true;
        return bumpedHead;
    }
    
    public void eat()
    {
        
        Actor coin;
        coin = getOneIntersectingObject(coin.class);
        if(coin != null)
        {
            
            getWorld().removeObject(coin);
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            collect++;
        }
            
            if(collect == 6 && CoinsCollected == false)
            {
                getWorld().addObject(new SecretDoor(), 1350, 700);
                CoinsCollected = true;
            }
        
    }
    public void SecondLevel()
    {
        Actor secretDoor = getOneIntersectingObject(SecretDoor.class);
        if(secretDoor != null && CoinsCollected == true)
        {
            Greenfoot.setWorld(new Background2());
        }
    } 
    private void over(){
       
       if(getY() == 551)
       {
           Greenfoot.delay(20);
           Greenfoot.setWorld(new endGame());
       }
    } 
}
