package problems.first_missing_positive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] nums = {1,2,0};
        assertEquals(Solution.firstMissingPositive(nums), 3);
    }

    @Test
    public void test2(){
        int[] nums = {3,4,-1,1};
        assertEquals(Solution.firstMissingPositive(nums), 2);
    }

    @Test
    public void test3(){
        int[] nums = {7,8,9,11,12};
        assertEquals(Solution.firstMissingPositive(nums), 1);
    }
}
