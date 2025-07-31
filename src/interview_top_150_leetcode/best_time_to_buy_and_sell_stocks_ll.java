package interview_top_150_leetcode;

public class best_time_to_buy_and_sell_stocks_ll {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxPrice(prices));
    }

    private static int maxPrice(int[] prices) {
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
    }
}
