package KataProblems.week5.FindIndexOfSubArray;

public class FindIndexOfSubArray {
    private int[] arr;
    public FindIndexOfSubArray(int[] arr) {
        this.arr = arr;
    }

    // compare by windows
    // FAIL: does not account for windows where end value are equal and unordered within
    public int[] findIndexOfSubArray(){
        //implementation here, return the start index m and end index n as array
        int[] ascending = assessAscending(arr);
        int[] descending = assessDescending(arr);
        int[] solution = ascending[1]-ascending[0] < descending[1]-descending[0] ? ascending : descending;
        return solution;
    }

    public int[] assessAscending(int[] arr){
        int[] ascArray = new int[] {0,0};
        int window = arr.length;
        loop:
        while (window>1){
            for (int i = 0; i < arr.length - window + 1; i++) {
                if (arr[i] > arr[i + window - 1]) {
                    ascArray[0] = i;
                    ascArray[1] = i + window - 1;
                    break loop;
                }
            }
            window--;
        }
        return ascArray;
    }

    public int[] assessDescending(int[] arr){
        int[] descArray = new int[] {0,0};
        int window = arr.length;
        loop:
        while (window>1) {
            for (int i = 0; i < arr.length - window + 1; i++) {
                if (arr[i] < arr[i + window - 1]) {
                    descArray[0] = i;
                    descArray[1] = i + window - 1;
                    break loop;
                }
            }
            window--;
        }
        return descArray;
    }
}
