package KataProblems.week5.SortTwoArrays;

public class ArraySorter {
    public static int[][] sortTwoArrays(int[] arr1, int[] arr2) {
        int[] sortedArr1 = sortArray(arr1.clone(), arr2.clone());
        int[] sortedArr2 = sortArray(arr2, arr1);
        int[][] solution = {sortedArr1, sortedArr2};
        return solution;
    }

    public static int[] sortArray(int[] sorted, int[] model){
        for (int i=0; i<model.length; i++){
            int minIndex = i;
            for (int j=i+1; j<model.length;j++){
                minIndex = (model[j]<model[minIndex]) ? j : minIndex;
            }
            if (minIndex!=i){
                int modelTemp = model[i];
                model[i]=model[minIndex];
                model[minIndex]=modelTemp;

                int sortedTemp = sorted[i];
                sorted[i]=sorted[minIndex];
                sorted[minIndex]=sortedTemp;
            }
        }
        return sorted;
    }

}
