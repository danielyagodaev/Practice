package problems.interleaving_string;

public class Solution {

    /**
     * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
     * An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such
     * that:
     * s = s1 + s2 + ... + sn
     * t = t1 + t2 + ... + tm
     * |n - m| <= 1
     * The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
     * Note: a + b is the concatenation of strings a and b.
     * Constraints:
     * 0 <= s1.length, s2.length <= 100
     * 0 <= s3.length <= 200
     * s1, s2, and s3 consist of lower-case English letters.
     */
    public static boolean isInterleave(String s1, String s2, String s3) {
        int n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
        if (n3 != n1 + n2){
            return false;
        }
        if (n3 == 0){
            return true;
        }
        boolean[][] canMove = new boolean[n1+1][n2+1];
        for (int i=1; i<n1+1; i++){
            if (s1.charAt(i-1) == s3.charAt(i-1)){
                canMove[i][0] = true;
            }
            else{
                break;
            }
        }
        for (int j=1; j<n2+1; j++){
            if (s2.charAt(j-1) == s3.charAt(j-1)){
                canMove[0][j] = true;
            }
            else{
                break;
            }
        }
        for (int i=1; i<n1+1; i++){
            for (int j=1; j<n2+1; j++){
                boolean fromLeft = canMove[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1);
                boolean fromUp = canMove[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1);
                canMove[i][j] = fromLeft || fromUp;
            }
        }
        return canMove[n1][n2];
    }

}
