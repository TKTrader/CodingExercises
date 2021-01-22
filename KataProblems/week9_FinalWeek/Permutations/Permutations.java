package KataProblems.week9_FinalWeek.Permutations;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> singlePermutations(String s) {
        List<String> solution = new ArrayList<>();
        String emptyString = "";
        if (s.length()==0){return new ArrayList<String>();}
        permuteString(emptyString, s, solution);
        return solution;
    }

    public static void permuteString(String firstString, String secondString, List<String> solution){
        for (int i=0; i<secondString.length(); i++){
            String solString = firstString + secondString.charAt(i) + secondString.substring(0,i) + secondString.substring(i+1);
            if (!solution.contains(solString)){
                solution.add(solString);
            }
            permuteString(firstString+secondString.charAt(i),secondString.substring(0,i)+secondString.substring(i+1),solution);
        }
    }
}
