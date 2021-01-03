package problems.data_structers.arrays_and_strings.longest_substring_without_repetitions;

import java.util.HashSet;

public class Solution {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0 || n == 1){
            return n;
        }
        HashSet<Character> chars = new HashSet<>();
        int currCount = 0, maxCount = 0;
        for (int i=0; i<n; i++){
            char c = s.charAt(i);
            if (chars.contains(c)){
                maxCount = Math.max(maxCount, currCount);
                int j = i-1;
                while (j >= 0 && s.charAt(j) != c){
                    j--;
                }
                int prefix = currCount - (i-j-1);
                for (int k=1; k<prefix; k++){
                    char temp = s.charAt(j-k);
                    if (chars.contains(temp)){
                        chars.remove(temp);
                        currCount--;
                    }
                }
            }
            else{
                chars.add(c);
                currCount++;
            }
        }
        maxCount = Math.max(maxCount, currCount);
        return maxCount;
    }

}
