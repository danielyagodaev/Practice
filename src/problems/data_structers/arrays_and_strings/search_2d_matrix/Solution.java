package problems.data_structers.arrays_and_strings.search_2d_matrix;

public class Solution {

    /**
     * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
     * Integers in each row are sorted from left to right.
     * The first integer of each row is greater than the last integer of the previous row.
     * Constraints:
     * m == matrix.length
     * n == matrix[i].length
     * 0 <= m, n <= 100
     * -10^4 <= matrix[i][j], target <= 10^4
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int start = 0, end = rows * columns - 1;
        while (start <= end){
            int mid = (int) ((start + end) / 2);
            int i = (int) (mid / columns);
            int j = (int) (mid % columns);
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
