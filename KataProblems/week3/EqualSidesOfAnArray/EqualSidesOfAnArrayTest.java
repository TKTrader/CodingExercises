package KataProblems.week3.EqualSidesOfAnArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualSidesOfAnArrayTest {
    @Test
    public void test() {
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(1,EqualSidesOfAnArray.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(3,EqualSidesOfAnArray.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(1,EqualSidesOfAnArray.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,EqualSidesOfAnArray.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }

    @Test
    public void testNotFound() {
        assertEquals(-1,EqualSidesOfAnArray.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(-1,EqualSidesOfAnArray.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    }

    @Test
    public void testFirstIndex() {
        assertEquals(0,EqualSidesOfAnArray.findEvenIndex(new int[] {1,3,3,-3,-2,-1}));
    }
}
