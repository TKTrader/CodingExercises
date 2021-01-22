package KataProblems.week9_FinalWeek.Permutations;

import org.junit.Test;
import org.junit.runners.JUnit4;
import java.util.*;
import java.util.stream.*;

import static org.junit.Assert.assertEquals;

public class PermutationsTest {
    @Test
    public void example1() {
        assertEquals( new ArrayList<String>(Arrays.asList("a")),
                Permutations.singlePermutations("a").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example2() {
        assertEquals( new ArrayList<String>(Arrays.asList("ab","ba")),
                Permutations.singlePermutations("ab").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example3() {
        assertEquals( new ArrayList<String>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example4() {
        assertEquals( new ArrayList<String>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")),
                Permutations.singlePermutations("abc").stream().sorted().collect(Collectors.toList()) );
    }

    @Test public void example5() {
        assertEquals( new ArrayList<String>(Arrays.asList("aaa")),
                Permutations.singlePermutations("aaa").stream().sorted().collect(Collectors.toList()) );
    }

//    @Test public void example6() {
//        assertEquals( new ArrayList<String>(Arrays.asList("")),
//                Permutations.singlePermutations("").stream().sorted().collect(Collectors.toList()) );
//    }
}
