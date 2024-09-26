package Graphs;

import java.util.ArrayList;

public class Rat_in_a_Maze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        System.out.println(FindWay(maze).toString());
    }

    private static ArrayList<String> FindWay(int[][] maze) {
        ArrayList<String> res = new ArrayList<>();
        String path = "";
        if(maze[0][0] == 1){
            dfs(maze,0, 0, path, res);
        }
        return res;
    }

    private static void dfs(int[][] maze, int i, int j, String path, ArrayList<String> res) {
        int m = maze.length;
        int n = maze[0].length;

        if(i<0 || i>=m || j<0 || j>=n || maze[i][j] != 1){
            return;
        }

        if(i == m-1 && j == n-1){
            res.add(path);
            return;
        }

        maze[i][j] = -1;

        dfs(maze, i + 1, j, path + "D", res); // Down
        dfs(maze, i - 1, j, path + "U", res); // Up
        dfs(maze, i, j + 1, path + "R", res); // Right
        dfs(maze, i, j - 1, path + "L", res); // Left

        maze[i][j] = 1;
    }
}
