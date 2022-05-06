package problems.data_structers.tress_and_graphs.critical_connections_in_a_network;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        if (connections.size() == n - 1) {
            // Already a tree - all connections are critical
            return connections;
        }
        List<List<Integer>> res = new ArrayList<>();
        boolean[][] connectionsArray = buildConnectionsArray(n, connections);
        for (List<Integer> connection : connections) {
            if (isCriticalConnection(connection, connectionsArray)) {
                res.add(connection);
            }
        }
        return res;
    }

    private static boolean[][] buildConnectionsArray(int n, List<List<Integer>> connections) {
        boolean[][] connectionsArray = new boolean[n][n];
        for (List<Integer> connection : connections) {
            int minServer = Math.min(connection.get(0), connection.get(1));
            int maxServer = Math.max(connection.get(0), connection.get(1));
            connectionsArray[minServer][maxServer] = true;
        }
        return connectionsArray;
    }

    public static boolean isCriticalConnection(List<Integer> connection, boolean[][] connectionsArray) {
        int minServer = Math.min(connection.get(0), connection.get(1));
        int maxServer = Math.max(connection.get(0), connection.get(1));
        connectionsArray[minServer][maxServer] = false;
        boolean res = areServersConnected(minServer, maxServer, connectionsArray);
        connectionsArray[minServer][maxServer] = true;
        // If the 2 servers are still connected, then the connection is not critical
        return !res;
    }

    public static boolean areServersConnected(int src, int dest, boolean[][] connectionsArray) {
        int n = connectionsArray.length;
        boolean[] visited = new boolean[n];
        List<Integer> queue = new ArrayList<>();
        queue.add(src);
        while (!queue.isEmpty()) {
            int server = queue.remove(0);
            if (server == dest) {
                return true;
            }
            for (int i=0; i<n; i++) {
                if (i == server) {
                    continue;
                }
                if ((connectionsArray[server][i] || connectionsArray[i][server]) && !visited[i]){
                    queue.add(i);
                }
            }
            visited[server] = true;
        }
        return false;
    }

}
