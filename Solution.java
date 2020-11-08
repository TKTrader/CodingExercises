import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class Solution {
    public int maxSumDivThree(int[] nums) {
        ArrayList<Integer> ones = new ArrayList<Integer>();
        ArrayList<Integer> twos = new ArrayList<Integer>();
//        int sum = nums.stream().mapToInt(x -> x).sum();
        int sum = 0;
//        int sum = list.stream().mapToInt(Integer::intValue).sum();
        for (int num : nums) {  
            sum += num;
            if (num % 3 == 1) {
                ones.add(num);
            } else {
                twos.add(num);
            }
        }
        Collections.sort(ones);
        Collections.sort(twos);


        if (sum == 1 || sum == 2) {
            return 0;
        }
        if (sum % 3 == 0){
            return sum;
        } else if (sum % 3 == 1) {
            int subOnes =0;
            int subTwos = 0;
            if (ones.size()>0){
                subOnes = ones.get(ones.size()-1);
            }
            if (twos.size()>2){
                subTwos = twos.get(twos.size()-1) + twos.get(twos.size()-2);
            }
            sum -= Math.max(subOnes,subTwos);
        } else if (sum % 3 == 2){
            int subOnes = 0;
            int subTwos = 0;
            if (ones.size()>1) {
                subOnes = ones.get(ones.size()-1) + ones.get(ones.size()-2);
            }
            if (twos.size()>0){
                subTwos = twos.get(twos.size()-1);
            }
            sum -= Math.max(subOnes, subTwos);
        }
        return sum;
    }
//    System.out.println(maxSumDivThree([1,1,1]));
}