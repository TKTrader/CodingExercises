package KataProblems.week8.CureCancer;

import java.util.Arrays;

// Solution 1 fails last tests for time performance but should be logically good
public class CureCancer {
//    public static int[] mutationLocation(char[][] body) {
//        for (int col=0; col<body[0].length; col++){
//            char c = body[0][col];
//            for (int row=1; row<body.length; row++){
//                if (c!=body[row][col]){
//                    if (row==1 && c!=body[row+1][col]){
//                        return new int[]{0,col};
//                    } else {
//                        return new int[]{row,col};
//                    }
//                }
//            }
//        }
//        return new int[0];
//    }

    // Solution 2 passes time performance tests
    public static int[] mutationLocation(char[][] body) {
        for (int row=1; row<body.length; row++){
            if (!Arrays.equals(body[0],body[row])){
                for (int col=0; col<body[0].length; col++){
                    if (body[0][col]!=body[row][col]){
                        if (row==1 && body[0][col]!=body[row+1][col]){
                            return new int[]{0,col};
                        } else {
                            return new int[]{row,col};
                        }
                    }
//                    System.out.println(body[0][col]);
//                    System.out.println(body[row][col]);
                }
            }
        }
        return new int[0];
    }
}
