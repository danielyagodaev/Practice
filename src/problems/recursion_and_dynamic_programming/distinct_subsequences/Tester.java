package problems.recursion_and_dynamic_programming.distinct_subsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "rabbbit";
        String t = "rabbit";
        assertEquals(3, Solution.numDistinct(s, t));
    }

    @Test
    public void test2(){
        String s = "babgbag";
        String t = "bag";
        assertEquals(5, Solution.numDistinct(s, t));
    }
}
