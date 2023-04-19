package com.mycompany.game;

//import java.io.File;
//import java.util.Random;

import java.util.Scanner;
public class Game
{
    public static void main(String args[]) 
    {
        int pRow = 0;
        int pCol = 0;
        
        int tcount = 0;
        
        MazeGenerator mazeGenerator = new MazeGenerator(30);
        mazeGenerator.generateMaze();
        mazeGenerator.printMazeWithCharacter(pRow, pCol, '@'); //row col character
        System.out.println("RAW MAZE\n" + mazeGenerator.getRawMaze());
        System.out.println("SYMBOLIC MAZE\n" + mazeGenerator.getSymbolicMaze());
        
        Node node = new Node(30, 1);
        Scanner Scan = new Scanner(System.in);
        Player player = new Player(30, 1);
        
        int playerCol = player.getCol();
        System.out.println("Player Column: " + playerCol);

        int playerRow = player.getRow();
        System.out.println("Player Row: " + playerRow);

        int hp = player.getHp();
        System.out.println("Player Lives: " + hp + "/10");
        
        boolean isWall = mazeGenerator.isWall(pRow +1, pCol +1);
        System.out.println(isWall);
        
//BIG BREAK OF TEXT SO I DONT LOSE MY MIND
//
//SPACED FOR YOUR PLEASURE
        AGAIN:
        while(tcount < 10){ //this while loop is for testing but I forgot how handy these loops are
           
            System.out.println("Move Left, Right, Up, Down, or quit? (test case: take)");
            String direction = Scan.nextLine().toLowerCase();
            System.out.println("direction input " + direction);
            int nextX = player.getRow() + 1;
            int nextY = player.getCol() + 1;
            if (direction.equals("up")) //NORTH
            {
                
                if (player.getRow() > 29 || isWall== true){
                    System.out.println("This move is invalid: Either off the Map or Collision with a wall");
                    continue AGAIN;
                }
                else{
                    pRow -= 1;
                    mazeGenerator.printMazeWithCharacter(pRow, pCol, '@'); //NOTE the array and get collomn are different +1 for get row is up while +1 for printmaze with character is down.
                    player.setRow(player.getRow() + 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                    System.out.println("isWall " + isWall);
                }
            }
            else if (direction.equals("down")) //SOUTH
            {
                if (player.getRow() < 1 || isWall == true){
                    System.out.println("This move is invalid: Either off the Map or Collision with a wall");
                    continue AGAIN;
                }

                else{
                    pRow += 1;
                    mazeGenerator.printMazeWithCharacter(pRow, pCol, '@');
                    player.setRow(player.getRow() - 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                    System.out.println("isWall " + isWall);
                }
            }
            else if (direction.equals("right")) //EAST
            {
                if (player.getCol() > 30 || isWall == true){
                    System.out.println("This move is invalid: Either off the Map or Collision with a wall");
                    continue AGAIN;
                }
                else{
                    pCol += 1;
                    mazeGenerator.printMazeWithCharacter(pRow, pCol, '@');
                    player.setCol(player.getCol() + 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                    System.out.println("isWall " + isWall);
                }
                
            }
            else if (direction.equals("left")) //WEST
            {
                if (player.getRow() < 1 || isWall == true){
                    System.out.println("This move is invalid: Either off the Map or Collision with a wall");
                    continue AGAIN;
                }
               
                else{
                    pCol -= 1;
                    mazeGenerator.printMazeWithCharacter(pRow, pCol, '@');
                    player.setCol(player.getCol() - 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                    System.out.println("isWall " + isWall);
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
            else if (direction.equals("take"))
            {
                System.out.println("health taken");
                
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
        
       //save text line to make sure stuff is saving (reworking maze, shoulc have easier time iwht collision detection)
       /*
       // Get the player's next position
int nextX = player.getX() + dx;
int nextY = player.getY() + dy;

// Check if the next position is valid and not a wall
if (nextX >= 0 && nextX < maze.length && nextY >= 0 && nextY < maze[0].length && maze[nextX][nextY] == 0) {
    // Move the player to the next position
    player.setX(nextX);
    player.setY(nextY);
} else {
    // The next position is a wall, do not move the player
}
       */
    }

}
