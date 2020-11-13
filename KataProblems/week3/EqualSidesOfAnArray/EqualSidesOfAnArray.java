package KataProblems.week3.EqualSidesOfAnArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int sum = 0;
        for (int e = 1; e<arr.length; e++) {
            sum += arr[e];
        }
        if (sum==0){
            return 0;
        }
        int firstSum = 0;
        int idx = 0;
        boolean solutionFound = false;
        while(!solutionFound && idx<arr.length-1){
            idx++;
            sum-=arr[idx];
            firstSum+=arr[idx-1];
            solutionFound = (sum == firstSum);
        }
        if (!solutionFound && idx==arr.length-1){
            idx=-1;
        }
        return idx;

    }
}
