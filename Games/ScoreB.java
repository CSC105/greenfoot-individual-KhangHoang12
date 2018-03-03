import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreB extends Actor
{
    /**
     * Act - do whatever the ScoreA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int scoreB;
    public void act() 
    {
        // Add your action code here.
        setLocation(1100, 100);
        int scoreB = 0; 
        Flamingo fla = new Flamingo();
        setImage(new GreenfootImage("Score of B : " + fla.sideB, 24, Color.PINK, Color.BLACK));
        
        
        
    }    
    
    public void setResult(int bResult ){
        scoreB += bResult;
        
    
    }
    
    public int getB(){
        return scoreB;
    }
    
    
}
