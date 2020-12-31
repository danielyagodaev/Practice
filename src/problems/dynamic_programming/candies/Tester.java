package problems.dynamic_programming.candies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] ratings = {1,0,2};
        assertEquals(Solution.candy(ratings), 5);
    }

    @Test
    public void test2(){
        int[] ratings = {1,2,2};
        assertEquals(Solution.candy(ratings), 4);
    }
}
