package interview_top_150_leetcode;

public class best_time_to_buy_and_sell_stocks_l {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxPrice(prices));
    }

    private static int maxPrice(int[] prices) {
        if(prices.length == 0 || prices == null){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int price : prices){
            if(price < min){
                min = price;
            }else{
                profit = Math.max(profit, price - min);
            }
        }

        return profit;
    }
}
