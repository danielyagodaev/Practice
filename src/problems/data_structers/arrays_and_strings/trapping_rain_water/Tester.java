package problems.data_structers.arrays_and_strings.trapping_rain_water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, Solution.trap(height));
    }

    @Test
    public void test2(){
        int[] height = {4,2,0,3,2,5};
        assertEquals(9, Solution.trap(height));
    }
}
