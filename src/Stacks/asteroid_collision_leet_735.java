package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class asteroid_collision_leet_735 {
    public static void main(String[] args) {
        int[] asteroid = {5, 10, -5};
        int[] res = analyze(asteroid);
        System.out.println(Arrays.toString(res));
    }
    private static int[] analyze(int[] asteroid) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < asteroid.length; i++) {
            if (s.isEmpty() || asteroid[i] > 0) {
                s.push(asteroid[i]);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroid[i])) {
                    s.pop();
                }
                if (s.isEmpty() || s.peek() < 0) {
                    s.push(asteroid[i]);
                } else if (s.peek() == Math.abs(asteroid[i])) {
                    s.pop();
                }
            }
        }
        int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }
}
