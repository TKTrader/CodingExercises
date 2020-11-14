package KataProblems.week3.JosephusPermutation;

import java.util.ArrayList;
import java.util.List;

// NOT FINISHED -> IN PROGRESS
public class JosephusPermutation {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        // insert items into CircularLinkedList
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        for (T item : items) {
            circularLinkedList.insertNewNode(item);
        }

        // remove items in correct sequence and add to solution
        List<T> solution = new ArrayList<T>();
        Node current = circularLinkedList.head;
        Node next = current.next;
        while (circularLinkedList.head.next!=null){
            for (int i=0; i<k; i++){
                current = current.next;
                next = current.next.next;
            }
//            solution.add(circularLinkedList.removeNode(current, next));
        }
//        solution.add(circularLinkedList.head.value);/
        return solution;
    }

    public static class Node {
        Node next;
        Object value;

        public Node(Object value){
            this.value = value;
        }
    }

    public static class CircularLinkedList {
        Node head=null;
        Node tail=null;

        public void insertNewNode(Object value){
            Node node = new Node(value);
            if (head==null){
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
            node.next = head;
        }

        public Object removeNode(Node current, Node previous){
            previous.next = current.next;
            return current.value;
        }
    }
}
