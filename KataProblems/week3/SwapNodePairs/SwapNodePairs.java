package KataProblems.week3.SwapNodePairs;

public class SwapNodePairs {
    public static Node swapPairs(Node head) {
        // A,B,C,D,... -> B,A,D,C,...
        if (head==null) {
            return null;
        } else if (head.next==null){
            return head;
        } else {
            Node newHead = head.next;
            if (head.next!=null){
                swapNextPair(head);
            }
            return newHead;
        }
    }

    public static void swapNextPair(Node a){
        // a -> b (a.next) -> b.next -> b.next.next
        // initialize next nodes for swapping
        Node b = a.next;
        if (b!=null){
            if (b.next!=null){
                if (b.next.next!=null){
                    a.next = b.next.next;
                } else {
                    a.next = b.next;
                }
            } else {
                a.next=null;
            }
            Node d = b.next;
            b.next = a;
            if (d!=null){
                swapNextPair(d);
            }
        }
    }
}
