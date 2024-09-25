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
    
    public void act()
    {
        setLocation(getX(), getY() + 4);
    }
}
