package problems.data_structers.arrays_and_strings.largest_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] nums = {10,2};
        assertEquals(Solution.largestNumber(nums), "210");
    }

    @Test
    public void test2(){
        int[] nums = {3,30,34,5,9};
        assertEquals(Solution.largestNumber(nums), "9534330");
    }

    @Test
    public void test3(){
        int[] nums = {1};
        assertEquals(Solution.largestNumber(nums), "1");
    }

    @Test
    public void test4(){
        int[] nums = {111311, 1113};
        assertEquals(Solution.largestNumber(nums), "1113111311");
    }


}
