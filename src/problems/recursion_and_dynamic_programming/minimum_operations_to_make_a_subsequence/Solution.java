package problems.recursion_and_dynamic_programming.minimum_operations_to_make_a_subsequence;

import java.util.Arrays;

public class Solution {

    public int minOperations(int[] target, int[] arr) {
        int n = target.length;
        int m = arr.length;
        int[] prevRow = new int[m+1];
        int[] currRow = new int[m+1];
        for (int i=1; i<n+1; i++){
            System.arraycopy(currRow, 0, prevRow, 0, m+1);
            Arrays.fill(currRow, 0);
            for (int j=1; j<m+1; j++){
                int bestOption = Math.max(prevRow[j], currRow[j-1]);
                if (target[i-1] == arr[j-1]){
                    currRow[j] = Math.max(prevRow[j-1] + 1, bestOption);
                }
                else{
                    currRow[j] = bestOption;
                }
            }
        }
        return n - currRow[m];
    }
}
