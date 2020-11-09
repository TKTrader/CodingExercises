package KataProblems.PipiNumbers;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;

public class JomoPipiTest {
    @Test
    public void test0() {
        assertEquals(BigInteger.ZERO, JomoPipi.pipi(0));
    }
    @Test
    public void test1() {
        assertEquals(BigInteger.ONE, JomoPipi.pipi(1));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(9), JomoPipi.pipi(2));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(3025), JomoPipi.pipi(3));
    }

    @Test
    public void test4() {
        assertEquals(BigInteger.valueOf(43631), JomoPipi.pipi(4));
    }

    @Test
    public void test5() {
        assertEquals(new BigInteger("10285869476413261192225"), JomoPipi.pipi(5));
    }
}
