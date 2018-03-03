import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public static int movePoint = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        Flamingo fla = new Flamingo();
        ScoreA scoreA = new ScoreA();
        ResetButton reset = new ResetButton();
        ScoreB scoreB = new ScoreB();
        ABorder aBorder = new ABorder();
        BBorder bBorder = new BBorder();
        StartButton start= new StartButton();
        
        addObject(fla, 600,400);
        addObject(scoreA, 100, 100);
        addObject(scoreB, 1100, 100);
        addObject(aBorder, 100,600);
        addObject(bBorder, 1100, 600);
        addObject(reset, 600, 670);
        addObject(start, 600,100);
    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
}
