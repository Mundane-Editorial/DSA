package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class map_of_highest_peak {
    public static void main(String[] args) {
        int[][] isWater = {{0,0,1},{1,0,0},{0,0,0}};
//        System.out.println(Arrays.toString(highest_peak(isWater)));
        int[][] result = highest_peak(isWater);

        // Print the result
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }


    private static int[][] highest_peak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;

        int[][] height = new int[m][n];

        for(int[] row : height){
            Arrays.fill(row, -1);
        }

        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(isWater[i][j] == 1){
                    q.offer(new int[]{i, j});
                    height[i][j] = 0;
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int x = cell[0];
            int y = cell[1];

            for(int[] dir : directions){
                int nx = x + dir[0];
                int ny = y + dir[1];

                if(nx >= 0 && nx < m && ny >= 0 && ny < n && height[nx][ny] == -1){
                    height[nx][ny] = height[x][y] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return height;
    }
}
