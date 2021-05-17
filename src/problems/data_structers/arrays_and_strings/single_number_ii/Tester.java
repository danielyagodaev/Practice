package problems.data_structers.arrays_and_strings.single_number_ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        int[] nums = {2,2,3,2};
        assertEquals(3, this._s.singleNumber(nums));
    }

    @Test
    public void test2(){
        int[] nums = {0,1,0,1,0,1,99};
        assertEquals(99, this._s.singleNumber(nums));
    }

    @Test
    public void test3(){
        int[] nums = {-2,-2,1,1,4,1,4,4,-4,-2};
        assertEquals(-4, this._s.singleNumber(nums));
    }
}
