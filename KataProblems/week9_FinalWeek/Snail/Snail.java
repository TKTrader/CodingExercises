package KataProblems.week9_FinalWeek.Snail;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    public static int[] snail(int[][] array) {
        if (array==null || array.length==0 ){return new int[0];}
        int dim = array.length;
        int[] solution = new int[dim*dim];
        List<Integer> solutionList = new ArrayList<>();
        int buffer = 0;
        while (solutionList.size()<dim*dim) {
            for (int i=buffer; i<dim-buffer; i++){
                solutionList.add(array[buffer][i]);
            }
            for (int j=1+buffer; j<dim-1-buffer; j++){
                solutionList.add(array[j][dim-1-buffer]);
            }
            for (int k=dim-1-buffer; k>=buffer; k--){
                solutionList.add(array[dim-1-buffer][k]);
            }
            for (int l=dim-2-buffer; l>buffer; l--){

                solutionList.add(array[l][buffer]);
            }
            buffer++;
        }
        if (dim%2==1){
            solutionList.remove(solutionList.size()-1);
        }
        int[] arr = solutionList.stream().mapToInt(i -> i).toArray();
        for (int x : arr){
            System.out.print(x+ " ");
        }
        return arr;
    }


}
