package Stacks;

import java.util.Stack;

public class stack_via_collectionframework {

    public static void main(String args[]) {
//        stacks_via_linkedList.Stack s = new stacks_via_linkedList.Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
