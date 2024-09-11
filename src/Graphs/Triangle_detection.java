package Graphs;

// to count the number of triangles in the graph

public class Triangle_detection {
        static int V = 4;  //number of vertices

    public static void main(String[] args) {
        int undirectedgraph[][] = {{0, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 0}
        };


        int directedgraph[][] = { {0, 0, 1, 0},
                {1, 0, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 1, 0}
        };

        System.out.println("Directed graph triangle count :: " + directedcount(directedgraph));
        System.out.println("UnDirected graph triangle count :: " + undirectedcount(undirectedgraph));
    }

    private static int directedcount(int[][] directedgraph) {
        int triangle_count = 0;

        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                for(int k=0; k<V; k++){
                    if (directedgraph[i][j] == 1 && directedgraph[j][k] == 1 && directedgraph[k][i] == 1){
                        triangle_count++;
                    }
                }
            }
        }
        // acc to gfg, id the graph is directed then we'll have to divide it by 3
        return triangle_count/3;
    }

    private static int undirectedcount(int[][] undirectedgraph) {
        int triangle_count = 0;

        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                for(int k=0; k<V; k++){
                    if (undirectedgraph[i][j] == 1 && undirectedgraph[j][k] == 1 && undirectedgraph[k][i] == 1){
                        triangle_count++;
                    }
                }
            }
        }
        // acc to gfg, id the graph is undirected then we'll have to divide it by 6
        return triangle_count/6;
    }

}


// time complexity :: O(n3) because of the individual traversal of 3 variables