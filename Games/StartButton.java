import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartfButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    /**
     * Act - do whatever the StartfButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int startStatus = 0;
    public void act() 
    {
        // Add your action code here.
        setLocation(500 , 500);
        
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;
           startStatus = 1;  //changes the image of the button so that you see if it's clicked;
            //also add the methods you want to execute;
        }

    }    
}
