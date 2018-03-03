import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreA extends Actor
{
    /**
     * Act - do whatever the ScoreA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int scoreA;
    public void act() 
    {
        // Add your action code here
        setLocation(100, 100);
        int scoreA = 0;
        Flamingo fla = new Flamingo();
        setImage(new GreenfootImage("Score of A : " + fla.sideA, 24, Color.GREEN, Color.BLACK));
        
        
        
    }    
    
    public void setResult(int aResult ){
        scoreA += aResult;
        
    
    }
    
    public int getA(){
        return scoreA;
    }
    
    
}
