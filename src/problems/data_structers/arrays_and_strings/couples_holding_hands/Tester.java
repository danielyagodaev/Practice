package problems.data_structers.arrays_and_strings.couples_holding_hands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        int[] row = {0, 2, 1, 3};
        assertEquals(1, this._s.minSwapsCouples(row));
    }

    @Test()
    public void test2(){
        int[] row = {3, 2, 0, 1};
        assertEquals(0, this._s.minSwapsCouples(row));
    }

    @Test()
    public void test3(){
        int[] row = {0, 7, 1, 4, 3, 5, 6, 2};
        assertEquals(3, this._s.minSwapsCouples(row));
    }
}
