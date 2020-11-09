package KataProblems.week1.NumbersInStrings;

public class NumbersInStrings {
    public static int solve(String s){
        int max = 0;
        int num = 0;
        for (int idx=0; idx<s.length(); idx++){
            if (Character.isDigit(s.charAt(idx))){
                num = num * 10 + Character.getNumericValue(s.charAt(idx));
                max = Math.max(max, num);
            } else {
                num = 0;
            }
        }
        return max;
    }
}
