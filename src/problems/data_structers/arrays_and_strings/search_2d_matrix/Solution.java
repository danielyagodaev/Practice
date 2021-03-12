package problems.data_structers.arrays_and_strings.search_2d_matrix;

public class Solution {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int start = 0, end = rows * columns - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            int i = mid / columns;
            int j = mid % columns;
            int val = matrix[i][j];
            if (val == target){
                return true;
            }
            else if (val > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
