import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Marco Yu
 * @version September 2024
 */
public class TitleScreen extends World
{
    //initilizes variables
    Label titleLabel = new Label("The Elephant", 60);
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 300, 200); 
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,465,90);
        elephant.setLocation(452,101);
        Label label = new Label("Use \u2190 and \u2192 to Move", 50);
        addObject(label,262,208);
        label.setLocation(300,250);
        Label label2 = new Label("Press <space> to start", 40);
        addObject(label2,276,291);
        label2.setLocation(300,292);
    }
}
