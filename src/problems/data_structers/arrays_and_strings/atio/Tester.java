package problems.data_structers.arrays_and_strings.atio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String num = "123";
        assertEquals(123, Solution.myAtoi(num));
    }

    @Test
    public void test2(){
        String num = "-123";
        assertEquals(-123, Solution.myAtoi(num));
    }

    @Test
    public void test3(){
        String num = "                       45";
        assertEquals(45, Solution.myAtoi(num));
    }

    @Test
    public void test4(){
        String num = "-200000000000000000";
        assertEquals(Integer.MIN_VALUE, Solution.myAtoi(num));
    }

    @Test
    public void test5(){
        String num = "200000000000000000";
        assertEquals(Integer.MAX_VALUE, Solution.myAtoi(num));
    }
}
