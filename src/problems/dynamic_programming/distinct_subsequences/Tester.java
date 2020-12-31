package problems.dynamic_programming.distinct_subsequences;

import org.junit.jupiter.api.Test;
import problems.dynamic_programming.distinct_subsequences.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s = "rabbbit";
        String t = "rabbit";
        assertEquals(Solution.numDistinct(s, t), 3);
    }

    @Test
    public void test2(){
        String s = "babgbag";
        String t = "bag";
        assertEquals(Solution.numDistinct(s, t), 5);
    }
}
