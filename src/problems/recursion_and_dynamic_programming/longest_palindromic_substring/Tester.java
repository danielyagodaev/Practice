package problems.recursion_and_dynamic_programming.longest_palindromic_substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "abcbd";
        Assertions.assertArrayEquals(Solution.longestPalindrome(s).toCharArray(),
                "bcb".toCharArray());
    }

    @Test
    public void test2(){
        String s = "aa";
        Assertions.assertArrayEquals(Solution.longestPalindrome(s).toCharArray(),
                "aa".toCharArray());
    }

    @Test
    public void test3(){
        String s = "aacabdkacaa";
        Assertions.assertArrayEquals(Solution.longestPalindrome(s).toCharArray(),
                "aca".toCharArray());
    }
}
