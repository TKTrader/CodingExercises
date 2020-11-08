package KataProblems.PipiNumbers;

import java.math.BigInteger;
// P(n) = ((((n^2 - P(0))^2 - P(1))^2-P(2))^2...-...P(n-1))^2

public class JomoPipi {
    public static BigInteger pipi(int n) {
        BigInteger[] pipiNum = new BigInteger[n+1];
        if (n==0) {
            return BigInteger.ZERO;
        } else if (n==1) {
            return BigInteger.ONE;
        } else if (n==2) {
            return BigInteger.valueOf(9);
        } else {
            pipiNum[0] = BigInteger.ZERO;
            pipiNum[1] = BigInteger.ONE;
            pipiNum[2] = new BigInteger("9");
        }
        BigInteger solution = BigInteger.valueOf(n);
        int goalIdx = n;
        for (int idx=1; idx<goalIdx; idx++) {
            solution = solution.multiply(solution).subtract(pipiNum[idx-1]);
            pipiNum[idx]=solution;
        }
        return pipiNum[goalIdx];
    }

    public static void main(String[] args) {
        BigInteger x = pipi(4);
        System.out.println(x);
    }


}
