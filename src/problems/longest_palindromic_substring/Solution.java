package problems.longest_palindromic_substring;

public class Solution {

    /**
     * Given a string s, return the longest palindromic substring in s.
     * Constraints:
     * 1 <= s.length <= 1000
     * s consist of only digits and English letters (lower-case and/or upper-case),
     */
    public static String longestPalindrome(String s) {
        int n = s.length();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            arr[i][i] = 1;
        }
        int startIndex = 0, endIndex = 0;
        for (int i=0; i<n; i++){
            for (int j=n-1; j>i; j--){
                if (isPalindrome(s, i, j, arr)){
                    if (j-i > endIndex - startIndex){
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }
        return s.substring(startIndex, endIndex+1);
    }

    private static boolean isPalindrome(String s, int start, int end, int[][] cache){
        if (cache[start][end] != 0){
            return cache[start][end] == 1;
        }
        boolean res;
        if (start >= end){
            res = true;
        }
        else{
            res = s.charAt(start) == s.charAt(end) &&
                    isPalindrome(s, start+1, end-1, cache);
        }
        cache[start][end] = res ? 1 : -1;
        return res;
    }
}
