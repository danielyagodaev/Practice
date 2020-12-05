package problems.edit_distance;

public class Solution {

    /**
     * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
     * You have the following three operations permitted on a word:
     * Insert a character
     * Delete a character
     * Replace a character
     */
    public static int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dist = new int[n1+1][n2+1];
        dist[0][0] = 0;
        for (int i=1; i<n1+1; i++){
            dist[i][0] = i;
        }
        for (int j=1; j<n2+1; j++){
            dist[0][j] = j;
        }
        for (int i=1; i<n1+1; i++){
            char c1 = word1.charAt(i-1);
            for (int j=1; j<n2+1; j++){
                char c2 = word2.charAt(j-1);
                if (c1 == c2){
                    dist[i][j] = dist[i-1][j-1];
                }
                else{
                    dist[i][j] = Math.min(dist[i-1][j-1], Math.min(dist[i][j-1], dist[i-1][j])) + 1;
                }
            }
        }
        return dist[n1][n2];
    }
}
