package problems.recursion_and_dynamic_programming.interleaving_string;

public class Solution {

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
