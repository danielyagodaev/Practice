package problems.data_structers.arrays_and_strings.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, up = 0, right = n-1, down = m-1;
        int i=0, j=0;
        List<Integer> res = new ArrayList<>();
        while (res.size() < n*m){
            for (j=left; j<=right; j++){
                res.add(matrix[i][j]);
            }
            j--;
            up++;
            if (up > down){
                break;
            }
            for (i=up; i<=down; i++){
                res.add(matrix[i][j]);
            }
            i--;
            right--;
            if (left > right){
                break;
            }
            for (j=right; j>=left; j--){
                res.add(matrix[i][j]);
            }
            j++;
            down--;
            for (i=down; i>=up; i--){
                res.add(matrix[i][j]);
            }
            left++;
            i++;
        }
        return res;
    }
}
