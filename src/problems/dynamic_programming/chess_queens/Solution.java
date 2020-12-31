package problems.dynamic_programming.chess_queens;

public class Solution {

    public static int count(int n){
        boolean[][] board = createEmptyBoard(n);
        return countRec(board, 0);
    }

    private static int countRec(boolean[][] board, int row){
        if (row >= board.length){
            return 1;
        }
        else{
            int count = 0;
            for (int col=0; col<board.length; col++){
                if (!board[row][col]){
                    boolean[][] copyOfBoard = createCopyOfBoard(board);
                    putQueen(copyOfBoard, row, col);
                    count += countRec(copyOfBoard, row+1);
                }
            }
            return count;
        }
    }

    private static boolean[][] createEmptyBoard(int n){
        boolean[][] res = new boolean[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                res[i][j] = false;
            }
        }
        return res;
    }

    private static boolean[][] createCopyOfBoard(boolean[][] board){
        boolean[][] copyBoard = createEmptyBoard(board.length);
        for (int i=0; i<board.length; i++){
            System.arraycopy(board[i], 0, copyBoard[i], 0, board[i].length);
        }
        return copyBoard;
    }

    private static void putQueen(boolean[][] board, int i, int j){
        int n = board.length;
        int row, column, delta;
        for (row = 0; row<n; row++){
            board[row][j] = true;
        }
        for (column = 0; column<n; column++){
            board[i][column] = true;
        }
        for (row = i-1, delta=1; row>=0; row--, delta++){
            if (j+delta < n) {
                board[row][j + delta] = true;
            }
            if (j-delta >= 0) {
                board[row][j - delta] = true;
            }
        }
        for (row = i+1, delta=1; row<n; row++, delta++){
            if (j+delta < n) {
                board[row][j + delta] = true;
            }
            if (j-delta >= 0) {
                board[row][j - delta] = true;
            }
        }
    }
}
