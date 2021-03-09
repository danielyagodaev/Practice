package problems.data_structers.arrays_and_strings.simple_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        String s = "1 + 1";
        assertEquals(2, this._s.calculate(s));
    }

    @Test
    public void test2(){
        String s = " 2-1 + 2 ";
        assertEquals(3, this._s.calculate(s));
    }

    @Test
    public void test3(){
        String s = "(1+(4+5+2)-3)+(6+8)";
        assertEquals(23, this._s.calculate(s));
    }
}
