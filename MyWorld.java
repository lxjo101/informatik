import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse MyWorld.
 * 
 * Levi Schulz 
 * 1.0 (13.10.2023)
 */
public class MyWorld extends World
{

    /**
     * Konstruktor für Objekte der Klasse MyWorld
     * 
     */
    public MyWorld()
    {    
        // Erstellt eine neue Welt mit 600x400 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(1080, 720, 1); 
        
        autoblau blauauto = new autoblau();
        this.addObject(blauauto,100,354);
        
        autoorange orangeauto = new autoorange();
        this.addObject(orangeauto,980,354);
        
        Ball ball = new Ball();
        this.addObject(ball,539,354);
        
        torBlau blauTor = new torBlau();
        this.addObject(blauTor,20,354);
        
        torOrange orangeTor = new torOrange();
        this.addObject(orangeTor,1058,354);
        
        torSenderBlau senderB = new torSenderBlau();
        this.addObject(senderB,42,354);
        
        torSenderOrange senderO = new torSenderOrange();
        this.addObject(senderO,1038,354);
        
        
        
    }  
}