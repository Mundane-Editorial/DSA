package Dynamic_programming;

import java.util.Arrays;
public class multi_stage_graph_dp {
    public static void main(String[] args) {
        int[][] c = {
              // 0  1  2  3  4  5  6  7  8  9
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 1, 3, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 2, 3, 0, 0},
                {0, 0, 0, 0, 0, 6, 7, 0, 0},
                {0, 0, 0, 0, 0, 6, 8, 9, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 6},
                {0, 0, 0, 0, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        int stages = 4;
        int n = 8;
        int[] cost = new int[9];
        int[] d = new int[9];
        int[] path = new int[stages + 1];
        cost[n] = 0;

        for(int i=n-1; i>=1; i--){
            int min = Integer.MAX_VALUE;
            for(int k=i+1; k<=n; k++){
                if(c[i][k] != 0 && c[i][k] + cost[k] < min){
                    min = c[i][k] + cost[k];
                    d[i] = k;
                }
            }
            cost[i] = min;
        }
        path[1] = 1;
        path[stages] = n;

        for(int i=2; i<stages; i++){
            path[i] = d[path[i-1]];
        }

        System.out.println("Minimum cost from source to destination ;: " + cost[1]);
        System.out.print("path: ");
        for(int i=1; i<=stages; i++){
            System.out.print(path[i] + " ");
        }
        System.out.println("");
        System.out.println("cost array : " + Arrays.toString(cost));
        System.out.println("cost array : " + Arrays.toString(d));
        System.out.println("cost array : " + Arrays.toString(path));

    }
}
