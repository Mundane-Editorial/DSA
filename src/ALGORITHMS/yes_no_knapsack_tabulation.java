package ALGORITHMS;

import java.util.Arrays;
public class yes_no_knapsack_tabulation {
    public static void main(String[] args) {
        int[] p = {1, 2, 5, 6};
        int[] wt = {2, 3, 4, 5};
        int n = 4;
        int m = 8;

        System.out.println("Max value :: " + knapsack(p, wt, n, m));
        System.out.println("Max value :: " + Optimizedknapsack(p, wt, n, m));
        
    }

    private static int Optimizedknapsack(int[] p, int[] wt, int n, int m) {
        int[] dp = new int[m + 1];

        for (int i = 0; i < n; i++) {
            for (int w = m; w >= wt[i]; w--) { // go backwards!
                dp[w] = Math.max(dp[w], p[i] + dp[w - wt[i]]);
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[m];
    }

    private static int knapsack(int[] p, int[] wt, int n, int m) {
        int[][] dp = new int[n+1][m+1];

        for(int i=0; i<=n; i++){
            for(int w=0; w<=m; w++){
                if(i == 0 || w == 0){
                    dp[i][w] = 0;
                }else if(wt[i-1] <= w){
                    dp[i][w] = Math.max(p[i-1] + dp[i-1][w-wt[i-1]], dp[i-1][w]);
                }else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

        return dp[n][m];
    }
}
