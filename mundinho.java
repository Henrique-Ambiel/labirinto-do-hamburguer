import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundinho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundinho extends World
{

    /**
     * Constructor for objects of class mundinho.
     * 
     */
    public mundinho()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000,625, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jovem jovem = new Jovem();
        addObject(jovem,100,84);
        PAO pAO = new PAO();
        addObject(pAO,466,90);
        PAO pAO2 = new PAO();
        addObject(pAO2,403,288);
        pAO.setLocation(521,305);
        point point = new point();
        addObject(point,575,384);
        pAO.setLocation(490,344);
        pAO.setLocation(430,402);
        pAO.setLocation(449,354);
        pAO2.setLocation(252,360);
        Bomb bomb = new Bomb();
        addObject(bomb,486,150);
        point.setLocation(516,153);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,500,38);
        bomb2.setLocation(367,351);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,564,145);
        Bomb bomb4 = new Bomb();
        addObject(bomb4,211,20);
        bomb4.setLocation(551,24);
        bomb2.setLocation(575,39);
        bomb.setLocation(544,62);
        bomb3.setLocation(572,96);
        Plataformas plataformas = new Plataformas();
        addObject(plataformas,92,225);
        Plataformas plataformas2 = new Plataformas();
        addObject(plataformas2,98,123);
        Plataformas plataformas3 = new Plataformas();
        addObject(plataformas3,211,171);
        Plataformas plataformas4 = new Plataformas();
        addObject(plataformas4,152,296);
        bomb3.setLocation(933,84);
        bomb.setLocation(76,586);
        bomb2.setLocation(966,589);
        bomb4.setLocation(16,14);
        plataformas2.setLocation(445,191);
        jovem.setLocation(434,166);
        jovem.setLocation(323,511);
        plataformas2.setLocation(338,536);
        plataformas4.setLocation(451,429);
        pAO.setLocation(456,400);
        plataformas.setLocation(239,373);
        plataformas3.setLocation(511,247);
        point.setLocation(504,228);
        point.setLocation(402,309);
        point.setLocation(413,285);
        plataformas3.setLocation(422,303);
        point.setLocation(628,500);
        plataformas3.setLocation(636,514);
        point.setLocation(299,365);
        pAO2.setLocation(642,489);
        point.setLocation(233,354);
        jovem.setLocation(336,489);
        bomb4.setLocation(115,131);
        removeObject(bomb4);
        removeObject(bomb);
        removeObject(bomb2);
        jovem.setLocation(148,461);
        plataformas2.setLocation(360,299);
        pAO2.setLocation(630,386);
        plataformas3.setLocation(651,418);
        plataformas4.setLocation(72,624);
        point.setLocation(27,19);
        bomb3.setLocation(959,536);
        plataformas3.setLocation(927,621);
        plataformas4.setLocation(656,494);
        point.setLocation(473,58);
        point.setLocation(974,37);
        plataformas.setLocation(266,377);
        removeObject(plataformas);
        removeObject(plataformas2);
        removeObject(plataformas4);
        removeObject(plataformas3);
        Plataformas plataformas5 = new Plataformas();
        addObject(plataformas5,500,310);
        plataformas5.setLocation(239,456);
        plataformas5.setLocation(511,225);
        plataformas5.setLocation(300,625);
        plataformas5.setLocation(742,127);
        plataformas5.setLocation(941,611);
        pAO2.setLocation(613,371);
        jovem.setLocation(439,309);
        jovem.setLocation(77,556);
        bomb3.setLocation(960,546);
        plataformas5.setLocation(426,609);
        point.setLocation(800,56);
        point.setLocation(932,50);
        plataformas5.setLocation(980,182);
        pAO2.setLocation(676,202);
        pAO.setLocation(463,316);
        pAO.setLocation(408,534);
        plataformas5.setLocation(352,599);
        plataformas5.setLocation(474,194);
        removeObject(plataformas5);
        pAO.setLocation(166,256);
        pAO2.setLocation(279,545);
        PAO pAO3 = new PAO();
        addObject(pAO3,333,545);
        PAO pAO4 = new PAO();
        addObject(pAO4,119,232);
        removeObject(pAO);
        removeObject(pAO2);
        pAO3.setLocation(264,562);
        pAO4.setLocation(180,258);
        point point2 = new point();
        addObject(point2,894,36);
        point.setLocation(941,54);
        removeObject(point);
        point2.setLocation(940,54);
        point2.setLocation(929,43);
        pAO4.setLocation(195,245);
        removeObject(bomb3);
        addObject(bomb3,877,405);
        bomb3.setLocation(948,540);
        bomb3.setLocation(937,559);
        jovem.setLocation(106,539);
    }
}
