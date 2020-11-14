package KataProblems.week3.SplitThenAddBothSidesOfArray;

public class SplitThenAddBothSidesOfArray {
    public static int[] splitAndAdd(int[] numbers, int n) {
        if (n>0 && numbers.length>1){
            boolean equalLengths = (numbers.length%2==0);
            int length = (equalLengths) ? numbers.length/2 : numbers.length/2+1;
            int[] splitSum = new int[length];
            if (!equalLengths){
                splitSum[0]=numbers[numbers.length/2];
                for (int i=1; i<length; i++) {
                    splitSum[i]=numbers[i-1]+numbers[numbers.length/2+i];
                }
            } else {
                for (int i = 0; i < length; i++) {
                    splitSum[i] = numbers[i] + numbers[numbers.length / 2 + i];
                }
            }
            return splitAndAdd(splitSum, n-1);
        } else {
            return numbers;
        }

    }
}
