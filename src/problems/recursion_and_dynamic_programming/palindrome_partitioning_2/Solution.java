package problems.recursion_and_dynamic_programming.palindrome_partitioning_2;

public class Solution {

    public int minCut(String s) {
        int n = s.length();
        int[][] minCuts = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                minCuts[i][j] = -1;
            }
        }
        return countMinCutsRec(s, 0, s.length()-1, minCuts);
    }

    private int countMinCutsRec(String s, int start, int end, int[][] minCuts){
        if (minCuts[start][end] != -1){
            return minCuts[start][end];
        }
        if (isPalindrome(s, start, end)){
            return 0;
        }
        int res = s.length()-1;
        for (int i=start; i<end; i++){
            if (isPalindrome(s, start, i)){
                int rest = countMinCutsRec(s, i+1, end, minCuts);
                res = Math.min(res, 1+rest);
            }
        }
        minCuts[start][end] = res;
        return res;
    }

    private boolean isPalindrome(String s, int start, int end) {
        if (s.length() <= 1 || start >= end){
            return true;
        }
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
