import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant
 * 
 * @author Marco Yu
 * @version Septmber 2024
 */
public class Apple extends Food
{
    /**
     * Constructor for Apple
     */
    public Apple()
    {
        super(2);
    }
    
    /**
     * Make apple fall down
     */
    public void foodFall()
    {
        int rand = Greenfoot.getRandomNumber(3);
        
        //make apple occasionally speeds up
        if(rand == 1)
        {
            speed = 7;
        }
        else
        {
            speed = 3;
        }
        
        // apple falls downward
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
    }
}