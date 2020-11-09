package KataProblems.week2.RowOddTriangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindRowOddTriangleTest {
    @Test
    public void test_1() {
        assertArrayEquals(new long[]{1}, FindRowOddTriangle.oddRow(1));
    }

    @Test
    public void test_2() {
        assertArrayEquals(new long[]{3, 5}, FindRowOddTriangle.oddRow(2));
    }

    @Test
    public void test_13() {
        assertArrayEquals(new long[]{
                157, 159, 161, 163, 165, 167, 169, 171, 173, 175, 177, 179, 181
        }, FindRowOddTriangle.oddRow(13));
    }

    @Test
    public void test_19() {
        assertArrayEquals(new long[]{
                343, 345, 347, 349, 351, 353, 355, 357, 359, 361, 363, 365, 367, 369, 371, 373, 375, 377, 379
        }, FindRowOddTriangle.oddRow(19));
    }

    @Test
    public void test_41() {
        assertArrayEquals(new long[]{
                1641, 1643, 1645, 1647, 1649, 1651, 1653, 1655, 1657, 1659, 1661, 1663, 1665, 1667, 1669,
                1671, 1673, 1675, 1677, 1679, 1681, 1683, 1685, 1687, 1689, 1691, 1693, 1695, 1697, 1699,
                1701, 1703, 1705, 1707, 1709, 1711, 1713, 1715, 1717, 1719, 1721
        }, FindRowOddTriangle.oddRow(41));
    }

    @Test
    public void test_test() {
        long[] solution = FindRowOddTriangle.oddRow(1155000);
        for (long elem : solution) {
            System.out.println(elem);
        }
//    arrays first differed at element [0]; expected:<61742215637263> but was:<2060757263>
    }
}
