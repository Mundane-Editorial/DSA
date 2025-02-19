package Arrays;

public class grid_game {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1,15},{1,3,3,1}};
        System.out.println(gridgame(grid));
    }

    private static long gridgame(int[][] grid) {
        long firstrowsum = 0;
        for(int num : grid[0]){
            firstrowsum += num;
        }

        long secondrowsum = 0;

        long minimumsum = Long.MAX_VALUE;

        for(int i=0; i<grid[0].length; i++){
            firstrowsum = firstrowsum - grid[0][i];

            minimumsum = Math.min(minimumsum, Math.max(firstrowsum, secondrowsum));

            secondrowsum += grid[1][i];
        }
        return minimumsum;
    }
}
