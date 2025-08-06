import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    public Bomb()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(80, 60);
    }
    public void act()
    {
        int y = getY();
        int x = getX();
        if (Greenfoot.isKeyDown("left")) 
        {
            x = x - 3;
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            y = y + 3;
        }
        if (Greenfoot.isKeyDown("up")) 
        {
            y = y - 3;
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            x = x + 3;
        }
        setLocation(x, y);
        sumirPersonagem();
    }

    /**
     * 
     */
    public void sumirPersonagem()
    {
        if (isTouching(Jovem.class)) {
            removeTouching(Jovem.class);
            getWorld().showText("JOGADOR 2 VENCEU", 500, 312);
        }
    }
}
