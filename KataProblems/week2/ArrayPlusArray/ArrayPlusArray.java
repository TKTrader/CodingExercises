package KataProblems.week2.ArrayPlusArray;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return sumArray(arr1) + sumArray(arr2);
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum+=num;
        }
        return sum;
    }
}
