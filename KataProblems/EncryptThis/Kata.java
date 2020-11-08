package KataProblems.EncryptThis;

public class Kata {
    public static String encryptThis(String text) {
        String[] stringList = text.split("\\s+");
        String output = "";
        if(text.length()==0){
            return output;
        }
        for (String input : stringList) {
            String encrypted = encryptWord(input);
            output += encrypted + " ";
        }
        return output.substring(0,output.length()-1);
    }

    public static String encryptWord(String input) {
        int one = (int) input.charAt(0);
        if (input.length()==1){
            return "" + one;
        }
        char two  = input.charAt(1);
        if (input.length()==2){
            return "" + one + two;
        }
        char last = input.charAt(input.length()-1);
        if (input.length()>3){
            String middle = input.substring(2,input.length()-1);
            return "" + one + last + middle + two;
        } else {
            return "" + one + last + two;
        }
    }
}
