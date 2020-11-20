package KataProblems.week3.ConnectFour;

import org.junit.Test;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ConnectFourTest {
    @Test
    public void firstTest()
    {// Vertical winner : passed
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        ));
        assertEquals("it should return Yellow", "Yellow", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void secondTest()
    {  // DIAGONAL WINNER
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "C_Yellow",
                "E_Red",
                "G_Yellow",
                "B_Red",
                "D_Yellow",
                "B_Red",
                "B_Yellow",
                "G_Red",
                "C_Yellow",
                "C_Red",
                "D_Yellow",
                "F_Red",
                "E_Yellow",
                "A_Red",
                "A_Yellow",
                "G_Red",
                "A_Yellow",
                "F_Red",
                "F_Yellow",
                "D_Red",
                "B_Yellow",
                "E_Red",
                "D_Yellow",
                "A_Red",
                "G_Yellow",
                "D_Red",
                "D_Yellow",
                "C_Red"
        ));
        assertEquals("it should return Yellow", "Yellow", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void thirdTest()
    {  // Horizontal winner: passed
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "A_Yellow",
                "B_Red",
                "B_Yellow",
                "C_Red",
                "G_Yellow",
                "C_Red",
                "C_Yellow",
                "D_Red",
                "G_Yellow",
                "D_Red",
                "G_Yellow",
                "D_Red",
                "F_Yellow",
                "E_Red",
                "D_Yellow"
        ));
        assertEquals("it should return Red", "Red", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void testRightDiagonalLeftBottom()
    {  // Horizontal winner: passed
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "A_Yellow",
                "B_Yellow",
                "B_Yellow",
                "C_Yellow",
                "C_Yellow",
                "C_Yellow",
                "D_Red",
                "D_Yellow",
                "D_Red",
                "D_Yellow"
        ));
        assertEquals("it should return Yellow", "Yellow", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void testRightDiagonalRightTop()
    {  // Horizontal winner: passed
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "D_Red",
                "D_Yellow",
                "D_Red",
                "E_Yellow",
                "E_Red",
                "E_Yellow",
                "E_Red",
                "F_Red",
                "F_Yellow",
                "F_Red",
                "F_Yellow",
                "F_Red",
                "G_Red",
                "G_Red",
                "G_Red",
                "G_Yellow",
                "G_Red",
                "G_Red"
        ));
        assertEquals("it should return Red", "Red", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void testLeftDiagonalLeftTop()
    {  // Horizontal winner: passed
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "D_Red",
                "D_Yellow",
                "D_Red",
                "C_Yellow",
                "C_Red",
                "C_Yellow",
                "C_Red",
                "B_Red",
                "B_Yellow",
                "B_Red",
                "B_Yellow",
                "B_Red",
                "A_Red",
                "A_Red",
                "A_Red",
                "A_Yellow",
                "A_Red",
                "A_Red"
        ));
        assertEquals("it should return Red", "Red", ConnectFour.whoIsWinner(myList));
    }

    @Test
    public void testLefttDiagonalRightBottom()
    {  // Horizontal winner: passed
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "G_Yellow",
                "F_Red",
                "F_Yellow",
                "E_Yellow",
                "E_Yellow",
                "E_Yellow",
                "D_Yellow",
                "D_Yellow",
                "D_Red",
                "D_Yellow"
        ));
        assertEquals("it should return Yellow", "Yellow", ConnectFour.whoIsWinner(myList));
    }
}
