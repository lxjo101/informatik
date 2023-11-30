import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse autoblau.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class autoblau extends Autos
{
    public int stepCounter;
    /**
     * Act - tut, was auch immer autoblau tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        stepCounter++;
        if (stepCounter == 1)
        {
            this.setRotation(0);
        }
        // Ergänzen Sie Ihren Quelltext hier...
        if (Greenfoot.isKeyDown("s")== true && (Greenfoot.isKeyDown("d")== true))
        {
            this.move(5);
            this.setRotation(45);
            //UR
        }
        else if (Greenfoot.isKeyDown("s")== true && (Greenfoot.isKeyDown("a")== true))
        {
            this.move(5);
            this.setRotation(135);
            //UL
        }
        else if (Greenfoot.isKeyDown("w")== true && (Greenfoot.isKeyDown("a")== true))
        {
            this.move(5);
            this.setRotation(225);
            //OL
        }
        else if (Greenfoot.isKeyDown("w")== true && (Greenfoot.isKeyDown("d")== true))
        {
            this.move(5);
            this.setRotation(315);
            //OR
        }
        else if (Greenfoot.isKeyDown("d")== true)
        {
            this.move(5);
            this.setRotation(0);
            //R
        }
        else if (Greenfoot.isKeyDown("a")== true)
        {
            this.move(5);
            this.setRotation(180);
            //L
        }
        else if (Greenfoot.isKeyDown("w")== true)
        {
            this.move(5);
            this.setRotation(270);
            //O
        }
        else if (Greenfoot.isKeyDown("s")== true)
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