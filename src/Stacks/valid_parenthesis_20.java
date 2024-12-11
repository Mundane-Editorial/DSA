package Stacks;

import java.util.Stack;

public class valid_parenthesis_20 {

    public static void main(String args[]){
        String str = "()))(";
        boolean valid = isvalid(str);
        System.out.println(valid);
    }

    private static boolean isvalid(String str) {

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                s.push(')');
            else if (ch == '[')
                s.push(']');
            else if (ch == '{')
                s.push('}');
            else {
                if (s.isEmpty() || s.peek() != ch) {
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
