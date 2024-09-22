package Graphs;

public class Island_perimeter {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        System.out.println(islandperimeter(grid));
    }

    public static int islandperimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int perimeter = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    perimeter += dfs(grid, i, j);
                }
            }
        }
        return perimeter;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length){
            return 1;
        }

        if(grid[i][j] == 0){
            return 1;
        }

        if(grid[i][j] != 1){
            return 0;
        }

        grid[i][j] = 2;

        int perimeter = 0;
        perimeter += dfs(grid, i+1, j);
        perimeter += dfs(grid, i-1, j);
        perimeter += dfs(grid, i, j+1);
        perimeter += dfs(grid, i, j-1);

        return perimeter;
    }
}
