 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in.
 * 
 * @author Marco Yu
 * @version September 2024
 */
public class MyWorld extends World
{
    //initilizes variables
    public int score = 0;
    public int numFoodEaten = 0;
    Label scoreLabel;
    int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create the elephant object
        Elephant elephant  = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        spawnFood();
    }
    
    /**
     * End the game and draw "GameOver"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Create new food at random location at top of screen
     */
    public void spawnFood() {
        int rand = Greenfoot.getRandomNumber(2);
        Food food;
        
        if(rand == 0) {
            food = new Apple();
        } else {
            food = new Banana();
        }
        
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
    
    /**
     * Increase score
     */
    public void increaseScore(int value) {
        score += value;
        scoreLabel.setValue(score);
    }
}
