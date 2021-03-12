package problems.recursion_and_dynamic_programming.candies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] ratings = {1,0,2};
        assertEquals(5, Solution.candy(ratings));
    }

    @Test
    public void test2(){
        int[] ratings = {1,2,2};
        assertEquals(4, Solution.candy(ratings));
    }
}
