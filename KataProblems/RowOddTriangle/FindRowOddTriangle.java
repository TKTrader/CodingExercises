package KataProblems.RowOddTriangle;

public class FindRowOddTriangle {
    // Goal: produce row n
    // Explanation:  row n has n elements
    // first element of series: 1, assume this is row 0
    // First element of each row P(n+1) = P(n) + 2(n)
    // 7 <=> 1 + 2(1) + 2(2)
    // 21 <=> 1 + 2(1) + 2(2) + 2(3) +2(4) <=> 1 + 2(1+2+3+4) <=> 1+ 2(n(n+1)/2 <=> n^2+n+1
    // P(n) = n^2 + n + 1
    // Since first row = 1 => P(n) = (n-1)^2 + (n-1) +1 = n^2 - n + 1
    public static long[] oddRow(int n) {
        long element = (long) n*n-n+1;
        long[] row = new long[n];
        row[0] = element;

        for (int idx=1; idx<n; idx++) {
            element = element + 2;
            row[idx] = element;
        }
        return row;
    }
}
