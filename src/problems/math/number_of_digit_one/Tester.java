package problems.math.number_of_digit_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        assertEquals(Solution.countDigitOne(13), 6);
    }

    @Test
    public void test2(){
        assertEquals(Solution.countDigitOne(0), 0);
    }

    @Test
    public void test3(){
        assertEquals(Solution.countDigitOne(1), 1);
    }

    @Test void test4(){
        assertEquals(Solution.countDigitOne(113), 40);
    }

}
