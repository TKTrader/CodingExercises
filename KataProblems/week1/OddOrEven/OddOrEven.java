package KataProblems.week1.OddOrEven;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        String parity = "even";
        for (int element : array){
            parity = ((parity.equals("even") && element%2==0) || (parity.equals("odd") && element%2==1)) ? "even" : "odd";
        }
        return parity;
    }
}
