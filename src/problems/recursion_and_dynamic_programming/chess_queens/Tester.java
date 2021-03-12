package problems.recursion_and_dynamic_programming.chess_queens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        assertEquals(92, Solution.count(8));
    }

    @Test
    public void test2(){
        assertEquals(1, Solution.count(1));
    }
}
