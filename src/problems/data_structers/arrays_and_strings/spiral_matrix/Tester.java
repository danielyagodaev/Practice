package problems.data_structers.arrays_and_strings.spiral_matrix;

import org.junit.jupiter.api.Test;
import problems.utils.Functions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    private void runTest(int[][] matrix, int[] expected){
        List<Integer> expectedAsList = Functions.createListFromArray(expected);
        List<Integer> resAsList = this._s.spiralOrder(matrix);
        assertEquals(expectedAsList, resAsList);
    }

    @Test
    public void test1(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] expected = {1,2,3,6,9,8,7,4,5};
        runTest(matrix, expected);
    }

    @Test
    public void test2(){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] expected = {1,2,3,4,8,12,11,10,9,5,6,7};
        runTest(matrix, expected);
    }

    @Test
    public void test3(){
        int[][] matrix = {{1},{2},{3}};
        int[] expected = {1,2,3};
        runTest(matrix, expected);
    }
}
