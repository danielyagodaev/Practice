package problems.data_structers.arrays_and_strings.shortest_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "aacecaaa";
        assertEquals("aaacecaaa", Solution.shortestPalindrome(s));
    }

    @Test
    public void test2(){
        String s = "abcd";
        assertEquals("dcbabcd", Solution.shortestPalindrome(s));
    }
}
