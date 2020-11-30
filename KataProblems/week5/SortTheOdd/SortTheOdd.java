package KataProblems.week5.SortTheOdd;

import java.util.PriorityQueue;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        PriorityQueue<Integer> values = new PriorityQueue();
        PriorityQueue<Integer> indices = new PriorityQueue();
        for (int i=0; i<array.length; i++){
            if (array[i]%2!=0){
                values.add(array[i]);
                indices.add(i);
            }
        }
        while (!values.isEmpty()){
            array[indices.poll()] = values.poll();
        }
        return array;
    }
}
