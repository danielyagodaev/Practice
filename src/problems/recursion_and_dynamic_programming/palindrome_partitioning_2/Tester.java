package problems.recursion_and_dynamic_programming.palindrome_partitioning_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        _s = new Solution();
    }

    @Test
    public void test1(){
        assertEquals(1, this._s.minCut("aab"));
    }

    @Test
    public void test2(){
        assertEquals(0, this._s.minCut("a"));
    }

    @Test
    public void test3(){
        assertEquals(1, this._s.minCut("ab"));
    }

    @Test
    public void test4(){
        assertEquals(2, this._s.minCut("abbaabbabbba"));
    }
}
