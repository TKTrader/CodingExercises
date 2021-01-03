package KataProblems.week8.PathsInTheGrid;

import java.math.BigInteger;
import static org.junit.Assert.*;
import org.junit.Test;

public class GridPathTests {
    private static void tester (int m, int n, BigInteger exp) {
        assertEquals(exp, GridPath.numberOfRoutes(m, n));
    }
    @Test
    public void ExampleTests () {
        tester(1, 1, new BigInteger("2"));
        tester(5, 1, new BigInteger("6"));
        tester(3, 4, new BigInteger("35"));
        tester(0, 4, new BigInteger("0"));
        tester(4, 0, new BigInteger("0"));
    }
}
