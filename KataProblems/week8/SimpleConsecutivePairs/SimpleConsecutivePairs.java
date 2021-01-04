package KataProblems.week8.SimpleConsecutivePairs;

public class SimpleConsecutivePairs {
    public static int solve(int [] arr){
        int solution = 0;
        for (int i=0; i<arr.length-1; i=i+2){
            if (Math.abs(arr[i+1]-arr[i]) == 1) {
                solution++;
            }
        }
        return solution;
    }
}
