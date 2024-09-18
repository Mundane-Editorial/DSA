package Graphs;

import java.util.ArrayList;

public class directed_graph_cycle_detection {
    static class Edge{
        int src;
        int des;
        Edge(int s, int d){
            this.des = d;
            this.src = s;
        }
    }

        private static void createGraph(ArrayList<Edge>[] graph) {
            for(int i=0; i< graph.length; i++){
                graph[i] = new ArrayList<Edge>();
            }

            graph[0].add(new Edge(0, 2));
            graph[1].add(new Edge(1, 0));
            graph[2].add(new Edge(2, 3));
            graph[3].add(new Edge(3, 0));
        }

        private static boolean isCycleDetected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]){
            vis[curr] = true;
            rec[curr] = true;

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if(rec[e.des]){
                    return true;
                }if(!vis[e.des]){
                    if(isCycleDetected(graph, vis, e.des, rec)){
                        return true;
                    }
                }
            }

            rec[curr] = false;
            return false;
        }

        public static void main(String[] args) {
            int V = 4;
            ArrayList<Edge> graph[] = new ArrayList[V];
            createGraph(graph);

            System.out.println(isCycleDetected(graph, new boolean[V], 0, new boolean[V]));
        }
}
