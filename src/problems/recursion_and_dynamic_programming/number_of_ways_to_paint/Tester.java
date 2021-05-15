package problems.recursion_and_dynamic_programming.number_of_ways_to_paint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        assertEquals(12, this._s.numOfWays(1));
    }

    @Test
    public void test2(){
        assertEquals(54, this._s.numOfWays(2));
    }

    @Test
    public void test3(){
        assertEquals(246, this._s.numOfWays(3));
    }

    @Test
    public void test4(){
        assertEquals(106494, this._s.numOfWays(7));
    }
}
