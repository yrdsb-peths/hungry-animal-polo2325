import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * abstract class for food
 * 
 * @author Marco
 * @version September 2024
 */
public abstract class Food extends Actor
{
    int value;
    int speed = 1;
    
    /**
     * Constructor for food
     */
    public Food(int value)
    {
        this.value = value;
    }
    
    public void act()
    {
        // Food falls downward
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Remove food and draw game over when food gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
             world.gameOver();   
             world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        this.speed = spd;
    }
}
