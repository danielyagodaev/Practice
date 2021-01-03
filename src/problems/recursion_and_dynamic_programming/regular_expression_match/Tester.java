package problems.recursion_and_dynamic_programming.regular_expression_match;

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
        String p = "a*";
        assertEquals(Solution.isMatch(s, p), true);
    }

    @Test
    public void test3(){
        String s = "ab";
        String p = ".*";
        assertEquals(Solution.isMatch(s, p), true);
    }

    @Test
    public void test4(){
        String s = "aab";
        String p = "c*a*b";
        assertEquals(Solution.isMatch(s, p), true);
    }

    @Test
    public void test5(){
        String s = "mississippi";
        String p = "mis*is*p*.";
        assertEquals(Solution.isMatch(s, p), false);
    }
}
