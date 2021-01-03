package KataProblems.week5.SortTwoArrays;

public class ArraySorter {
    public static int[][] sortTwoArrays(int[] arr1, int[] arr2) {
        int[] sortedArr1 = sortArray(arr1.clone(), arr2.clone());
        int[] sortedArr2 = sortArray(arr2, arr1);
        int[][] solution = {sortedArr1, sortedArr2};
        System.out.println("Arr1");
        for (int x : arr1){
            System.out.print(x+" ");
        }
        System.out.println("\nArr2");
        for (int y : arr2){
            System.out.print(y+" ");
        }
        System.out.println("\nSolutions:");
        for (int[] array : solution){
            for (int element : array){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println();
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

//    public static int[] sortArray(int[] arrayToBeSorted, int[] modelArray){
//        int[] indices = new int[modelArray.length];
//        for (int i=0; i<modelArray.length; i++){
//            int minIdx = i;
//            for (int j=i+1; j<modelArray.length; j++){
//                minIdx = (modelArray[j]<modelArray[minIdx]) ? j : minIdx;
//            }
//            int modelTemp = modelArray[i];
//            modelArray[i] = modelArray[minIdx];
//            modelArray[minIdx] = modelTemp;
//            indices[i]=minIdx;
//        }
//        int[] sortedArray = new int[arrayToBeSorted.length];
//        for (int k=0; k<sortedArray.length; k++){
//            sortedArray[k]=modelArray[k];
//        }
//        return sortedArray;
//    }

}
