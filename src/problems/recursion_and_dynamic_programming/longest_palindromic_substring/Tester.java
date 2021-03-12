package problems.recursion_and_dynamic_programming.longest_palindromic_substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "abcbd";
        assertEquals("bcb", Solution.longestPalindrome(s));
    }

    @Test
    public void test2(){
        String s = "aa";
        assertEquals("aa", Solution.longestPalindrome(s));
    }

    @Test
    public void test3(){
        String s = "aacabdkacaa";
        assertEquals("aca", Solution.longestPalindrome(s));
    }
}
