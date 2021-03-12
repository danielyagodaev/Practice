package problems.data_structers.arrays_and_strings.maximum_product_subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] nums = {1,2,3};
        assertEquals(6, Solution.maxProduct(nums));
    }

    @Test
    public void test2(){
        int[] nums = {1,2,0,4,5};
        assertEquals(20, Solution.maxProduct(nums));
    }

    @Test
    public void test3(){
        int[] nums = {-4,5,9,-2,-8,12,6};
        assertEquals(51840, Solution.maxProduct(nums));
    }

    @Test
    public void test4(){
        int[] nums = {-1,2,0,4,-2,8,-13,11,-5,0,12,4,-5,-6};
        assertEquals(9152, Solution.maxProduct(nums));
    }

    @Test
    public void test5(){
        int[] nums = {-9,-2,-8,-7,-1,-3,-6,-5,-4};
        assertEquals(90720, Solution.maxProduct(nums));
    }

}
