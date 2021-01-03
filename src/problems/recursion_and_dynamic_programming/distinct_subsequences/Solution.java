package problems.recursion_and_dynamic_programming.distinct_subsequences;

public class Solution {

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
