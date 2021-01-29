package problems.recursion_and_dynamic_programming.wildcard_matching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "aa";
        String p = "a";
        assertEquals(Solution.isMatch(s, p), false);
    }

    @Test
    public void test2(){
        String s = "aa";
        String p = "*";
        assertEquals(Solution.isMatch(s, p), true);
    }

    @Test
    public void test3(){
        String s = "cb";
        String p = "?a";
        assertEquals(Solution.isMatch(s, p), false);
    }

    @Test
    public void test4(){
        String s = "adceb";
        String p = "*a*b";
        assertEquals(Solution.isMatch(s, p), true);
    }

    @Test
    public void test5(){
        String s = "acdcb";
        String p = "a*c?b";
        assertEquals(Solution.isMatch(s, p), false);
    }

}
