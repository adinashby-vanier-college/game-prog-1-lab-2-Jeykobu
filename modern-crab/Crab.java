// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(4);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(-4);
        }
        Actor worm = getOneObjectAtOffset(0, 0, Worm.class);
        if (worm != null) {
            getWorld().removeObject(worm);
        }
    }

    /**
     * 
     */
    public boolean foundWorm()
    {
        Actor worm = getOneObjectAtOffset(0, 0, Worm.class);
        return worm != null;
    }
}
