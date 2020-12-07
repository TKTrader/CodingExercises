package KataProblems.week5.SortTwoArrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ArraySorterTest {
    @Test
    public void exampleTests() {
        int[] a1 = {5, 4, 3, 2, 1};
        int[] a2 = {6, 5, 7, 8, 9};
        assertEquals(new int[][]{{4, 5, 3, 2, 1}, {9, 8, 7, 5, 6}}, ArraySorter.sortTwoArrays(a1, a2));
    }

    @Test
    public void example2() {
        int[] a3 = {2, 1, 3, 4, 5};
        int[] a4 = {5, 6, 7, 8, 9};
        assertEquals(new int[][]{{2, 1, 3, 4, 5}, {6, 5, 7, 8, 9}}, ArraySorter.sortTwoArrays(a3, a4));
    }

    @Test
    public void example3() {
        int[] a5 = {5, 6, 9, 2, 6, 5};
        int[] a6 = {3, 6, 7, 4, 8, 1};
        assertEquals(new int[][]{{5, 5, 2, 6, 9, 6}, {4, 3, 1, 6, 8, 7}}, ArraySorter.sortTwoArrays(a5, a6));
    }

    @Test
    public void example4() {
        int[] a7 = {};
        int[] a8 = {};
        assertEquals(new int[][]{{}, {}}, ArraySorter.sortTwoArrays(a7, a8));
    }

    @Test
    public void example5(){
        int[] a9 = {1};
        int[] a10 = {5};
        assertEquals( new int[][] {{1},{5}} , ArraySorter.sortTwoArrays(a9,a10));
    }

    @Test
    public void example6(){
        int[] a9 = {1,2,1};
        int[] a10 = {1,2,3};
        assertEquals( new int[][] {{1,2,1},{1,3,2}} , ArraySorter.sortTwoArrays(a9,a10));
    }
}
