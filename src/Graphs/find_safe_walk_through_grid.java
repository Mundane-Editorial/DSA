package Graphs;

public class find_safe_walk_through_grid {
    public static void main(String[] args) {
        int[][] grid = {
                {0,0,0,1,0,1,0,0,1,0,1,1,0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,1},
                {0,0,0,0,1,0,0,0,1,1,1,1,0,1,1,1,1,0,1,0,0,0,0,0,0,1,0,1,1},
                {0,1,1,1,0,0,0,0,1,1,0,1,1,0,1,0,1,1,0,0,0,1,0,1,1,1,0,1,1},
                {1,1,1,0,0,1,0,0,1,1,1,1,1,1,1,1,0,1,0,1,0,0,0,1,1,0,0,1,0},
                {0,1,1,0,0,0,1,0,0,1,0,1,1,1,1,1,0,0,1,0,1,1,0,0,1,0,1,0,0},
                {1,0,1,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0},
                {0,0,1,0,1,0,1,1,1,0,0,0,0,0,1,0,0,0,0,0,1,1,0,1,1,1,1,1,1},
                {1,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,0,1,0,0,1,0,1,0,0,0,1,1,0},
                {1,0,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1,0,0,1,1,1,0,0,0,1,1,0,1},
                {1,1,0,0,0,0,1,0,0,0,0,1,1,1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0},
                {0,0,1,0,0,1,1,1,0,0,0,1,0,0,0,0,1,1,1,1,1,1,0,0,1,0,0,1,1},
                {0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1},
                {0,0,1,1,1,1,0,1,1,1,0,1,1,1,0,0,1,0,1,0,0,1,1,1,1,0,1,0,0},
                {0,0,0,1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,0,1,1,0,0,0,0,1,0,0},
                {1,1,1,1,0,0,0,0,1,1,0,1,1,1,0,0,0,0,1,1,0,1,1,1,1,0,1,1,1},
                {0,0,1,0,0,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1},
                {1,1,0,0,0,0,1,0,1,1,1,0,0,1,0,1,0,1,1,0,1,0,1,1,1,1,0,0,0},
                {0,1,0,0,1,1,0,0,0,1,1,0,0,1,0,0,1,1,1,0,0,1,0,0,1,1,0,0,1},
                {1,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,1,1,0,0}
        };
        int health = 4;

        System.out.println(findSafeWalk(grid, health));

    }

    private static boolean findSafeWalk(int[][] grid, int health) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        boolean res = dfs(grid, 0, 0, health, visited);
        return res;
    }

    public static boolean dfs(int[][] grid, int i, int j, int health, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;

        if(i<0 || i>=m || j<0 || j>=n || visited[i][j] != false){
            return false;
        }

        health = health - grid[i][j];

        if(health < 1){
            return false;
        }

        if (i == m - 1 && j == n - 1 && health>=1) {
            return true;
        }

        visited[i][j] = true;

        boolean path = dfs(grid, i + 1, j, health, visited) ||   // Down
                dfs(grid, i, j + 1, health, visited) ||   // Right
                dfs(grid, i - 1, j, health, visited) ||   // Up
                dfs(grid, i, j - 1, health, visited);     // Left

        visited[i][j] = false;

        return path;
    }
}
