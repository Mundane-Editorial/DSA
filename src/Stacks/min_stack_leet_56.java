package Stacks;
import java.util.Stack;
public class min_stack_leet_56 {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public void MinStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void push(int val) {
        s1.push(val);
        if(
                s2.isEmpty() || val<=s2.peek())
        {
            s2.push(val);
        }
    }

    public void pop() {
        if(!s1.isEmpty()){
            if(s1.peek().equals (s2.peek()))
            {
                s2.pop();
            }
            s1.pop();
        }
    }
    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}
