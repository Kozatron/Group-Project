/*
Maze Game
 */
package com.mycompany.game;


public class OneFifty extends risksRewards{

    public OneFifty(int x,int y){
        super(x,y);
        this.pointCarried = 150;
    }
    
    public void pointSet(){
        if (this.plusOrMinus == false)
            this.pointCarried = this.pointCarried * -1;
        else 
            this.pointCarried = this.pointCarried *1;   
    }
    
    @Override
    public void testPOS(int x, int y) {
        
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }

    @Override
    public void addPoints() {
        
    }

    @Override
    public void onceCollected() {
        
    }

    
}
