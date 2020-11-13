package KataProblems.week2.SimpleConsecutivePairs;

public class SimpleConsecutivePairs {
    // Solutions incorrect on CodeWars
    public static int solve(int [] arr){
        int solution = 0;
        for (int i=0; i<arr.length-1; i++){
            if (Math.abs(arr[i+1]-arr[i]) == 1) {
                solution++;
            }
        }
        return solution;
    }
}
