package problems.recursion_and_dynamic_programming.minimum_window_subsequence;

public class Solution {

    public static String minWindow(String s, String t){
        int n = s.length(), m = t.length();
        if (n == 0 || m == 0){
            return "";
        }
        int start = 0, end = -1;
        int[][] startIndexes = new int[n][m];
        for (int i=0; i<n; i++){
            if (s.charAt(i) == t.charAt(0)) {
                startIndexes[i][0] = i;
            }
            else if (i != 0){
                startIndexes[i][0] = startIndexes[i-1][0];
            }
        }
        for (int j=1; j<m; j++){
            startIndexes[0][j] = -1;
        }
        for (int i=1; i<n; i++){
            for (int j=1; j<m; j++){
                if (s.charAt(i) == t.charAt(j)){
                    startIndexes[i][j] = startIndexes[i-1][j-1];
                }
                else{
                    startIndexes[i][j] = startIndexes[i-1][j];
                }
                if (j == m-1 && startIndexes[i][j] != -1){
                    if ((end == -1) || ((i-startIndexes[i][j] < end-start))){
                        start = startIndexes[i][j];
                        end = i;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}
