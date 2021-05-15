package problems.recursion_and_dynamic_programming.minimum_operations_to_make_a_subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        int[] target = {5,1,3};
        int[] arr = {9,4,2,3,4};
        assertEquals(2, this._s.minOperations(target, arr));
    }

    @Test
    public void test2(){
        int[] target = {6,4,8,1,3,2};
        int[] arr = {4,7,6,2,3,8,6,1};
        assertEquals(3, this._s.minOperations(target, arr));
    }
}
