package Dynamic_programming;

import java.util.Arrays;
public class fibonacci_dp {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(fibo(n)));
    }

    private static int[] fibo(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        int i = 2;
        while(i < n){
            dp[i] = dp[i-1] + dp[i-2];
            i++;
        }

        return dp;
    }
}
