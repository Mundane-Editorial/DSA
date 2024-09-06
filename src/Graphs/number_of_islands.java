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

/*
* The time complexity of the NumberofIslands method can be analyzed as follows:
Outer Loop: The method iterates through each cell in the grid using two nested loops. The outer loop runs m times (number of rows), and the inner loop runs n times (number of columns). Therefore, the total number of iterations for the loops is O(m * n).
DFS Call: When a '1' (land) is found, the dfs method is called. The dfs method explores all connected land cells (1s) and marks them as visited (changing them to '2'). In the worst case, the dfs method will visit every cell in the grid once. Thus, the time complexity for the DFS traversal is also O(m * n).
Combining these two parts, the overall time complexity of the NumberofIslands method is:
*
Time Complexity: O(m * n)
*
* */