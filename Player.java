package com.mycompany.game;
//import java.util.Random;
public class Player {
    
    private int health = 1;
    private int playerHp;
    boolean is_alive = true;
    private int Row = 1;
    private int Col = 1;
    private int playerRow;
    private int playerCol;
    private int points = 0;
    public Player(int Row, int Col) {
        this.Row = Row;
        this.Col = Col;
        this.playerRow = Row;
        this.playerCol = Col;
        this.health = health;
    }
    
    public int getHp()
    {
        return health;
    }
    
    public void setHp(){
        this.health = health;
        playerHp = health;
        
    }
    
    public void setRow(int Row) {
        this.Row = Row;
        playerRow = Row;
    }

    public void setCol(int Col) {
        this.Col = Col;
        playerCol = Col;
    }

    public int getRow() {
        return Row;
    }

    public int getCol() {
        return Col;
    }

    public void setPlayerRow(int Row) {
        playerRow = Row;
    }

    public void setPlayerCol(int Col) {
        playerCol = Col;
    }

    public int getPlayerRow() {
        return playerRow;
    }

    public int getPlayerCol() {
        return playerCol;
    }
    
    public void mazeGet(){
        MazeGenerator mazeGenerator = new MazeGenerator(30);
        mazeGenerator.generateMaze();
        
    }
 
}  

