package problems.data_structers.arrays_and_strings.longest_substring_without_repetitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "abcabcbb";
        assertEquals(3, Solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void test2(){
        String s = "abcdef";
        assertEquals(6, Solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void test3(){
        String s = "ababcabcd";
        assertEquals(4, Solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void test4(){
        String s = "aaaaaaaaaa";
        assertEquals(1, Solution.lengthOfLongestSubstring(s));
    }
}
