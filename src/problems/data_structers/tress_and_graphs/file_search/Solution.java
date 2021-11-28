package problems.data_structers.tress_and_graphs.file_search;

import java.util.*;

public class Solution {

    public int breakRecords(int A, int[][] B) {
        HashMap<Integer, Set<Integer>> connections = new HashMap<>();
        for (int[] ints : B) {
            for (int i=0; i<2; i++){
                Set<Integer> currNodeConnections = connections.computeIfAbsent(ints[i], k -> new HashSet<>());
                currNodeConnections.add(ints[1-i]);
            }
        }
        boolean[] processed = new boolean[A+1];
        int res = 0;
        for (int i=1; i< processed.length; i++){
            if (!processed[i]) {
                Queue<Integer> currNodes = new ArrayDeque<>();
                currNodes.add(i);
                while (!currNodes.isEmpty()) {
                    int nodeFromQueue = currNodes.poll();
                    processed[nodeFromQueue] = true;
                    Set<Integer> nodeFromQueueConnections = connections.get(nodeFromQueue);
                    if (nodeFromQueueConnections != null) {
                        for (Integer connection : nodeFromQueueConnections) {
                            if (!processed[connection]) {
                                currNodes.add(connection);
                            }
                        }
                    }
                }
                res++;
            }
        }
        return res;
    }
}
