package problems.recursion_and_dynamic_programming.wildcard_matching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tester {

    @Test
    public void test1(){
        String s = "aa";
        String p = "a";
        assertFalse(Solution.isMatch(s, p));
    }

    @Test
    public void test2(){
        String s = "aa";
        String p = "*";
        assertTrue(Solution.isMatch(s, p));
    }

    @Test
    public void test3(){
        String s = "cb";
        String p = "?a";
        assertFalse(Solution.isMatch(s, p));
    }

    @Test
    public void test4(){
        String s = "adceb";
        String p = "*a*b";
        assertTrue(Solution.isMatch(s, p));
    }

    @Test
    public void test5(){
        String s = "acdcb";
        String p = "a*c?b";
        assertFalse(Solution.isMatch(s, p));
    }

}
