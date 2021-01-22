package KataProblems.week9_FinalWeek.Snail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;
import java.util.Arrays;
import java.util.Random;
import static java.util.stream.Collectors.joining;

public class SnailTest {
    @Test
    public void emptytest() {
        int[][] array = new int[0][0];
        System.out.println(array.length);
        int[] r = {};
        test(array,r);
    }

    @Test
    public void SnailTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }

    @Test
    public void SnailTest5() {
        int[][] array
                = {{1, 2, 3, 4,  5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}};
        int[] r = {1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        test(array, r);
    }

    @Test
    public void SnailTest2() {
        int[][] array
                = {{1}};
        int[] r = {1};
        test(array, r);
    }

    //good
    @Test
    public void SnailTest3() {
        int[][] array
                = {{1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10},
                {11, 12, 13,14}};
        int[] r = {1, 2, 3, 4,7, 10,14, 13, 12, 11, 7, 4, 5, 6,9,8};
        test(array, r);
    }

    // good
    @Test
    public void SnailTest3a() {
        int[][] array
                = {{1, 2, 3, 4, 5, 6},
                {20, 21, 22, 23, 24, 7},
                {19, 32, 33, 34, 25, 8},
                {18, 31, 36, 35, 26, 9},
                {17, 30, 29, 28, 27, 10},
                {16, 15, 14, 13, 12, 11}};
        int[] r = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,19, 20,21, 22,23,24,25,26,27,28, 29,30,31,32,33,34,35,36};
        test(array, r);
    }

    // good
    @Test
    public void SnailTest4() {
        int[][] array
                = {{1, 2},
                {4, 3}};
        int[] r = {1, 2, 3, 4};
        test(array, r);
    }

    public String int2dToString(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        Assert.assertArrayEquals( result, Snail.snail(array));
    }
}
