package problems.dynamic_programming.interleaving_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        assertEquals(Solution.isInterleave(s1, s2, s3), true);
    }

    @Test
    public void test2(){
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        assertEquals(Solution.isInterleave(s1, s2, s3), false);
    }

    @Test
    public void test3(){
        String s1 = "";
        String s2 = "";
        String s3 = "";
        assertEquals(Solution.isInterleave(s1, s2, s3), true);
    }
}
