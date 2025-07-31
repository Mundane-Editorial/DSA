package Dynamic_programming;

public class coin_change_518 {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};

        System.out.println(change(amount, coins));
    }

    private static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for(int coin : coins){
            for(int i=coin; i<=amount; i++){
                dp[i] = dp[i] + dp[i-coin];
            }
        }
        return dp[amount];
    }
}
