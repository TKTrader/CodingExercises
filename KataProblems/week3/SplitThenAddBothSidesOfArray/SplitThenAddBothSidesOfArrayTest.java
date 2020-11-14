package KataProblems.week3.SplitThenAddBothSidesOfArray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;

public class SplitThenAddBothSidesOfArrayTest {
    @Test
    public void splitAndAdd() throws Exception {

        int[] expected = new int[]{5, 10};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{1, 2, 3, 4, 5}, 2);

        assertEquals(Arrays.toString(expected), Arrays.toString(input));
    }

    @Test
    public void splitAndAdd2() {

        int[] expected = new int[]{15};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{1,2,3,4,5},3);

        assertEquals(Arrays.toString(expected),Arrays.toString(input));
    }

    @Test
    public void splitAndAddEven() {

        int[] expected = new int[]{10};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{1,2,3,4},3);

        assertEquals(Arrays.toString(expected),Arrays.toString(input));
    }

    @Test
    public void splitAndAdd3() {

        int[] expected = new int[]{15};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{15},3);

        assertEquals(Arrays.toString(expected),Arrays.toString(input));
    }

    @Test
    public void splitAndAdd4() {

        int[] expected = new int[]{183, 125};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{32,45,43,23,54,23,54,34},2);

        assertEquals(Arrays.toString(expected),Arrays.toString(input));
    }

    @Test
    public void splitAndAdd5() {

        int[] expected = new int[]{32,45,43,23,54,23,54,34};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{32,45,43,23,54,23,54,34},0);

        assertEquals(Arrays.toString(expected),Arrays.toString(input));
    }

    @Test
    public void splitAndAdd6() {

        int[] expected = new int[]{305, 1195};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{3,234,25,345,45,34,234,235,345},3);

        assertEquals(Arrays.toString(expected),Arrays.toString(input));
    }

    @Test
    public void splitAndAdd7() {

        int[] expected = new int[]{1040, 7712};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{3,234,25,345,45,34,234,235,345,34,534,45,645,645,645,4656,45,3},4);

        assertEquals(Arrays.toString(expected),Arrays.toString(input));
    }

    @Test
    public void splitAndAdd8() {

        int[] expected = new int[]{79327};
        int[] input = SplitThenAddBothSidesOfArray.splitAndAdd(new int[]{23,345,345,345,34536,567,568,6,34536,54,7546,456},20);

        assertEquals(Arrays.toString(expected),Arrays.toString(input));
    }
}