package problems.word_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        assertEquals(Solution.exist(board, word), true);
    }

    @Test
    public void test2(){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        assertEquals(Solution.exist(board, word), true);
    }

    @Test
    public void test3(){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        assertEquals(Solution.exist(board, word), false);
    }
}
