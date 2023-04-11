package com.mycompany.game;

//import java.io.File;
//import java.util.Random;

import java.util.Scanner;
public class Game
{
    public static void main(String args[]) 
    {
        int tcount = 0;
        MazeGenerator mazeGenerator = new MazeGenerator(30);
        mazeGenerator.generateMaze();

        //System.out.println("RAW MAZE\n" + mazeGenerator.getRawMaze());
        //System.out.println("SYMBOLIC MAZE\n" + mazeGenerator.getSymbolicMaze());
        
        Scanner Scan = new Scanner(System.in);
        Player player = new Player(30, 1);
        
        int playerCol = player.getCol();
        System.out.println("Player Column: " + playerCol);

        int playerRow = player.getRow();
        System.out.println("Player Row: " + playerRow);

        int hp = player.getHp();
        System.out.println("Player Lives: " + hp + "/1");
        
        
//BIG BREAK OF TEXT SO I DONT LOSE MY MIND
//
//SPACED FOR YOUR PLEASURE
        AGAIN:
        while(hp < 10){ //this while loop is for testing but I forgot how handy these loops are
           
            System.out.println("Move Left, Right, Up, Down, or quit?");
            String direction = Scan.nextLine().toLowerCase();
            System.out.println("direction input " + direction);
            if (direction.equals("up")) //NORTH
            {
                if (player.getRow() >= 30){
                    System.out.println("This move is invalid");
                    continue AGAIN;
                }
                else{
                    System.out.println("SYMBOLIC MAZE\n" + mazeGenerator.getSymbolicMaze());
                    player.setRow(player.getRow() + 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                }
            }
            else if (direction.equals("down")) //SOUTH
            {
                if (player.getRow() <= 1){
                    System.out.println("This move is invalid");
                    continue AGAIN;
                }
                else{
                    System.out.println("SYMBOLIC MAZE\n" + mazeGenerator.getSymbolicMaze());
                    player.setRow(player.getRow() - 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                }
            }
            else if (direction.equals("right")) //EAST
            {
                if (player.getCol() >= 30){
                    System.out.println("This move is invalid");
                    continue AGAIN;
                }
                else{
                    System.out.println("SYMBOLIC MAZE\n" + mazeGenerator.getSymbolicMaze());
                    player.setCol(player.getCol() + 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());  
                }
                
            }
            else if (direction.equals("left")) //WEST
            {
                if (player.getCol() <= 1){
                    System.out.println("This move is invalid");
                    continue AGAIN;
                }
                else{
                    System.out.println("SYMBOLIC MAZE\n" + mazeGenerator.getSymbolicMaze());
                    player.setCol(player.getCol() - 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                }
            }
            else if (direction.equals("quit")){ //QUIT
                System.out.println("Are you sure? all progress will be lost. (Yes or No)");
                String quityn = Scan.nextLine().toLowerCase();
                if (quityn.equals("yes"))
                {
                    break;
                }
                else{
                    continue AGAIN;
                }
            }
            else //BAD INPUT
            {
                System.out.println("Invalid move. Please try again");
                System.out.println("Player Column: " + playerCol);
                System.out.println("Player Row: " + playerRow);
                continue AGAIN;
            }
            
            
            
            tcount += 1;
            System.out.println("test count " + tcount);
        }
        
       //save text line to make sure stuff is saving
    }

}