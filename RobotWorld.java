import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Abbie Spicer) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject (new Robot(),30,50);
        
        addObject (new Wall(), 50,150);
        addObject (new Wall(), 150,150);
        addObject (new Wall(), 200,150);
        addObject (new Wall(), 250,150);
        
        addObject (new Block(), 410, 150);
        
        addObject (new Wall(), 850,150);
        addObject (new Wall(), 750,150);
        addObject (new Wall(), 650,150);
        addObject (new Wall(), 570,150);
       
        addObject (new Home(), 750,550);
        
        addObject (new Scorepanel(), 100,550);
        
        addObject (new Pizza(), 750,400);
        addObject (new Pizza(), 250,400);
        addObject (new Pizza(), 100,300);
        addObject (new Pizza(), 500,500);
        addObject (new Pizza(), 550,300);
    }
}
