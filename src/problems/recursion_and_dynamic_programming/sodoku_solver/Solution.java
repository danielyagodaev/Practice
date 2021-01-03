package problems.recursion_and_dynamic_programming.sodoku_solver;

public class Solution {

    private static final int ROWS_COLUMNS_COUNT = 9;
    private static final int SQUARE_SIZE = 3;
    private static final int ZERO_ASCII_CODE = 48;

    public void solveSudoku(char[][] board) {
        char[][] sol = getSolvedBoardRec(board, 0, 0);
        for (int i=0; i<ROWS_COLUMNS_COUNT; i++){
            for (int j=0; j<ROWS_COLUMNS_COUNT; j++){
                board[i][j] = sol[i][j];
            }
        }
    }

    private char[][] getSolvedBoardRec(char[][] board, int row, int col){
        if (row >= ROWS_COLUMNS_COUNT){
            return board;
        }
        else if (col >= ROWS_COLUMNS_COUNT){
            return getSolvedBoardRec(board, row+1, 0);
        }
        else{
            if (board[row][col] == '.'){
                boolean[] options = getValidOptions(board, row, col);
                char[][] solvedBoard = null;
                for (int i=0; i<ROWS_COLUMNS_COUNT && solvedBoard == null; i++){
                    if (options[i]){
                        char[][] copiedBoard = createCopyOfBoard(board);
                        copiedBoard[row][col] = (char) (i+1+ZERO_ASCII_CODE);
                        solvedBoard = getSolvedBoardRec(copiedBoard, row, col+1);
                    }
                }
                return solvedBoard;
            }
            else{
                return getSolvedBoardRec(board, row, col+1);
            }
        }
    }

    private boolean[] getValidOptions(char[][] board, int row, int col){
        boolean[] options = new boolean[9];
        for (int i=0; i<9; i++){
            options[i] = true;
        }
        for (int i=0; i<ROWS_COLUMNS_COUNT; i++){
            if (i == row){
                continue;
            }
            checkForRestriction(board, i, col, options);
        }
        for (int j=0; j<ROWS_COLUMNS_COUNT; j++){
            if (j == col){
                continue;
            }
            checkForRestriction(board, row, j, options);
        }
        int squareStartingRow = row - (row % SQUARE_SIZE);
        int squareStartingCol = col - (col % SQUARE_SIZE);
        for (int i=squareStartingRow; i<squareStartingRow+SQUARE_SIZE; i++){
            if (i == col){
                continue;
            }
            for (int j=squareStartingCol; j<squareStartingCol+SQUARE_SIZE; j++){
                if (j == col){
                    continue;
                }
                checkForRestriction(board, i, j, options);
            }
        }
        return options;
    }

    private void checkForRestriction(char[][] board, int row, int col, boolean[] options){
        if (board[row][col] != '.'){
            int val = board[row][col] - ZERO_ASCII_CODE;
            if (options[val-1]){
                options[val-1] = false;
            }
        }
    }

    private char[][] createCopyOfBoard(char[][] board){
        char[][] copiedBoard = new char[ROWS_COLUMNS_COUNT][ROWS_COLUMNS_COUNT];
        for (int i=0; i<ROWS_COLUMNS_COUNT; i++){
            for (int j=0; j<ROWS_COLUMNS_COUNT; j++){
                copiedBoard[i][j] = board[i][j];
            }
        }
        return copiedBoard;
    }

    public void printBoard(char[][] board){
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
