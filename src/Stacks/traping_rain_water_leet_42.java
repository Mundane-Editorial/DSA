package Stacks;

import java.util.Stack;

public class traping_rain_water_leet_42 {
    public static void main(String args[]) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trapwater(height);
        System.out.println(res);
    }

    private static int trapwater(int[] height) {
        Stack<Integer> s = new Stack<>();
        int ans = 0;

        for(int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[i] > height[s.peek()]) {
                int top = s.pop();
                if (s.isEmpty())
                    break;
                int distance = i - s.peek() - 1;
                int bounded_height = Math.min(height[i], height[s.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            s.push(i);
        }
        return ans;
    }
}
//dry-run pending
