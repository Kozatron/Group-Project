/*
 Devyn Martinez
 
 */
package com.mycompany.game;

public abstract class risksRewards {
    int X;
    int Y;
    boolean isCollected;
    int pointsAddorSub;
    int healthAddorSub;
    
    
    public risksRewards(int x, int y){
        X = x;
        Y = y;
        isCollected = false;
        pointsAddorSub = 0;
        healthAddorSub = 0;
    }
    
    
    
    public int getX(){
        return X;
    }
    
    public int getY(){
        return Y;
    }
    
    
    
    
}
