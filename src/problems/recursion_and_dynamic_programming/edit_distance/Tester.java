package problems.recursion_and_dynamic_programming.edit_distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        String s1 = "horse";
        String s2 = "ros";
        assertEquals(3, Solution.minDistance(s1, s2));
    }

    @Test
    public void test2(){
        String s1 = "intention";
        String s2 = "execution";
        assertEquals(5, Solution.minDistance(s1, s2));
    }
}
