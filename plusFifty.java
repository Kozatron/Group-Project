/*
Maze Game
*/
package com.mycompany.game;

public class plusFifty extends risksRewards {

    
    public plusFifty(int x, int y){
        super(x,y);
        this.pointCarried = 50;
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
