import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plataformas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plataformas extends Actor
{
        public Plataformas()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(1000, 625);
    }
public void act()
    {
    if (isTouching(Actor.class)) 
    {Actor actor = getOneIntersectingObject(Actor.class);
        
    if(actor.getY()+actor.getImage().getHeight()/2>getY())
    {
    actor.setLocation(actor.getX(),getY()-getImage().getHeight()/2-actor.getImage().getHeight()/2);
    }
}}}
    