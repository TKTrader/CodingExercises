package KataProblems.week3.TribonacciSequence;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TribonacciSequenceTest {
    private TribonacciSequence variabonacci;

    @Before
    public void setUp() throws Exception {
        variabonacci = new TribonacciSequence();
    }

    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    private double precision = 1e-10;

    @Test
    public void sampleTests1() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
    }

    @Test
    public void sampleTests2() {
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10), precision);
    }

    @Test
    public void sampleTests3() {
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10), precision);
    }

    @Test
    public void sampleTests4() {
        assertArrayEquals(new double []{0,18}, variabonacci.tribonacci(new double []{0,18,16},2), precision);
    }

    @Test
    public void sampleTests5() {
        assertArrayEquals(new double []{0}, variabonacci.tribonacci(new double []{0,18,16},1), precision);
    }

    @Test
    public void sampleTests6() {
        assertArrayEquals(new double []{}, variabonacci.tribonacci(new double []{0,18,16},0), precision);
    }



}
