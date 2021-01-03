package problems.data_structers.arrays_and_strings.largest_number;

import java.util.Arrays;

public class Solution {

    public static String largestNumber(int[] nums) {
        String[] numsAsStrings = new String[nums.length];
        for (int i=0; i<nums.length; i++){
            numsAsStrings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsAsStrings, Solution::compareNums);
        String firstNumber = numsAsStrings[numsAsStrings.length-1];
        if (firstNumber.charAt(0) == '0'){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i=numsAsStrings.length-1; i>=0; i--){
            sb.append(numsAsStrings[i]);
        }
        return sb.toString();
    }

    private static int compareNums(String num1, String num2){
        String num1AsFirst = num1 + num2;
        String num2AsFirst = num2 + num1;
        return num1AsFirst.compareTo(num2AsFirst);
    }

}
