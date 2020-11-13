package KataProblems.week2.FindFibonacciLastDigit;

public class FindFibonacciLastDigit {
    public static int getFibNumb(int n) {
        int[] fibs = new int[2];
        fibs[0] = 1;
        fibs[1] = 1;
        if (n<3) {
            return fibs[n-1];
        }
        int idx = 1;
        while (idx < n-1){
            int next = (fibs[0] + fibs[1]) % 10;
            idx++;
            fibs[0]=fibs[1];
            fibs[1]=next;
        }
        return fibs[1];
    }
}
