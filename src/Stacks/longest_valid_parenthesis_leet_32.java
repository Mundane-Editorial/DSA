package Stacks;

import java.util.Stack;

public class longest_valid_parenthesis_leet_32 {
    public static void main(String args[])
    {
        String str = ")()())";
        int res = count(str);
        System.out.println(res);
    }

    private static int count(String str) {
        Stack<Integer> s = new Stack<>();
        int max=0;
        s.push(-1);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                s.push(i);
            }else{
                s.pop();
                if(s.isEmpty()){
                    s.push(i);
                }else{
                    int len = i-s.peek();
                    max = Math.max(max, len);
                }
            }
        }
        return max;
    }
}
