package problems.data_structers.arrays_and_strings.three_sum;

import org.junit.jupiter.api.Test;
import problems.utils.Functions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private void runTest(int[] nums, int[][] expected){
        List<List<Integer>> res = Solution.threeSum(nums);
        List<List<Integer>> expectedAsList = Functions.createListFrom2DArray(expected);
        assertEquals(expectedAsList, res);
    }

    @Test
    public void test1(){
        int[] nums = {-1,0,1,2,-1,-4};
        int[][] expected = {{-1,-1,2},{-1,0,1}};
        runTest(nums, expected);
    }

    @Test
    public void test2(){
        int[] nums = {};
        int[][] expected = {};
        runTest(nums, expected);
    }

    @Test
    public void test3(){
        int[] nums = {0};
        int[][] expected = {};
        runTest(nums, expected);
    }
}
