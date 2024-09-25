import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant
 * 
 * @author Marco Yu
 * @version Septmber 2024
 */
public class Apple extends Food
{
    public Apple()
    {
        super(2);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 2);
    }
}