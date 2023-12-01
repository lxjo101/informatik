import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int orangeTore = 0;
    private int blauTore = 0;
    public int stepCounter;
    private autoorange OA;
    private autoblau BA;
    private int steps;
    private GreenfootSound torexplosound = new GreenfootSound("goalexplo.mp3");  
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ball()
    {
        steps = 0;
    }
    public void act()
    {
        World w = this.getWorld();
           
            ArrayList<autoorange> list1 = (ArrayList<autoorange>)w.getObjects(autoorange.class);
            OA = list1.get(0); 
            ArrayList<autoblau> list2 = (ArrayList<autoblau>)w.getObjects(autoblau.class);
            BA = list2.get(0);
        
        //Scoreboard
        World w3 = this.getWorld();
        String standB = "Team Blau: "+this.blauTore;
        w.showText(standB, 300,10 );
        this.blauTore();
    
        World w2 = this.getWorld();
        String standO = "Team Orange: " +this.orangeTore;
        w2.showText(standO, 780,10);
        this.orangeTore();
        
        
        //bewegung ball und schuss
        
        int rotO = OA.getRotation();
        int rotB = BA.getRotation();
        this.move(steps);
        if( steps > 0)
        {
               steps--;
        }
        if (this.isTouching(autoblau.class))
        {
            this.setRotation(rotB);
            steps = 6;
            getWorld().removeObjects(getWorld().getObjects(torexplosion.class));
        }
        else if (this.isTouching(autoorange.class))
        {
            this.setRotation(rotO);
            steps = 6;
            getWorld().removeObjects(getWorld().getObjects(torexplosion.class));
        }
        if (this.isTouching(torBlau.class)) 
        {
            this.move(-1);
        }
        if (this.isTouching(torOrange.class)) 
        {
            this.move(-1);
        }
    }
    public void blauTore()
    {
        if(this.isTouching(torSenderOrange.class))
        {
            this.blauTore = this.blauTore + 1;
            this.setLocation(539,354);
            getWorld().addObject(new torexplosion(),1058,354);
            BA.setLocation(100,354);
            OA.setLocation(980,354);
            torexplosound.play();
        }   
    }
    public void orangeTore()
    {
        if(this.isTouching(torSenderBlau.class))
        {
            this.orangeTore = this.orangeTore + 1;
            this.setLocation(539,354);
            getWorld().addObject(new torexplosion(),42,354);
            BA.setLocation(100,354);
            OA.setLocation(980,354);
            torexplosound.play();
        }
    }
    public Actor getOneTouchedObject(Class clss)
    {
        List<Actor> list = getIntersectingObjects(clss);
        List<Actor> list2 = getIntersectingObjects(clss);
        list2.clear();
        GreenfootImage i=new GreenfootImage(getImage());
       
        int w=i.getWidth(),h=i.getHeight(),x=getX(),y=getY();
        for(Actor A : list)
        {
            GreenfootImage Ai = new GreenfootImage(A.getImage()), i2 = new GreenfootImage(w,h);
          
            int Aw=Ai.getWidth(),Ah=Ai.getHeight(),Ax=A.getX(),Ay=A.getY();
            i2.drawImage(Ai,Ax-x-(Aw/2-w/2),Ay-y-(Ah/2-h/2));
            for(int yi = 0; yi<h; yi++)
                for(int xi = 0; xi<w; xi++)
                    if(i2.getColorAt(xi,yi).getAlpha()>0 && i.getColorAt(xi,yi).getAlpha()>0)
                           
                      return A;
        }
        return null;
    }
}

