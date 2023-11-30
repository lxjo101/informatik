import greenfoot.*;

public class torexplosion extends Actor
{
    private GifImage gi;
    public torexplosion()
    {
        gi = new GifImage("images/ge.gif");
        setImage(gi.getCurrentImage());
    }

    public void act()
    {
        setImage(gi.getCurrentImage());
            ifBallInRange();
    }
    boolean visible;
    public void ifBallInRange()
    {
    if(getObjectsInRange(50, Ball.class).isEmpty())
    {
       if(visible)
       {
              setImage(new GreenfootImage(1,1));
              visible = false;
       }
    } else
       if(!visible)
       {
              setImage("ge.gif");
              visible = true;
       }
    }
    }