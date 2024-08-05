package Stacks;

import java.util.*;

class Equalstacks {
    // Function to calculate prefix sums for the stacks
    private void fillStacks(Stack<Integer> st1, int[] h1, Stack<Integer> st2, int[] h2, Stack<Integer> st3, int[] h3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;

        // Fill stacks with prefix sums in reverse order for stack nature
        for (int i = h1.length - 1; i >= 0; i--) {
            sum1 += h1[i];
            st1.push(sum1);
        }

        for (int i = h2.length - 1; i >= 0; i--) {
            sum2 += h2[i];
            st2.push(sum2);
        }

        for (int i = h3.length - 1; i >= 0; i--) {
            sum3 += h3[i];
            st3.push(sum3);
        }
    }

    public int equalStacks(int[] h1, int[] h2, int[] h3) {
        int maxHeight = 0;

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        fillStacks(st1, h1, st2, h2, st3, h3);

        while (!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty()) {
            int stack1Height = st1.peek();
            int stack2Height = st2.peek();
            int stack3Height = st3.peek();

            if (stack1Height == stack2Height && stack2Height == stack3Height) {
                maxHeight = st1.peek();
                break;
            }

            if (stack1Height >= stack2Height && stack1Height >= stack3Height) {
                st1.pop();
            } else if (stack2Height >= stack1Height && stack2Height >= stack3Height) {
                st2.pop();
            } else if (stack3Height >= stack1Height && stack3Height >= stack2Height) {
                st3.pop();
            }
        }

        return maxHeight;
    }

    public static void main(String[] args) {
        Equalstacks eq = new Equalstacks();

        int[] h1 = {3, 2, 1, 1, 1};
        int[] h2 = {4, 3, 2};
        int[] h3 = {1, 1, 4, 1};

        int result = eq.equalStacks(h1, h2, h3);
        System.out.println("Maximum possible equal height: " + result);
    }
}
