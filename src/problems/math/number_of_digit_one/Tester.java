package problems.math.number_of_digit_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        assertEquals(6, Solution.countDigitOne(13));
    }

    @Test
    public void test2(){
        assertEquals(0, Solution.countDigitOne(0));
    }

    @Test
    public void test3(){
        assertEquals(1, Solution.countDigitOne(1));
    }

    @Test
    public void test4(){
        assertEquals(40, Solution.countDigitOne(113));
    }

}
