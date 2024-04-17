package Stacks;

import java.util.Stack;

public class sort_a_stack {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(9);
        s.push(-1);
        s.push(10);
        s.push(6);
        s.push(1);
        s.push(11);

        sortStack(s);

        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    private static void sortStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int temp = s.pop();
        sortStack(s);
        insertSorted(s, temp);
    }
    private static void insertSorted(Stack<Integer> s, int temp) {
        if (s.isEmpty() || s.peek() < temp) {
            s.push(temp);
            return;
        }

        int top = s.pop();
        insertSorted(s, temp);
        s.push(top);
    }
}
