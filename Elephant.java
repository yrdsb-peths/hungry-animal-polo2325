import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Marco Yu
 * @version September 2024
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantSound.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    // Direction the elephant is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor for elephant
     */
    public Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 100);
        }
       
        animationTimer.mark();
        
        // Initial elephant image
        setImage(idleRight[0]);
    }
    
    /**
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-10);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(10);
            facing = "right";
        }
        
        // Remove food if elephant eats it
        eat();
        
        // Animate the elephant
        animateElephant();
    }
    
    /**
     * Eat the food and spawn new food if food is eaten
     */
    public void eat()
    {
        Actor actor = getOneIntersectingObject(Food.class);
        
        if(actor != null) {
            Food food = (Food) actor;
            MyWorld world = (MyWorld) getWorld();
            
            world.increaseScore(food.value);
            getWorld().removeObject(food);
            world.spawnFood();
        }
    }
}
