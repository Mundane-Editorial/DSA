package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class stock_span_leet_901 {
    public static void main(String args[])
    {
        int[] stock = {100,80,60,70,60,75,85};
        int[] res = analyze(stock);
        System.out.println(Arrays.toString(res));
    }

    private static int[] analyze(int[] stock) {
        int[] ans = new int[stock.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < stock.length; i++) {
            while (!st.isEmpty() && stock[st.peek()] <= stock[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
