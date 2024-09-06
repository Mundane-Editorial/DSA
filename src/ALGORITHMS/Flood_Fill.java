package ALGORITHMS;

/*
*
* The flood fill algorithm is primarily used for filling a connected area in a multi-dimensional grid (such as an image
* or a matrix) starting from a specific point and continuing to adjacent points that have the same value (color). It is
* often used in scenarios where we need to modify or analyze areas with similar properties.
*
* ===================================== USES ============================================
*   Game development for map exploration
*   Ms paint and other paint applications :: for filling colors etc
*
* */

import java.util.*;
public class Flood_Fill {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;  //starting row
        int sc = 1;  //starting column
        int color = 2;
//        System.out.println(Arrays.toString(floodfill(image, sr, sc, color)));  //agr isko aisa likha to ye string valueshi print krwaega jo smjh ni aenge eg : [[I@7b23ec81, [I@6acbcfc0, [I@5f184fc6]

        floodfill(image, sr, sc, color);

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                System.out.print(image[i][j] + " " );
            }
            System.out.println();
        }
    }

    static int m = 0;
    static int n = 0;
    private static int[][] floodfill(int[][] image, int sr, int sc, int color) {
        m = image.length;
        n = image[0].length;

        int startcolor = image[sr][sc];

        if(startcolor != color){
            dfs(image, sr, sc, startcolor, color);
        }

        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int startcolor, int color) {
        if(sr<0 || sr>=n || sc<0 || sc>=m){
            return;
        }

        if(image[sr][sc] != startcolor){
            return;
        }

        image[sr][sc] = color;

        dfs(image, sr+1, sc, startcolor, color);
        dfs(image, sr-1, sc, startcolor, color);
        dfs(image, sr, sc+1, startcolor, color);
        dfs(image, sr, sc-1, startcolor, color);
    }
}


//Time complexity :: O(m*n)