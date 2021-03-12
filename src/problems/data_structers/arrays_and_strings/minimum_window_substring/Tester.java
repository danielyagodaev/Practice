package problems.data_structers.arrays_and_strings.minimum_window_substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", Solution.minWindow(s, t));
    }

    @Test
    public void test2(){
        String s = "a";
        String t = "a";
        assertEquals("a", Solution.minWindow(s, t));
    }

    @Test
    public void test3(){
        String s = "ADEBCA";
        String t = "ABC";
        assertEquals("BCA", Solution.minWindow(s, t));
    }
}
