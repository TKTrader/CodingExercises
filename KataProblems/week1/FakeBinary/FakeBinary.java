package KataProblems.week1.FakeBinary;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String solution = "";
        for (char x : numberString.toCharArray()){
            if (Character.getNumericValue(x)<5){
                solution += "0";
            } else {
                solution += "1";
            }
        }
        return solution;
    }
}
