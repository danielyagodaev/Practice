package problems.data_structers.arrays_and_strings.longest_consecutive_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] nums = {100,4,200,1,3,2};
        assertEquals(Solution.longestConsecutive(nums), 4);
    }

    @Test
    public void test2(){
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        assertEquals(Solution.longestConsecutive(nums), 9);
    }
}
