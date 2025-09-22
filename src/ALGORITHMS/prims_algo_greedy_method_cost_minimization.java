package ALGORITHMS;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class prims_algo_greedy_method_cost_minimization {
    static class edge {
        int src;
        int dest;
        int wt;

        edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<edge> graph[], int V) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 1 - 6 (10)
        graph[0].add(new edge(0, 5, 10));
        graph[5].add(new edge(5, 0, 10));

        // 1 - 2 (28)
        graph[0].add(new edge(0, 1, 28));
        graph[1].add(new edge(1, 0, 28));

        // 2 - 3 (16)
        graph[1].add(new edge(1, 2, 16));
        graph[2].add(new edge(2, 1, 16));

        // 3 - 4 (12)
        graph[2].add(new edge(2, 3, 12));
        graph[3].add(new edge(3, 2, 12));

        // 4 - 7 (18)
        graph[3].add(new edge(3, 6, 18));
        graph[6].add(new edge(6, 3, 18));

        // 4 - 5 (22)
        graph[3].add(new edge(3, 4, 22));
        graph[4].add(new edge(4, 3, 22));

        // 5 - 6 (25)
        graph[4].add(new edge(4, 5, 25));
        graph[5].add(new edge(5, 4, 25));

        // 5 - 7 (24)
        graph[4].add(new edge(4, 6, 24));
        graph[6].add(new edge(6, 4, 24));

        // 2 - 7 (14)
        graph[1].add(new edge(1, 6, 14));
        graph[6].add(new edge(6, 1, 14));
    }


    static class pair implements Comparable<pair> {
        int cost;
        int node;

        pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        public int compareTo(pair p2) {
            return this.cost - p2.cost;
        }
    }

    static int primsAlgo(ArrayList<edge> graph[], int V) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(0, 0));
        boolean[] visited = new boolean[V];

        int cost = 0;
        while (!pq.isEmpty()) {
            pair curr = pq.poll();
            if (!visited[curr.node]) {
                visited[curr.node] = true;
                cost = cost + curr.cost;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    edge e = graph[curr.node].get(i);
                    if (!visited[e.dest]) {
                        pq.add(new pair(e.dest, e.wt));
                    }
                }
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        System.out.println("Minimum cost for MST :: " + primsAlgo(graph, V));
    }
}
