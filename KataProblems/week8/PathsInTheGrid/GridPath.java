package KataProblems.week8.PathsInTheGrid;

import java.math.BigInteger;

public class GridPath {
    // number of steps needed: m+n
    // number of steps to choose path alteration: n
    // total combinatorial possibilities: (m+n) choose (n) = (m+n)!/(m!*n!)
    public static BigInteger numberOfRoutes (int m, int n) {
        if (m==0 || n==0){return BigInteger.ZERO;}
        BigInteger solution = BigInteger.valueOf(m+n);
        BigInteger numeratorMultiplier = BigInteger.valueOf(m+n-1);
        BigInteger denominator = BigInteger.valueOf(m);
        while(numeratorMultiplier.compareTo(BigInteger.valueOf(n))==1){
            solution = solution.multiply(numeratorMultiplier);
            numeratorMultiplier = numeratorMultiplier.subtract(BigInteger.ONE);
        }
        while(denominator.compareTo(BigInteger.valueOf(0))==1){
            solution = solution.divide(denominator);
            denominator = denominator.subtract(BigInteger.ONE);
        }
        return solution;
    }
}
