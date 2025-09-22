package ALGORITHMS;

public class Floyd_warshall_all_pair_shortest_path {
    static final int INF = 1000000; // large value

    public static void main(String[] args) {
        int[][] graph = {
                {0, 0, 0, 0, 0},
                {0, 0, 3, INF, 7},
                {0, 8, 0, 2, INF},
                {0, INF, INF, 0, 1},
                {0, 2, INF, 5, 0}
        };

        int n = graph.length;
        graph = shortest_Path(graph, n);

        // Print result
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (graph[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(graph[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] shortest_Path(int[][] graph, int n) {

        for (int k = 1; k < n; k++) {
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (graph[i][k] != INF && graph[k][j] != INF) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }
        }

        return graph;
    }
}
