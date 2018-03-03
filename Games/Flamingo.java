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
        StartButton start = new StartButton();
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            move(0-start.movePoint);
        }
        
        if (Greenfoot.isKeyDown("1")){
            move(start.movePoint);
        }
        
        int lastX = 600;
        
        if (start.startStatus == 0){
            setLocation(600,400);
        }
        
        if ((getDirX() >= 1050) && (lastX <1050)){
            sideA++;        
            lastX = getDirX();
            setLocation(600,400);
            start.setStatus();
            Greenfoot.playSound("win.wav");
        } else if ( (getDirX() <=150) && (lastX >150)){
            sideB++;
            lastX = getDirX();
            setLocation(600,400);
            start.setStatus();
            Greenfoot.playSound("lose.wav");
        }
        
        
    }
    
    public int getDirX(){
        return this.getX();
    }
    
    public void reset(){
        this.sideA = 0;
        this.sideB = 0;
    }
       
}
