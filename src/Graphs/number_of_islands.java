package Graphs;

public class number_of_islands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        System.out.println(NumberofIslands(grid));
    }

    static int m = 0;
    static int n = 0;
    private static int NumberofIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int i, int j) {
        // check for out of bounds error
        if(i<0 || i>=m || j<0 || j>=n){
            return;
        }

        //water or visited
        if (grid[i][j] == '0' || grid[i][j] == '2') {
            return;
        }

        //mark current as visited
        grid[i][j] = '2';

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
