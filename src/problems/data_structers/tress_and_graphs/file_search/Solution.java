package problems.data_structers.tress_and_graphs.file_search;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    public int breakRecords(int A, int[][] B) {
        boolean[][] connections = new boolean[A+1][A+1];
        for (int[] ints : B) {
            int minIndex = Math.min(ints[0], ints[1]);
            int maxIndex = Math.max(ints[0], ints[1]);
            if (minIndex != maxIndex) {
                connections[minIndex][maxIndex] = true;
            }
        }
        boolean[] processed = new boolean[A+1];
        int res = 0;
        int currIndex = 1;
        while (currIndex < processed.length){
            Queue<Integer> currNodes = new ArrayDeque<>();
            currNodes.add(currIndex);
            while (!currNodes.isEmpty()){
                int currNode = currNodes.poll();
                if (!processed[currNode]){
                    processed[currNode] = true;
                    for (int i=1; i<A+1; i++){
                        if (i!=currNode && !(processed[i]) && (connections[i][currNode] || connections[currNode][i])){
                            currNodes.add(i);
                        }
                    }
                }
            }
            res++;
            while (currIndex < processed.length && processed[currIndex]){
                currIndex++;
            }
        }
        return res;
    }
}
