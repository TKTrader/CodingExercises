package KataProblems.Capitalization;

public class Capitalization {
    public static String[] capitalize(String s){
        String lower = s.toLowerCase();
        String upper = s.toUpperCase();
        String initialString = "";
        String finalString = "";
        int index = 0;
        while (index<s.length()){
            // even index
            if (index%2 == 0){
                initialString += upper.charAt(index);
                finalString += lower.charAt(index);
            } else {
                initialString += lower.charAt(index);
                finalString += upper.charAt(index);
            }
            index++;
        }
        String[] solution = new String[2];
        solution[0] = initialString;
        solution[1] = finalString;
        return solution;
    }
}
