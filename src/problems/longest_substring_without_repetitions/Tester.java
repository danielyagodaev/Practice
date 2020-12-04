package problems.longest_substring_without_repetitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "abcabcbb";
        assertEquals(Solution.lengthOfLongestSubstring(s), 3);
    }

    @Test
    public void test2(){
        String s = "abcdef";
        assertEquals(Solution.lengthOfLongestSubstring(s), 6);
    }

    @Test
    public void test3(){
        String s = "ababcabcd";
        assertEquals(Solution.lengthOfLongestSubstring(s), 4);
    }

    @Test
    public void test4(){
        String s = "aaaaaaaaaa";
        assertEquals(Solution.lengthOfLongestSubstring(s), 1);
    }
}
