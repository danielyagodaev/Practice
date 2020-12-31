package problems.dynamic_programming.chess_queens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        assertEquals(Solution.count(8), 92);
    }

    @Test
    public void test2(){
        assertEquals(Solution.count(1), 1);
    }
}
