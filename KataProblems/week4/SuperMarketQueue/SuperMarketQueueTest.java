package KataProblems.week4.SuperMarketQueue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SuperMarketQueueTest {
    @Test
    public void testNormalCondition() {
        assertEquals(9, SuperMarketQueue.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, SuperMarketQueue.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, SuperMarketQueue .solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }

    @Test
    public void testThreeTillsManyCustomers() {
        assertEquals(7, SuperMarketQueue .solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 3));
    }

    @Test
    public void testTillsGreaterThanExistingCustomers() {
        assertEquals(2, SuperMarketQueue .solveSuperMarketQueue(new int[] { 1, 2 }, 4));
    }
}
