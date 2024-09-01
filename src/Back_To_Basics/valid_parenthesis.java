package Back_To_Basics;

import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        String s = "{([])}{}[]()";
        System.out.println(isvalid(s));
    }

    private static boolean isvalid(String s) {
        Stack<Character> S = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(')
                S.push(')');
            else if(ch == '[')
                S.push(']');
            else if(ch == '{')
                S.push('}');
            else{
                if(S.isEmpty() || S.peek() != ch){
                    return false;
                }
                S.pop();
            }
        }
        return S.isEmpty();
    }
}
