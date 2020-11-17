package KataProblems.week3.ConnectFour;

import java.util.List;

// Prints board successfully after entries (do more test checks)
// checkDiagonals needed
// test
public class ConnectFour {
    public static Character winner = 'X';

    public static String whoIsWinner(List<String> piecesPositionList) {
        // retrun "Red" or "Yellow" or "Draw"
        Character[][] board = new Character[6][7];
        for (String move : piecesPositionList) {
            System.out.println(move);
            int col = getColumn(move);
            Character color = move.charAt(2);
            int row = insertInColumn(col, color, board);
            if (checkIfSolutionFound(row, col, board)) {
                printBoard(board);
                if (winner=='Y'){
                    return "Yellow";
                } else {
                    return "Red";
                }
            }
        }
        printBoard(board);
        return "Draw"; // if no solution found, draw
    }

    public static int getColumn(String move) {
        Character column = move.charAt(0);
        int col = 0;
        switch (column) {
            case 'A':
                col = 0;
                break;
            case 'B':
                col = 1;
                break;
            case 'C':
                col = 2;
                break;
            case 'D':
                col = 3;
                break;
            case 'E':
                col = 4;
                break;
            case 'F':
                col = 5;
                break;
            case 'G':
                col = 6;
                break;
        }
        return col;
    }

    public static int insertInColumn(int col, Character color, Character[][] board) {
        int row = 5;
        boolean rowFound = false;
        while (!rowFound && row>=0) {
            if (board[row][col]==null) {
                rowFound = true;
            } else {
                row--;
            }
        }
        board[row][col] = color;
        System.out.println("Inserted " + color + " at [" + row + ", " + col + "]");
        return row;
    }

    // Need to complete these functions
    // return boolean or winner?
    public static boolean checkIfSolutionFound(int row, int column, Character[][] board) {
        if(checkHorizontal(row, column, board)) {return true;}
        if(checkVertical( row, column, board)) {return true;}
        if(checkDiagonals(row, column, board)) {return true;}
        return false;
    }

    public static boolean checkHorizontal(int row, int col, Character[][] board){
        // get color at position, count left until opponent piece or left border,
        // count right until opponent piece or right border
        int count = 1;
        int leftIndex = col-1;
        while (leftIndex>0 && board[row][leftIndex]==board[row][col]){
            count++;
            leftIndex--;
        }
        int rightIndex=col+1;
        while (rightIndex<7 && board[row][rightIndex]==board[row][col]) {
            count++;
            rightIndex++;
        }
        return isWinnerFound(row, col, board, count);
    }
    public static boolean checkVertical(int row, int col, Character[][] board){
        int count = 1;
        int upperIndex = row-1;
        while (upperIndex>0 && board[upperIndex][col]==board[row][col]){
            count++;
            upperIndex--;
        }
        int lowerIndex=row+1;
        while (lowerIndex<6 && board[lowerIndex][col]==board[row][col]) {
            count++;
            lowerIndex++;
        }
        return isWinnerFound(row, col, board, count);
    }
    public static boolean checkDiagonals(int row, int col, Character[][] board){
        int count=0;
        // TODO: COMPLETE METHOD
        return isWinnerFound(row, col, board, count);
    }

    public static boolean isWinnerFound(int row, int col, Character[][] board, int count){
        if(count>=4){
            winner=board[row][col];
            return true;
        } else {
            return false;
        }
    }


    public static void printBoard(Character[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j=0; j<board[i].length;j++){
                if (board[i][j]!=null) {
                    System.out.print(board[i][j] + ", ");
                } else {
                    System.out.print("-, ");
                }
            }
        }
    }
}