package problems.data_structers.arrays_and_strings.largest_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] nums = {10,2};
        assertEquals("210", Solution.largestNumber(nums));
    }

    @Test
    public void test2(){
        int[] nums = {3,30,34,5,9};
        assertEquals("9534330", Solution.largestNumber(nums));
    }

    @Test
    public void test3(){
        int[] nums = {1};
        assertEquals("1", Solution.largestNumber(nums));
    }

    @Test
    public void test4(){
        int[] nums = {111311, 1113};
        assertEquals("1113111311", Solution.largestNumber(nums));
    }

}
