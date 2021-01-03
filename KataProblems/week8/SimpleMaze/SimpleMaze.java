package KataProblems.week8.SimpleMaze;

public class SimpleMaze {
    public static char[][] newMaze;
    public static boolean pathFound;

    public static boolean hasExit(String[] maze) {
        int maxLength=0;
        boolean singleK=false;
        int rowPos=-1;
        int colPos=-1;
        pathFound=false;
        // get starting position and ensure only one starting position
        for (int i=0; i<maze.length; i++){
            maxLength = Math.max(maze[i].length(),maxLength);
            for (int j=0; j<maze[i].length();j++){
                if (maze[i].charAt(j)=='k' && !singleK){
                    singleK=true;
                    rowPos=i;
                    colPos=j;
                } else if (maze[i].charAt(j)=='k' && singleK){
                    throw new RuntimeException();
                }
            }
        }
        // ensure maze rectangular to avoid boiler plate code
        newMaze = new char[maze.length][maxLength];
        for (int k=0; k<maze.length; k++){
            while(maze[k].length()<maxLength){
                maze[k]=maze[k].concat(" ");
            }
            for (int l=0; l<maze[k].length(); l++){
                newMaze[k][l]=maze[k].charAt(l);
            }
        }

        //check if Solved at starting position
        if (solved(rowPos,colPos, maze.length, maxLength)){return true;}

        // dfs
        findPath(rowPos, colPos);

        printFinalMaze();

        return pathFound;
    }

    // recurse until either 1) exit found 2) no additional paths available
    public static void findPath(int row, int col){
        if (!pathFound) {
            // check left
            if (newMaze[row][col-1]==' '){
                newMaze[row][col-1]='k';
                if (solved(row,col-1,newMaze.length,newMaze[0].length)){
                    pathFound = true;
                    return;
                }
                findPath(row,col-1);
            }
            // check up
            if (newMaze[row-1][col]==' '){
                newMaze[row-1][col]='k';
                if (solved(row-1,col,newMaze.length,newMaze[0].length)){
                    pathFound = true;
                    return;
                }
                findPath(row-1,col);
            }
            // check right
            if (newMaze[row][col+1]==' '){
                newMaze[row][col+1]='k';
                if (solved(row,col+1,newMaze.length,newMaze[0].length)){
                    pathFound = true;
                    return;
                }
                findPath(row,col+1);
            }
            // check down
            if (newMaze[row+1][col]==' '){
                newMaze[row+1][col]='k';
                if (solved(row+1,col,newMaze.length,newMaze[0].length)){
                    pathFound = true;
                    return;
                }
                findPath(row+1,col);
            }
        }
    }

    public static boolean solved(int row, int col, int numRows, int maxLength){
        if (row==0 || row==numRows-1 || col==0 || col==maxLength-1){
            return true;
        }
        return false;
    }

    public static void printFinalMaze(){
        for (int row=0; row<newMaze.length; row++){
            for (int col=0; col<newMaze[0].length; col++){
                System.out.print(newMaze[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
