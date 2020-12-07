package KataProblems.week6.scramblies;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : str1.toCharArray()){
            map.merge(letter, 1 ,Integer::sum);
        }
        for (char c : str2.toCharArray()){
            map.merge(c, -1, Integer::sum);
            if (map.get(c)<0){
                return false;
            }
        }
        return true;
    }
}
