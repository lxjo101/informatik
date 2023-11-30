import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoundPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundPicker extends Actor
{
    /**
     * Act - do whatever the SoundPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound musik1 = new GreenfootSound("song1firework.mp3");  
    GreenfootSound musik2 = new GreenfootSound("song2solar.mp3");  
    GreenfootSound musik3 = new GreenfootSound("song3crab.mp3");
    GreenfootSound musik4 = new GreenfootSound("song4flip.mp3"); 
    GreenfootSound musik5 = new GreenfootSound("song5throttle.mp3");  
    GreenfootSound musik6 = new GreenfootSound("song6underwater.mp3");  
    GreenfootSound musik7 = new GreenfootSound("song7drop.mp3");  
    GreenfootSound musik8 = new GreenfootSound("song8black.mp3");  
    GreenfootSound musik9 = new GreenfootSound("song9weapon.mp3");  
        boolean play1;
        boolean play2;
        boolean play3;
        boolean play4;
        boolean play5;
        boolean play6;
        boolean play7;
        boolean play8;
        boolean play9;
        boolean play0;
    public void act()
    {   
        if (Greenfoot.isKeyDown("1")){play1=true;}
        if (Greenfoot.isKeyDown("2")){play2=true;}
        if (Greenfoot.isKeyDown("3")){play3=true;}
        if (Greenfoot.isKeyDown("4")){play4=true;}
        if (Greenfoot.isKeyDown("5")){play5=true;}
        if (Greenfoot.isKeyDown("6")){play6=true;}
        if (Greenfoot.isKeyDown("7")){play7=true;}
        if (Greenfoot.isKeyDown("8")){play8=true;}
        if (Greenfoot.isKeyDown("9")){play9=true;}
        if (Greenfoot.isKeyDown("0")){play0=true;}
        if (play1==true)
        {
            musik2.pause();
            musik3.pause();
            musik4.pause();
            musik5.pause();
            musik6.pause();
            musik7.pause();
            musik8.pause();
            musik9.pause();musik1.setVolume(100);        
            musik1.play();
        }
        if (play1==true)
        {
            musik1.pause();     
            musik3.pause();
            musik4.pause();
            musik5.pause();
            musik6.pause();
            musik7.pause();
            musik8.pause();
            musik9.pause();
            musik2.setVolume(100);        
            musik2.play();
            play2 = false;
        }
        if (play1==true){
            musik1.pause();     
            musik2.pause();
            musik4.pause();
            musik5.pause();
            musik6.pause();
            musik7.pause();
            musik8.pause();
            musik9.pause();
            musik3.setVolume(100);        
            musik3.play();
            play3 = false;
        }
        if (play1==true)
        {
            musik1.pause();     
            musik2.pause();
            musik3.pause();
            musik5.pause();
            musik6.pause();
            musik7.pause();
            musik8.pause();
            musik9.pause();
            musik4.setVolume(100);        
            musik4.play();
            play4 = false;
        }
        if (play1==true)
        {
            musik1.pause();    
            musik2.pause();
            musik3.pause();
            musik4.pause();
            musik6.pause();
            musik7.pause();
            musik8.pause();
            musik9.pause();
            musik5.setVolume(100);        
            musik5.play();
            play5 = false;
        }
        if (play1==true)
        {
            musik1.pause();     
            musik2.pause();
            musik3.pause();
            musik4.pause();
            musik5.pause();
            musik7.pause();
            musik8.pause();
            musik9.pause();
            musik6.setVolume(100);        
            musik6.play();
            play6 = false;
        }
        if (play1==true)
        {
            musik1.pause();     
            musik2.pause();
            musik3.pause();
            musik4.pause();
            musik5.pause();
            musik6.pause();
            musik8.pause();
            musik9.pause();
            musik7.setVolume(100);        
            musik7.play();
            play7 = false;
        }
        if (play1==true)
        {
            musik1.pause();     
            musik2.pause();
            musik3.pause();
            musik4.pause();
            musik5.pause();
            musik6.pause();
            musik7.pause();
            musik9.pause();
            musik8.setVolume(100);        
            musik8.play();
            play8 = false;
        }
        if (play1==true)
        {
            musik1.pause();     
            musik2.pause();
            musik3.pause();
            musik4.pause();
            musik5.pause();
            musik6.pause();
            musik7.pause();
            musik8.pause();
            musik9.setVolume(100);        
            musik9.play();
            play9 = false;
        }
        if (play0==true)
        {
            musik1.pause();     
            musik2.pause();
            musik3.pause();
            musik4.pause();
            musik5.pause();
            musik6.pause();
            musik7.pause();
            musik8.pause();
            musik9.pause();
            play0 = false;
        }
    }
}
