package KataProblems.week8.ValidBraces;

import static org.junit.Assert.*;
import org.junit.Test;

public class BraceCheckerTest {
    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("([]){}{[]}()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }

    @Test
    public void testInvalid2() {
        assertEquals(false, checker.isValid("[()]}{"));
    }

    @Test
    public void testInvalid3() {
        assertEquals(false, checker.isValid("}{"));
    }

    @Test
    public void testInvalid4() {
        assertEquals(false, checker.isValid(")"));
    }
}
