package KataProblems.week2.SimpleConsecutivePairs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleConsecutivePairsTest {
    @Test
    public void Test1(){
        assertEquals(4,SimpleConsecutivePairs.solve(new int[]{1,2,5,8,-4,-3,7,6,5}));
    }

    @Test
    public void Test2() {
        assertEquals(3, SimpleConsecutivePairs.solve(new int[]{21, 20, 22, 40, 39, -56, 30, -55, 95, 94}));
    }

    @Test
    public void Test3() {
        assertEquals(0, SimpleConsecutivePairs.solve(new int[]{81, 44, 80, 26, 12, 27, -34, 37, -35}));
    }
    @Test
    public void Test4() {
        assertEquals(4, SimpleConsecutivePairs.solve(new int[]{-55, -56, -7, -6, 56, 55, 63, 62}));
    }
}
