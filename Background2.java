import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background2 extends World
{

    /**
     * Constructor for objects of class Background2.
     * 
     */
    public Background2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(1350, 600, 1);
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
        public void act()
    {
        if(Greenfoot.getRandomNumber(100) <= 2)
        {
            addObject(new coin(), getWidth()-1, Greenfoot.getRandomNumber(250)+500);
        }
    }

    private void prepare()
    {
        spiridus spiridus = new spiridus();
        addObject(spiridus,202,250);
        spiridus.setLocation(80,432);
        ground ground = new ground();
        addObject(ground,206,424);

        spiridus.setLocation(125,367);
        ground.setLocation(124,620);

        Counter counter = new Counter();
        addObject(counter, 104, 104);
        ground ground2 = new ground();
        addObject(ground2,340,521);

        ground ground3 = new ground();
        addObject(ground3,806,590);
        ground3.setLocation(543,652);
        ground ground4 = new ground();
        addObject(ground4,333,243);
        ground4.setLocation(194,206);
        ground ground5 = new ground();
        addObject(ground5,542,181);
        ground5.setLocation(419,144);
        ground ground6 = new ground();
        addObject(ground6,666,269);
        ground6.setLocation(621,262);
        ground ground7 = new ground();
        addObject(ground7,880,184);
        ground7.setLocation(802,192);
        ground7.setLocation(837,198);
        ground ground8 = new ground();
        addObject(ground8,1110,111);
        ground8.setLocation(1037,198);
        ground ground9 = new ground();
        addObject(ground9,1282,160);
        ground ground10 = new ground();
        addObject(ground10,632,453);
        ground10.setLocation(431,361);
        ground10.setLocation(510,374);
        ground ground11 = new ground();
        addObject(ground11,718,519);
        ground11.setLocation(756,552);
        ground ground12 = new ground();
        addObject(ground12,969,538);
        ground12.setLocation(953,552);
        ground ground13 = new ground();
        addObject(ground13,1164,635);
        ground ground14 = new ground();
        addObject(ground14,1146,457);
        coin coin = new coin();
        addObject(coin,117,570);
        coin coin2 = new coin();
        addObject(coin2,179,580);
        coin2.setLocation(178,566);
        coin coin3 = new coin();
        addObject(coin3,293,469);
        coin coin4 = new coin();
        addObject(coin4,391,462);
        coin coin5 = new coin();
        addObject(coin5,346,473);
        coin5.setLocation(344,462);
        coin coin6 = new coin();
        addObject(coin6,477,559);
        coin coin7 = new coin();
        addObject(coin7,517,598);
        coin coin8 = new coin();
        addObject(coin8,570,602);
        coin7.setLocation(518,600);
        coin coin9 = new coin();
        addObject(coin9,709,498);
        coin coin10 = new coin();
        addObject(coin10,761,499);
        coin coin11 = new coin();
        addObject(coin11,830,509);
        coin coin12 = new coin();
        addObject(coin12,858,510);
        coin coin13 = new coin();
        addObject(coin13,935,507);
        coin coin14 = new coin();
        addObject(coin14,952,509);
        coin11.setLocation(812,497);
        coin12.setLocation(853,497);
        coin13.setLocation(897,497);
        coin14.setLocation(950,498);
        coin14.setLocation(952,498);
        coin coin15 = new coin();
        addObject(coin15,1002,461);
        coin coin16 = new coin();
        addObject(coin16,1023,398);
        coin coin17 = new coin();
        addObject(coin17,1125,389);
        coin coin18 = new coin();
        addObject(coin18,1190,393);
        coin17.setLocation(1122,390);
        coin coin19 = new coin();
        addObject(coin19,1113,576);
        coin coin20 = new coin();
        addObject(coin20,1191,567);
        coin coin21 = new coin();
        addObject(coin21,1206,570);
        coin19.setLocation(1108,582);
        coin20.setLocation(1165,576);
        coin21.setLocation(1213,580);
        coin coin22 = new coin();
        addObject(coin22,472,317);
        coin coin23 = new coin();
        addObject(coin23,570,304);
        coin coin24 = new coin();
        addObject(coin24,583,308);
        coin23.setLocation(506,324);
        coin22.setLocation(468,330);
        coin24.setLocation(565,320);
        coin coin25 = new coin();
        addObject(coin25,578,207);
        coin coin26 = new coin();
        addObject(coin26,620,209);
        coin coin27 = new coin();
        addObject(coin27,654,196);
        coin27.setLocation(659,204);
        coin coin28 = new coin();
        addObject(coin28,150,150);
        coin coin29 = new coin();
        addObject(coin29,232,156);
        coin coin30 = new coin();
        addObject(coin30,190,145);
        coin30.setLocation(186,148);
        coin coin31 = new coin();
        addObject(coin31,388,94);
        coin coin32 = new coin();
        addObject(coin32,454,99);
        coin coin33 = new coin();
        addObject(coin33,473,102);
        coin32.setLocation(428,90);
        coin33.setLocation(483,95);
        coin coin34 = new coin();
        addObject(coin34,799,135);
        coin coin35 = new coin();
        addObject(coin35,890,127);
        coin coin36 = new coin();
        addObject(coin36,1023,122);
        coin coin37 = new coin();
        addObject(coin37,1050,132);
        coin36.setLocation(988,127);
        coin35.setLocation(888,136);
        coin36.setLocation(982,131);
        coin37.setLocation(1075,128);
        coin coin38 = new coin();
        addObject(coin38,1219,93);
        coin coin39 = new coin();
        addObject(coin39,1281,107);
        ground3.setLocation(487,505);
        coin8.setLocation(525,558);
        removeObject(coin8);
        removeObject(coin6);
        removeObject(ground3);
        removeObject(coin7);
        removeObject(ground);
        removeObject(coin2);
        removeObject(coin);
        removeObject(coin21);
        removeObject(coin20);
        removeObject(coin19);
        ground13.setLocation(1208,548);
        removeObject(ground13);
        spiridus.setLocation(306,388);
        ground14.setLocation(1196,422);
        coin17.setLocation(1128,370);
        coin18.setLocation(1182,358);
        coin16.setLocation(1043,363);
        coin18.setLocation(1176,368);
        ground14.setLocation(1173,404);
        ground6.setLocation(634,244);
        removeObject(ground10);
        ground2 ground22 = new ground2();
        addObject(ground22,545,350);
        ground22.setLocation(558,365);
        ground22.setLocation(471,365);
        ground22.setLocation(499,368);
        ground8.setLocation(948,201);
        removeObject(ground8);
        ground3 ground32 = new ground3();
        addObject(ground32,1015,202);
        ground32.setLocation(1027,197);
        ground7.setLocation(854,184);
        removeObject(ground7);
        ground3 ground33 = new ground3();
        addObject(ground33,898,197);
        ground33.setLocation(877,197);
        ground2 ground23 = new ground2();
        addObject(ground23,510,563);
        ground2 ground24 = new ground2();
        addObject(ground24,854,257);
        ground24.setLocation(906,307);
        ground2 ground25 = new ground2();
        addObject(ground25,906,307);
        ground14.setLocation(1180,405);
        removeObject(ground14);
        ground24.setLocation(1212,400);
        ground24.setLocation(789,392);
        ground25.setLocation(1182,402);
        ground25.setLocation(1182,407);
        coin coin40 = new coin();
        addObject(coin40,900,61);
        coin coin41 = new coin();
        addObject(coin41,795,352);
        coin coin42 = new coin();
        addObject(coin42,883,358);
        coin42.setLocation(856,350);
        coin40.setLocation(747,343);
        ground5.setLocation(433,156);
        removeObject(ground5);
        ground3 ground34 = new ground3();
        addObject(ground34,442,153);
        ground34.setLocation(438,139);
        coin coin43 = new coin();
        addObject(coin43,488,527);
        coin coin44 = new coin();
        addObject(coin44,532,526);
        obstacol obstacol = new obstacol();
        addObject(obstacol,816,134);
        obstacol obstacol2 = new obstacol();
        addObject(obstacol2,460,83);
        obstacol.setLocation(942,149);
        obstacol obstacol3 = new obstacol();
        addObject(obstacol3,561,515);
        gold gold = new gold();
        addObject(gold,1228,356);
        gold.setLocation(1248,386);
        coin26.setLocation(605,155);
        coin27.setLocation(678,172);
        coin26.setLocation(636,175);
        coin25.setLocation(596,173);
        ground6.setLocation(615,200);
        ground6.setLocation(688,203);
        ground6.setLocation(672,202);
        ground6.setLocation(605,212);
    }
}
