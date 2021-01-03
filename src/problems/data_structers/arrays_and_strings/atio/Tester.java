package problems.data_structers.arrays_and_strings.atio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String num = "123";
        assertEquals(Solution.myAtoi(num), 123);
    }

    @Test
    public void test2(){
        String num = "-123";
        assertEquals(Solution.myAtoi(num), -123);
    }

    @Test
    public void test3(){
        String num = "                       45";
        assertEquals(Solution.myAtoi(num), 45);
    }

    @Test
    public void test4(){
        String num = "-200000000000000000";
        assertEquals(Solution.myAtoi(num), Integer.MIN_VALUE);
    }

    @Test
    public void test5(){
        String num = "200000000000000000";
        assertEquals(Solution.myAtoi(num), Integer.MAX_VALUE);
    }
}
