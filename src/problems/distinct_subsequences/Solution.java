package problems.distinct_subsequences;

public class Solution {

    /**
     * Given two strings s and t, return the number of distinct subsequences of s which equals t.
     * A string's subsequence is a new string formed from the original string by deleting some (can be none) of
     * the characters without disturbing the relative positions of the remaining characters.
     * (i.e., "ACE" is a subsequence of "ABCDE" while "AEC" is not).
     * It's guaranteed the answer fits on a 32-bit signed integer.
     * Constraints:
     * 0 <= s.length, t.length <= 1000
     * s and t consist of English letters.
     */
    public static int numDistinct(String s, String t) {
        if (s == null || s.length() == 0 || t == null){
            return 0;
        }
        int rows = t.length() + 1;
        int cols = s.length() + 1;
        int[][] scores = new int[rows][cols];
        for (int j=0; j<cols; j++){
            scores[0][j] = 1;
        }
        for (int i=1; i<rows; i++){
            for (int j=i; j<cols; j++){
                if (s.charAt(j-1) == t.charAt(i-1)){
                    scores[i][j] = scores[i-1][j-1] + scores[i][j-1];
                }
                else{
                    scores[i][j] = scores[i][j-1];
                }
            }
        }
        return scores[rows-1][cols-1];
    }
}
