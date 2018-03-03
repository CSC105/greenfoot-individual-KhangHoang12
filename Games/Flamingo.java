import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    /**
     * Act - do whatever the Flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int sideA = 0;
    public static int sideB = 0;
    public void act() 
    {
        MyWorld world = new MyWorld();
        ScoreA scoreA = new ScoreA();
        ScoreB scoreB = new ScoreB();
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            move(0-world.movePoint);
        }
        
        if (Greenfoot.isKeyDown("1")){
            move(world.movePoint);
        }
        
        int lastX = 600;
        
        if ((getDirX() >= 1100) && (lastX <1100)){
            sideA++;        
            lastX = getDirX();
            setLocation(600,400);
            
            
        } else if ( (getDirX() <=100) && (lastX >100)){
            sideB++;
            lastX = getDirX();
            
        }
        
        
    }
    
    public int getDirX(){
        return this.getX();
    }
    
    
       
}
