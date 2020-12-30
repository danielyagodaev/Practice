package problems.word_search;

public class Solution {

    /**
     * Given an m x n board and a word, find if the word exists in the grid.
     * The word can be constructed from letters of sequentially adjacent cells, where "adjacent" cells are horizontally
     * or vertically neighboring. The same letter cell may not be used more than once.
     * Constraints:
     * m == board.length
     * n = board[i].length
     * 1 <= m, n <= 200
     * 1 <= word.length <= 10^3
     * board and word consists only of lowercase and uppercase English letters.
     */
    public static boolean exist(char[][] board, String word) {
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                if (existRec(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean existRec(char[][] board, int row, int col, String word, int p){
        if (p >= word.length()){
            return true;
        }
        else if (row < 0 || row >= board.length || col < 0 || col >= board[row].length){
            return false;
        }
        else{
            if (board[row][col] == word.charAt(p)){
                char[][] copiedBoard = createCopyOfBoard(board);
                copiedBoard[row][col] = 0;
                return (existRec(copiedBoard, row+1, col, word, p+1) ||
                        existRec(copiedBoard, row-1, col, word, p+1) ||
                        existRec(copiedBoard, row, col+1, word, p+1) ||
                        existRec(copiedBoard, row, col-1, word, p+1));
            }
            else{
                return false;
            }
        }
    }

    private static char[][] createCopyOfBoard(char[][] board){
        int rows = board.length;
        int cols = board[0].length;
        char[][] copiedBoard = new char[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                copiedBoard[i][j] = board[i][j];
            }
        }
        return copiedBoard;
    }
}
