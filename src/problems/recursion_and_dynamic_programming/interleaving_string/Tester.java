package problems.recursion_and_dynamic_programming.interleaving_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tester {

    @Test
    public void test1(){
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        assertTrue(Solution.isInterleave(s1, s2, s3));
    }

    @Test
    public void test2(){
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        assertFalse(Solution.isInterleave(s1, s2, s3));
    }

    @Test
    public void test3(){
        String s1 = "";
        String s2 = "";
        String s3 = "";
        assertTrue(Solution.isInterleave(s1, s2, s3));
    }
}
