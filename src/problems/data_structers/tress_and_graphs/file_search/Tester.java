package problems.data_structers.tress_and_graphs.file_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    private final Solution _s;

    public Tester(){
        this._s = new Solution();
    }

    @Test
    public void test1(){
        int A = 4;
        int[][] B = {{1, 2}, {3, 4}};
        assertEquals(2, this._s.breakRecords(A, B));
    }

    @Test
    public void test2(){
        int A = 4;
        int[][] B = {{1, 2}, {3, 4}, {2, 4}};
        assertEquals(1, this._s.breakRecords(A, B));
    }

    @Test
    public void test3(){
        int A = 10;
        int[][] B = {{5, 6}, {10, 8}, {10, 6}, {7, 2}, {7, 3}, {8, 6}, {10, 9}, {3, 2}};
        assertEquals(4, this._s.breakRecords(A, B));
    }
}
