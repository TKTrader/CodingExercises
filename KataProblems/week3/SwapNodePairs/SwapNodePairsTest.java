package KataProblems.week3.SwapNodePairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodePairsTest {
    @Test
    public void basicTest1() {
        executeTest(null, SwapNodePairs.swapPairs(null));
    }

    @Test
    public void basicTest2() {
        executeTest(new ListBuilder().withValue("A").build(), new ListBuilder().withValue("A").build());
    }

    @Test
    public void basicTest3() {
        executeTest(new ListBuilder().withValue("B").withValue("A").withValue("D").withValue("C").build(), new ListBuilder().withValue("A").withValue("B").withValue("C").withValue("D").build());
    }

    @Test
    public void basicTest4() {
        executeTest(new ListBuilder().withValue("B").withValue("A").withValue("D").withValue("C").withValue("E").build(), new ListBuilder().withValue("A").withValue("B").withValue("C").withValue("D").withValue("E").build());
    }


    // use this to build your own tests
    private class ListBuilder {
        private Node head = null, last = null;

        public ListBuilder withValue(String value) {
            if (head == null) {
                head = new Node(value);
                last = head;
            } else {
                last.next = new Node(value);
                last = last.next;
            }
            return this;
        }

        public Node build() {
            return head;
        }
    }

    private static void executeTest(Node input, Node expectedResult) {
        Node output = SwapNodePairs.swapPairs(input);
        if (expectedResult == null) {
            assertNull(output);
            return;
        }

        final String expected = expectedResult.printList();
        final String actual = output.printList();
        final String errMsg = "Expected '" + expected;
        assertEquals(errMsg, expected, actual);
    }
}
