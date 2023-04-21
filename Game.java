package com.mycompany.game;

//import java.io.File;
//import java.util.Random;

import java.util.Scanner;
public class Game
{
    public static void main(String args[]) 
    {
        
        MazeGenerator mazeGenerator = new MazeGenerator(30);
        mazeGenerator.generateMaze();
        System.out.println(mazeGenerator.getRawMaze());
        System.out.println(mazeGenerator.getSymbolicMaze());
        
        Node node = new Node(30, 1);
        Scanner Scan = new Scanner(System.in);
        Player player = new Player(0, 0, 10, 0);
        
        int playerCol = player.getCol();
        System.out.println("Player Column: " + playerCol);

        int playerRow = player.getRow();
        System.out.println("Player Row: " + playerRow);
        
        int pRow = playerRow;
        int pCol = playerCol;
        mazeGenerator.printMazeWithCharacter(pRow, pCol, '@'); //row col character
        int hp = player.getHp();
        System.out.println("Player Lives: " + hp + "/10");
        
        int points = player.getPoints();
        System.out.println("Score = " + points);
        boolean isWall = mazeGenerator.isWall(pRow , pCol );
        System.out.println(isWall);
        
//BIG BREAK OF TEXT SO I DONT LOSE MY MIND
//
//SPACED FOR YOUR PLEASURE
        AGAIN:
        while(hp > 0){ //this while loop is for testing but I forgot how handy these loops are
           
            System.out.println("Move Left, Right, Up, Down, or quit? (test case: take)");
            String direction = Scan.nextLine().toLowerCase();
            System.out.println("direction input " + direction);
            
            if (direction.equals("up")) //NORTH
            {
                if (player.getRow() != 0){
                    isWall = mazeGenerator.isWall(pRow -1, pCol );
                }
                else if (player.getRow() <= 0 || isWall== true){
                    System.out.println("This move is invalid: Either off the Map or Collision with a wall");
                    continue AGAIN;
                }
                else{
                    pRow -= 1;
                    mazeGenerator.printMazeWithCharacter(pRow, pCol, '@'); //NOTE the array and get collomn are different +1 for get row is up while +1 for printmaze with character is down.
                    player.setRow(player.getRow() - 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                    System.out.println("isWall " + isWall);
                    System.out.println("Lives = " + hp);
                    System.out.println("Score = " + points);
                }
            }
            else if (direction.equals("down")) //SOUTH
            {
                isWall = mazeGenerator.isWall(pRow +1, pCol );
                if (player.getRow() >= 29 || isWall == true){
                    System.out.println("This move is invalid: Either off the Map or Collision with a wall");
                    continue AGAIN;
                }

                else{
                    pRow += 1;
                    mazeGenerator.printMazeWithCharacter(pRow, pCol, '@');
                    player.setRow(player.getRow() + 1);
                    System.out.println("Player Column: " + player.getPlayerCol());
                    System.out.println("Player Row: " + player.getPlayerRow());
                    System.out.println("isWall " + isWall);
                    System.out.println("Lives = " + hp);
                    System.out.println("Score = " + points);
                }
            }
            else if (direction.equals("right")) //EAST
            {
                
                isWall = mazeGenerator.isWall(pRow, pCol +1);
                if (player.getCol() >= 29 || isWall == true){
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
                    System.out.println("Lives = " + hp);
                    System.out.println("Score = " + points);
                }
                
            }
            else if (direction.equals("left")) //WEST
            {
                isWall = mazeGenerator.isWall(pRow, pCol -1);
                if (player.getRow() <= 0 || isWall == true){
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
                    System.out.println("Lives = " + hp);
                    System.out.println("Score = " + points);
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
                hp -= 1;
                System.out.println("health taken");
            }
                  
            else //BAD INPUT
            {
                System.out.println("Invalid move. Please try again");
                System.out.println("Player Column: " + playerCol);
                System.out.println("Player Row: " + playerRow);
                continue AGAIN;
            }
            
            
           
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
