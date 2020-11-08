package KataProblems.EncryptThis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void exampleTest1() {
        assertEquals("", Kata.encryptThis(""));
    }

    @Test
    public void exampleTest2() {
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", Kata.encryptThis("A wise old owl lived in an oak"));
    }

    @Test
    public void exampleTest3() {
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", Kata.encryptThis("The more he saw the less he spoke"));
    }

    @Test
    public void exampleTest4() {
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", Kata.encryptThis("The less he spoke the more he heard"));
    }

    @Test
    public void exampleTest5() {
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", Kata.encryptThis("Why can we not all be like that wise old bird"));
    }

    @Test
    public void exampleTest6() {
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", Kata.encryptThis("Thank you Piotr for all your help"));
    }

    @Test
    public void exampleTest7() {
        assertEquals("84h", Kata.encryptThis("Th"));
    }

}
