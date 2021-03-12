package problems.recursion_and_dynamic_programming.word_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tester {

    @Test
    public void test1(){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        assertTrue(Solution.exist(board, word));
    }

    @Test
    public void test2(){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        assertTrue(Solution.exist(board, word));
    }

    @Test
    public void test3(){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        assertFalse(Solution.exist(board, word));
    }
}
