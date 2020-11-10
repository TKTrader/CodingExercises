package KataProblems.week2.Fibonacci;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class FibonacciTest {
    @Test
    public void test1() {
        assertEquals(1, Fibonacci.fib(1));
    }

    @Test
    public void test2() {
        assertEquals(1, Fibonacci.fib(2));
    }

    @Test
    public void test2a() {
        assertEquals(2, Fibonacci.fib(3));
    }

    @Test
    public void test3() {
        assertEquals(34, Fibonacci.fib(9));
    }

    @Test
    public void test4() {
        assertEquals(377, Fibonacci.fib(14));
    }

    @Test
    public void test5() {
        assertEquals(102334155, Fibonacci.fib(40));
    }
}
