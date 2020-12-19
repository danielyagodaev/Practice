package problems.max_sub_product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] nums = {1,2,3};
        assertEquals(Solution.maxSubArrayProduct(nums), 6);
    }

    @Test
    public void test2(){
        int[] nums = {1,2,0,4,5};
        assertEquals(Solution.maxSubArrayProduct(nums), 20);
    }

    @Test
    public void test3(){
        int[] nums = {-4,5,9,-2,-8,12,6};
        assertEquals(Solution.maxSubArrayProduct(nums), 51840);
    }

    @Test
    public void test4(){
        int[] nums = {-1,2,0,4,-2,8,-13,11,-5,0,12,4,-5,-6};
        assertEquals(Solution.maxSubArrayProduct(nums), 9152);
    }

    @Test
    public void test5(){
        int[] nums = {-9,-2,-8,-7,-1,-3,-6,-5,-4};
        assertEquals(Solution.maxSubArrayProduct(nums), 90720);
    }

}
