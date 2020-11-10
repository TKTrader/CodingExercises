package KataProblems.week2.GrowthOfAPopulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class GrowthOfAPopulationTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(GrowthOfAPopulation.nbYear(1500, 5, 100, 5000), 15);
    }

    @Test
    public void Test2(){
        testing(GrowthOfAPopulation.nbYear(1500000, 2.5, 10000, 2000000), 10);
    }

    @Test
    public void Test3(){
        testing(GrowthOfAPopulation.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
