package KataProblems.week1.Capitalization;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class CapitalizationTest {
    Capitalization capitalization = new Capitalization();

    @Test
    public void basicTest1() {
        assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, capitalization.capitalize("abcdef"));
    }
    @Test
    public void basicTest2() {
        assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, capitalization.capitalize("codewars"));
    }

    @Test
    public void basicTest3() {
        assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, capitalization.capitalize("abracadabra"));
    }

    @Test
    public void basicTest4() {
        assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, capitalization.capitalize("codewarriors"));
    }

    @Test
    public void basicTest5() {
        assertArrayEquals(new String[]{"", ""}, capitalization.capitalize(""));
    }

    @Test
    public void basicTest6() {
        assertArrayEquals(new String[]{"A", "a"}, capitalization.capitalize("a"));
    }
}
