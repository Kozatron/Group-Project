/*
 Devyn Martinez
 
 */
package com.mycompany.game;

public abstract class risksRewards {
    int X;
    int Y;
    boolean isCollected;
    int pointCarried;
    int rawRep;
    char symbolicRep;
    
    
    public risksRewards(int x, int y){
        X = x;
        Y = y;
        isCollected = false;  
        pointCarried = 0;
        rawRep = 2;
        symbolicRep = '!';
    }
    
   // public abstract void setPOS();
   // ^ might be arbitrary due to the constructor thats sets position in the first place
    public abstract void setPoints();
    public abstract void testPOS(int x, int y); 
    public abstract int getX(); 
    public abstract int getY();
    public abstract void addPoints();
    public abstract void onceCollected();
    
    
    
}

