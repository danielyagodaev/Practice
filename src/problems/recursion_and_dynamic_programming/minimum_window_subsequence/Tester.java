package problems.recursion_and_dynamic_programming.minimum_window_subsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    public void test1(){
        String s = "abcdebdde";
        String t = "bde";
        assertEquals("bcde", Solution.minWindow(s, t));
    }

    @Test
    public void test2(){
        String s = "abdecfegabc";
        String t = "abc";
        assertEquals("abc", Solution.minWindow(s, t));
    }

    @Test
    public void test3(){
        String s = "abcdef";
        String t = "fg";
        assertEquals("", Solution.minWindow(s, t));
    }
}
