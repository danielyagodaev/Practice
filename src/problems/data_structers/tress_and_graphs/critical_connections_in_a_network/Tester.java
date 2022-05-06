package problems.data_structers.tress_and_graphs.critical_connections_in_a_network;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static problems.utils.Functions.createListFrom2DArray;

public class Tester {

    private void runTest(int n, int[][] connections, int[][] expected) {
        List<List<Integer>> connectionsAsList = createListFrom2DArray(connections);
        List<List<Integer>> res = Solution.criticalConnections(n, connectionsAsList);
        List<List<Integer>> expectedAsList = createListFrom2DArray(expected);
        assertEquals(expectedAsList, res);
    }

    @Test
    public void test1(){
        int n = 4;
        int[][] connections = {{0,1},{1,2},{2,0},{1,3}};
        int[][] expected = {{1,3}};
        runTest(n, connections, expected);
    }

    @Test
    public void test2(){
        int n = 2;
        int[][] connections = {{0,1}};
        int[][] expected = {{0,1}};
        runTest(n, connections, expected);
    }

    @Test
    public void test3(){
        int n = 5;
        int[][] connections = {{1,0},{2,0},{3,2},{4,2},{4,3},{3,0},{4,0}};
        int[][] expected = {{1,0}};
        runTest(n, connections, expected);
    }

}
