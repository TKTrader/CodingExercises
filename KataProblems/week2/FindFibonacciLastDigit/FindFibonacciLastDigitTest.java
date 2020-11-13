package KataProblems.week2.FindFibonacciLastDigit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFibonacciLastDigitTest {
    @Test
    public void example1(){
        assertEquals(5, FindFibonacciLastDigit.getFibNumb(193150));
    }


    @Test
    public void example2(){
        assertEquals(0, FindFibonacciLastDigit.getFibNumb(300));
    }

    @Test
    public void example3(){
        assertEquals(6, FindFibonacciLastDigit.getFibNumb(20001));
    }
}
