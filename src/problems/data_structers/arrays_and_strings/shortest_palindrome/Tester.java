package problems.data_structers.arrays_and_strings.shortest_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "aacecaaa";
        assertEquals(Solution.shortestPalindrome(s), "aaacecaaa");
    }

    @Test
    public void test2(){
        String s = "abcd";
        assertEquals(Solution.shortestPalindrome(s), "dcbabcd");
    }
}
