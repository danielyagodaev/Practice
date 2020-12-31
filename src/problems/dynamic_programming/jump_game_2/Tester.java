package problems.dynamic_programming.jump_game_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] nums = {2,3,1,1,4};
        assertEquals(Solution.jump(nums), 2);
    }

    @Test
    public void test2(){
        int[] nums = {2,3,0,1,4};
        assertEquals(Solution.jump(nums), 2);
    }
}
