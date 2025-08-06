import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Jovem extends Actor
{
    private int placar = 3;
    
    public void act()
    {
        movimentação();
    }
    
    public void movimentação()
    {
        getWorld().showText("Placar: " + placar, 50, 20);
        int y = getY();
        int x = getX();
        if (Greenfoot.isKeyDown("A")) 
        {
            x = x - 5;
        }
        if (Greenfoot.isKeyDown("S")) 
        {
            y = y + 5;
        }
        if (Greenfoot.isKeyDown("W")) 
        {
            y = y - 5;
        }
        if (Greenfoot.isKeyDown("D")) 
        {
            x = x + 5;
        }
        setLocation(x, y);
        sumirPAO();
        sumirpoint();
    }

    /**
     * 
     */
    public void sumirPAO()
    {
        if (isTouching(PAO.class)) {
            removeTouching(PAO.class);
            placar = placar - 1;
        }
    }
    public void sumirpoint()
    {
        if (isTouching(point.class)) {
            removeTouching(point.class);
            placar = placar - 1;
            getWorld().showText("JOGADOR 1 VENCEU", 500, 312);
        }
    }
    
}
