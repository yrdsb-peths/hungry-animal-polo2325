import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for elephant
 * 
 * @author Marco Yu
 * @version September 2024
 */
public class Banana extends Food
{
    public Banana()
    {
        super(4);
    }
    
    /**
     * Make banana fall down
     */
    public void foodFall()
    {
        int rand = Greenfoot.getRandomNumber(5);
        
        // make banana occasionally go up
        if(rand == 1) 
        {
            speed = -4;
        }
        else
        {
            speed = 3;
        }
        
        // make banana falls downward
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
    }
}
