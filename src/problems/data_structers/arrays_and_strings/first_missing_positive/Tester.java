package problems.data_structers.arrays_and_strings.first_missing_positive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] nums = {1,2,0};
        assertEquals(3, Solution.firstMissingPositive(nums));
    }

    @Test
    public void test2(){
        int[] nums = {3,4,-1,1};
        assertEquals(2, Solution.firstMissingPositive(nums));
    }

    @Test
    public void test3(){
        int[] nums = {7,8,9,11,12};
        assertEquals(1, Solution.firstMissingPositive(nums));
    }
}
