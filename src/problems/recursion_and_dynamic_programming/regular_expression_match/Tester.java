package problems.recursion_and_dynamic_programming.regular_expression_match;

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
        String p = "a*";
        assertTrue(Solution.isMatch(s, p));
    }

    @Test
    public void test3(){
        String s = "ab";
        String p = ".*";
        assertTrue(Solution.isMatch(s, p));
    }

    @Test
    public void test4(){
        String s = "aab";
        String p = "c*a*b";
        assertTrue(Solution.isMatch(s, p));
    }

    @Test
    public void test5(){
        String s = "mississippi";
        String p = "mis*is*p*.";
        assertFalse(Solution.isMatch(s, p));
    }
}
