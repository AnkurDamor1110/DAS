package Backtracking;

public class Q1_ratMaze {


    public static void printMaze(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol[0].length;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][],int x,int y){

        return (x >=0 && x < maze.length && y >=0 && y < maze.length && maze[x][y] == 1 ); 

    }
    public static boolean solveMaze(int maze[][]){
        int sol[][] = new int[maze.length][maze[0].length];

        if(solveMazeUtil(maze,0,0,sol) == false){
            System.out.println("no.. solution does not exit");
            return false;
        }
        printMaze(sol);
        return true;
    }
    public static boolean solveMazeUtil(int maze[][],int x,int y,int sol[][]){
        //base case
        if(x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }
        //recursion 
        if(isSafe(maze,x,y)==true){
            if(sol[x][y]  == 1){
                return false;
            }
            sol[x][y]=1;
            if(solveMazeUtil(maze, x+1, y, sol)){
                return true;
            }
            if(solveMazeUtil(maze, x, y+1, sol)){
                return true;
            }
            //sol[x][y]=0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };
          solveMaze(maze);             
                  
    }
}
