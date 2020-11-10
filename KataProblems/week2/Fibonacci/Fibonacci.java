package KataProblems.week2.Fibonacci;

public class Fibonacci {
    public static long fib (int n){
        long[] fibs = new long[2];
        fibs[0]=1;
        fibs[1]=1;
        if (n==0){
            return (long) 0;
        }
        if (n==1 || n==2){
            return (long) 1;
        }
        int idx = 2;
        while (idx<n){
            long fib = fibs[0] + fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = fib;
            idx++;
        }
        return fibs[1];
    }
}
