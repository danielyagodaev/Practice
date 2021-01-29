package problems.recursion_and_dynamic_programming.wildcard_matching;

public class Solution {

    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] matchTable = new boolean[n+1][m+1];
        matchTable[0][0] = true;
        for (int i=1; i<=n; i++){
            matchTable[i][0] = false;
        }
        for (int j=1; j<=m; j++){
            matchTable[0][j] = matchTable[0][j-1] && p.charAt(j-1) == '*';
        }
        for (int i=1; i<=n; i++){
            boolean untilNow = false;
            for (int j=1; j<=m; j++){
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    matchTable[i][j] = matchTable[i-1][j-1];
                }
                else if (p.charAt(j-1) == '*'){
                    matchTable[i][j] = matchTable[i][j-1] || matchTable[i-1][j]
                            || matchTable[i-1][j-1];
                }
                else{
                    matchTable[i][j] = false;
                }
                untilNow |= matchTable[i][j];
            }
            if (!untilNow){
                return false;
            }
        }
        return matchTable[n][m];
    }
}
