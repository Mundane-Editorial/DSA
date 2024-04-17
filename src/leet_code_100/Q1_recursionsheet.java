package leet_code_100;

//import java.util.List;
import java.util.ArrayList;
import java.util.List;

// given n pairs of parenthesis, write a function to calculate all the well formmed parenthesis using recursion
/*
* Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 */
public class Q1_recursionsheet {
    public static void main(String args[])
    {
        int n = 3;
        List<String> list=new ArrayList<String>();
        wellformedparenthesis("(", 1, 0, list, n);
    }

    private static void wellformedparenthesis(String s, int open, int close, List<String> list, int n) {
        if(s.length() == 2*n){
            list.add(s);
            System.out.println(s);
        }

        if(open<n){
            wellformedparenthesis(s+"(", open+1, close, list, n);
        }
        if(close<open){
            wellformedparenthesis(s+")", open, close+1, list, n);
        }
    }
}


