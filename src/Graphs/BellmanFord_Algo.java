package Graphs;

import java.util.ArrayList;

public class BellmanFord_Algo {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }


    private static void bellmanford_algo(ArrayList<Edge>[] graph, int src, int V) {
        int[] dist = new int[V];

        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        //O(V)  : loop for all the vertices
        for(int k=0; k<V-1; k++){

            //O(E) : loop for all the edges along with their weights
            for(int i=0; i<V; i++){
                for(int j=0; j<graph[i].size(); j++){
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    //perform relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                    }
                }
            }
        }

        for(int i=0; i< dist.length; i++){
            System.out.print(dist[i] + " ");
        }



        //code to detect -ve weight cycle
        /*
            for(int i=0; i<V; i++){
                for(int j=0; j<graph[i].size(); j++){
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    //perform re laxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]){  // agrye condition ek bhi baar true hogyi then -ve weight cycle exist krti hai
                        System.out.println("negative weight cycle exists");
                    }
                }
            }
        */
    }


    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        bellmanford_algo(graph, 0, V);
    }

}

// time complexity : O(V*E)  : greater than Dijkstra's algo
// usage :: will owork on all kinds of graphs