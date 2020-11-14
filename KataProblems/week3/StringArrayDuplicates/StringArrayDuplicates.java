package KataProblems.week3.StringArrayDuplicates;

public class StringArrayDuplicates {
    public static String[] dup(String[] arr){
        String[] solution = new String[arr.length];
        for (int i=0; i<arr.length; i++){
            if (arr[i].length()<2){
                solution[i] = arr[i];
            } else {
                solution[i]=removeDuplicates(arr[i]);
            }
        }
        return solution;
    }


    public static String removeDuplicates(String string){
        String unique = string.substring(0,1);
        for (int idx=1; idx<string.length(); idx++){
            if (string.charAt(idx-1)!=string.charAt(idx)){
                unique += string.charAt(idx);
            }
        }
        return unique;
    }
}
