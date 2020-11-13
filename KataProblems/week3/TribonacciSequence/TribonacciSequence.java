package KataProblems.week3.TribonacciSequence;

public class TribonacciSequence {
    public double[] tribonacci(double[] s, int n) {
        double[] solution = new double[n];
        if (n>0){
            solution[0]=s[0];
        }
        if (n>1){
            solution[1]=s[1];
        }
        if (n>2){
            solution[2]=s[2];
        }
        int idx = 3;
        while (idx<n){
            solution[idx] = solution[idx-3] + solution[idx-2] + solution[idx-1];
            idx++;
        }
        return solution;
    }
}
