package problems.data_structers.arrays_and_strings.insert_intervals;

import org.junit.jupiter.api.Test;
import problems.utils.Functions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private void runTest(int[][] intervals, int[] newInterval, int[][] expected){
        List<List<Integer>> expectedAsList = Functions.createListFrom2DArray(expected);
        int[][] res = Solution.insert(intervals, newInterval);
        List<List<Integer>> resAsList = Functions.createListFrom2DArray(res);
        assertEquals(expectedAsList, resAsList);
    }

    @Test
    public void test1(){
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] expected = {{1,5},{6,9}};
        runTest(intervals, newInterval, expected);
    }

    @Test
    public void test2(){
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] expected = {{1,2},{3,10},{12,16}};
        runTest(intervals, newInterval, expected);
    }

    @Test
    public void test3(){
        int[][] intervals = {};
        int[] newInterval = {5,7};
        int[][] expected = {{5,7}};
        runTest(intervals, newInterval, expected);
    }

    @Test
    public void test4(){
        int[][] intervals = {{1,5}};
        int[] newInterval = {2,3};
        int[][] expected = {{1,5}};
        runTest(intervals, newInterval, expected);
    }

    @Test
    public void test5(){
        int[][] intervals = {{1,5}};
        int[] newInterval = {2,7};
        int[][] expected = {{1,7}};
        runTest(intervals, newInterval, expected);
    }
}
