import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse autoorange.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class autoorange extends Autos
{
    public int stepCounter;
    /**
     * Act - tut, was auch immer autoorange tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        stepCounter++;
        if (stepCounter == 1)
        {
            this.setRotation(180);
        }
    
        // Ergänzen Sie Ihren Quelltext hier...
        if (Greenfoot.isKeyDown("down")== true && (Greenfoot.isKeyDown("right")== true))
        {
            this.move(5);
            this.setRotation(45);
            //UR
        }
        else if (Greenfoot.isKeyDown("down")== true && (Greenfoot.isKeyDown("left")== true))
        {
            this.move(5);
            this.setRotation(135);
            //UL
        }
        else if (Greenfoot.isKeyDown("up")== true && (Greenfoot.isKeyDown("left")== true))
        {
            this.move(5);
            this.setRotation(225);
            //OL
        }
        else if (Greenfoot.isKeyDown("up")== true && (Greenfoot.isKeyDown("right")== true))
        {
            this.move(5);
            this.setRotation(315);
            //OR
        }
        else if (Greenfoot.isKeyDown("right")== true)
        {
            this.move(5);
            this.setRotation(0);
            //R
        }
        else if (Greenfoot.isKeyDown("left")== true)
        {
            this.move(5);
            this.setRotation(180);
            //L
        }
        else if (Greenfoot.isKeyDown("up")== true)
        {
            this.move(5);
            this.setRotation(270);
            //O
        }
        else if (Greenfoot.isKeyDown("down")== true)
        {
            this.move(5);
            this.setRotation(90);
            //U
        }
        if (this.isTouching(torBlau.class)) 
        {
            this.setRotation(180);
            this.move(-10);
        }
        if (this.isTouching(torOrange.class)) 
        {
            this.setRotation(180);
            this.move(10);
        }
    }    
}