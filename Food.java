import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * abstract class for food
 * 
 * @author Marco
 * @version September 2024
 */
public abstract class Food extends Actor
{
    //initilizes variables
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
        foodFall();
        
        // Remove food and draw game over when food gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
             world.gameOver();   
             
             world.removeObject(this);
        }        
    }
    
    /**
     * make food fall down
     */
    public void foodFall()
    {
        // Food falls downward
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
    }
    
    /**
     * set speed of food
     */
    public void setSpeed(int spd)
    {
        this.speed = spd;
    }
}
