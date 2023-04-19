/*
Maze Game
*/
package com.mycompany.game;


public class giveLife extends risksRewards{

    public giveLife(int x, int y){
        super(x,y);
        
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
