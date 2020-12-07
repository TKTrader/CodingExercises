package KataProblems.week6.stocklist;

import static org.junit.Assert.*;
import org.junit.Test;

public class  StockListTest {
    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                StockList.stockSummary(art, cd));
    }

    @Test
    public void test2() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B", "W"};
        assertEquals("(A : 200) - (B : 1140) - (W : 0)",
                StockList.stockSummary(art, cd));
    }
    @Test
    public void empty1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {};
        assertEquals("",
                StockList.stockSummary(art, cd));
    }
    @Test
    public void empty2() {
        String art[] = new String[]{};
        String cd[] = new String[] {"A", "B"};
        assertEquals("",
                StockList.stockSummary(art, cd));
    }
}
