package problems.recursion_and_dynamic_programming.largest_component_size_by_common_factor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        int[] nums = {4,6,15,35};
        assertEquals(4, this._s.largestComponentSize(nums));
    }

    @Test
    public void test2(){
        int[] nums = {20,50,9,63};
        assertEquals(2, this._s.largestComponentSize(nums));
    }

    @Test
    public void test3(){
        int[] nums = {2,3,6,7,4,12,21,39};
        assertEquals(8, this._s.largestComponentSize(nums));
    }
}
