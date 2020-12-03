package problems.atio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtioTester {

    @Test
    public void test1(){
        String num = "123";
        assertEquals(Atoi.myAtoi(num), 123);
    }

    @Test
    public void test2(){
        String num = "-123";
        assertEquals(Atoi.myAtoi(num), -123);
    }

    @Test
    public void test3(){
        String num = "                       45";
        assertEquals(Atoi.myAtoi(num), 45);
    }

    @Test
    public void test4(){
        String num = "-200000000000000000";
        assertEquals(Atoi.myAtoi(num), Integer.MIN_VALUE);
    }

    @Test
    public void test5(){
        String num = "200000000000000000";
        assertEquals(Atoi.myAtoi(num), Integer.MAX_VALUE);
    }
}
