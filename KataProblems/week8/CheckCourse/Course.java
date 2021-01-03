package KataProblems.week8.CheckCourse;

public class Course {
    public static boolean checkCourse(char[][] map) {
        for (char[] array : map) {
            System.out.println(array);
        }
        int row = getStartingRow(map);
        int col = 0;
//        int[] shipColumns = getShipColumns(map);
        char[] shipDirection = new char[map[0].length]; // make all zeroes
        if (!checkSafety(map,row,col)){
            System.out.println(row+","+col);
            return false;
        }
        col++;
        while (col<map[0].length-1){
            map = transformMap(map, row, col, shipDirection);
            if (!checkSafety(map,row,col)) {
                System.out.println(row+","+col);
                return false;
            }
            col++;
        }
        System.out.println(row+","+col);
        return true;
    }

    public static char[][] transformMap(char[][]map,int startRow,int startCol, char[] shipDirection){
        char[][] newMap = new char[map.length][map[0].length];
        int iterCol = startCol>0 ? startCol-1 : startCol;
        for (int row=0; row<map.length; row++){
            for (int col=iterCol; col<map[0].length; col++){
                if (row>0 && row<map.length-1 && map[row][col]=='N'){
                      if (shipDirection[col]=='D'){
                        newMap[row+1][col]='N';
                    } else {
                        newMap[row-1][col]='N';
                    }
                }
                if (row==0 && map[row][col]=='N'){
                    shipDirection[col]='D';
                    newMap[row+1][col]='N';
                } else if (row==map.length-1 && map[row][col]=='N'){
                    shipDirection[col]='U';
                    newMap[row-1][col]='N';
                }
            }
        }
        newMap[startRow][startCol]='X';
        return newMap;
    }

    public static int getStartingRow(char[][] map){
        for (int row = 0; row < map.length; row++){
            if (map[row][0]=='X') {
                return row;
            }
        }
        return -1;
    }

    public static boolean checkSafety(char[][] map, int row, int col){
        if (row>0 && row<map.length-1 && col>0 && col<map[0].length-1){
            if (map[row][col-1]=='N' || map[row][col+1]=='N' || map[row+1][col]=='N' || map[row-1 ][col]=='N'
            || map[row+1][col-1]=='N' || map[row-1][col-1]=='N' || map[row+1][col+1]=='N' || map[row-1][col+1]=='N'){
                return false;
            }
        } else if (row>0 && row<map.length-1 && col==0){
            if (map[row][col+1]=='N' || map[row+1][col]=='N' || map[row-1 ][col]=='N'
                    || map[row+1][col+1]=='N' || map[row-1][col+1]=='N'){
                return false;
            }
        } else if (row>0 && row<map.length-1 && col==map[0].length-1){
            if (map[row][col-1]=='N' || map[row+1][col]=='N' || map[row-1 ][col]=='N'
                    || map[row+1][col-1]=='N' || map[row-1][col-1]=='N'){
                return false;
            }
        } else if (row==0){
            if (map[1][col]=='N'){return false;};
            if (col==0 && (map[0][1]=='N' || map[1][1]=='N')){ return false;}
            if (col==map[0].length-1 && (map[0][map[0].length-2]=='N' || map[1][map[0].length-2]=='N')){return false;}
            if (col>0 && col<map[0].length-1 && (map[0][col-1]=='N' || map[1][col-1]=='N' || map[0][col+1]=='N' || map[1][col+1]=='N')){
                return false;
            }
        } else if (row==map.length-1){
            if (map[map.length-2][col]=='N'){return false;};
            if (col==0 && (map[map.length-1][1]=='N' || map[map.length-2][1]=='N')){
                return false;
            } else if (col==map[0].length-1 && (map[map.length-1][map[0].length-2]=='N' || map[map.length-2][map[0].length-2]=='N')){
                return false;
            } else if (col>0 && col<map[0].length-1 && (map[map.length-1][col-1]=='N' || map[map.length-2][col-1]=='N'
                    || map[map.length-1][col+1]=='N' || map[map.length-2][col+1]=='N')){
                return false;
            }
        }
        return true;
    }
}
