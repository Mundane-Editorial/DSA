package Dynamic_programming;

public class climbing_Stairs_70 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(totalNoOfWays(n));
    }

    private static int totalNoOfWays(int n) {
        if(n <= 3){
            return n;
        }

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            System.out.print(dp[i] + " ");
        }

        return dp[n];
    }
}
