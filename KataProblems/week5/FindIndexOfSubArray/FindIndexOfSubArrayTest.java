package KataProblems.week5.FindIndexOfSubArray;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

public class FindIndexOfSubArrayTest {
    @Test
    public void testSomething1() {
        int[] actual = new FindIndexOfSubArray(new int[]{1, 2, 3, 6, 4, 4}).findIndexOfSubArray();
        assertTrue("should return [3,5]", Arrays.deepEquals(new Integer[]{3, 5}, new Integer[]{actual[0], actual[1]}));
    }

    @Test
    public void testSomething2() {
        int[] actual = new FindIndexOfSubArray(new int[]{1, 2, 3}).findIndexOfSubArray();
        assertTrue("should return [0,0]", Arrays.deepEquals(new Integer[]{0, 0}, new Integer[]{actual[0], actual[1]}));
    }

    @Test
    public void testSomething3() {
        int[] actual = new FindIndexOfSubArray(new int[]{1, 1, 1}).findIndexOfSubArray();
        assertTrue("should return [0,0]", Arrays.deepEquals(new Integer[]{0, 0}, new Integer[]{actual[0], actual[1]}));
    }

    @Test
    public void testSomething4() {
        int[] actual = new FindIndexOfSubArray(new int[]{1, 2, 3, 6, 5, 4}).findIndexOfSubArray();
        assertTrue("should return [3,5]", Arrays.deepEquals(new Integer[]{3, 5}, new Integer[]{actual[0], actual[1]}));
    }

    @Test
    public void testSomething5() {
        int[] actual = new FindIndexOfSubArray(new int[]{6, 5, 4, 1, 2, 3}).findIndexOfSubArray();
        assertTrue("should return [3,5]", Arrays.deepEquals(new Integer[]{3, 5}, new Integer[]{actual[0], actual[1]}));
    }

    @Test
    public void testSomething6() {
        int[] actual = new FindIndexOfSubArray(new int[]{9, 2, 32, 123, 3, 2, 2}).findIndexOfSubArray();
        assertTrue("should return [0,4]", Arrays.deepEquals(new Integer[]{0, 4}, new Integer[]{actual[0], actual[1]}));
    }

    @Test
    public void testSomething7() {
        int[] actual = new FindIndexOfSubArray(new int[]{2,2,3,123,32,2,9}).findIndexOfSubArray();
        assertTrue("should return [2,6]", Arrays.deepEquals(new Integer[]{0, 4}, new Integer[]{actual[0], actual[1]}));
    }
}
