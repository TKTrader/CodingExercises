package KataProblems.week6.stocklist;

import java.util.HashMap;
import java.util.Map;

public class StockList {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // parse strings to create map of values
        if (lstOfArt.length==0 || lstOf1stLetter.length==0){
            return "";
        }
        Map<String, Integer> map = new HashMap<>();
        for (String entry : lstOfArt){
            String[] keyValue = entry.split(" ");
            map.merge(keyValue[0].substring(0,1),Integer.parseInt(keyValue[1]), Integer::sum);
        }
        // save in String form to match list of categories
        String output = "";
        for (int i=0; i<lstOf1stLetter.length; i++){
            String category = lstOf1stLetter[i];
            Integer value = 0;
            if (map.containsKey(category)){
                value = map.get(category);
            }
            output = output.concat("(").concat(category).concat(" : ").concat(value.toString()).concat(")");
            if (i<lstOf1stLetter.length-1){
                output = output.concat(" - ");
            }
        }
        return output;
    }
}
