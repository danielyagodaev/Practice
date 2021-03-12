package problems.data_structers.arrays_and_strings.search_2d_matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tester {

    @Test
    public void test1(){
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 3;
        assertTrue(Solution.searchMatrix(arr, target));
    }

    @Test
    public void test2(){
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 13;
        assertFalse(Solution.searchMatrix(arr, target));
    }

    @Test
    public void test3(){
        int[][] arr = {};
        int target = 0;
        assertFalse(Solution.searchMatrix(arr, target));
    }
}
