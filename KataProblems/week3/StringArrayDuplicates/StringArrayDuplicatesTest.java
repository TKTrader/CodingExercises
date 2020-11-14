package KataProblems.week3.StringArrayDuplicates;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class StringArrayDuplicatesTest {
    @Test
    public void basicTests(){
        assertArrayEquals(new String[]{"codewars","picaniny","hubububo"},StringArrayDuplicates.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra","alote","asese"},StringArrayDuplicates.dup(new String[]{"abracadabra","allottee","assessee"}));
        assertArrayEquals(new String[]{"keles","kenes"},StringArrayDuplicates.dup(new String[]{"kelless","keenness"}));
    }

    @Test
    public void newTest(){
        assertArrayEquals(new String[]{"ke","","k"},StringArrayDuplicates.dup(new String[]{"ke","","kkkkk"}));
    }
}
