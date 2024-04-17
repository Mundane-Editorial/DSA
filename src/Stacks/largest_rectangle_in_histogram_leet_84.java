package Stacks;

import java.util.Stack;

public class largest_rectangle_in_histogram_leet_84 {
    public static void main(String args[])
    {
        int[] height = {2,1,5,6,2,3};
        int res = maxarea(height);
        System.out.println(res);
    }

    private static int maxarea(int[] height) {
        int maxans = 0;
        int ps[] = prevSmaller(height);
        int ns[] = nextSmaller(height);
        for (int i=0; i<height.length;i++){
            int cur = (ns[i] - ps[i] - 1) * height[i];
            maxans = Math.max(maxans, cur);
        }
        return maxans;
    }

    private static int[] nextSmaller(int[] height) {
        int ns[] = new int[height.length];
        Stack<Integer> s = new Stack<>();

        for(int i = height.length-1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i])
            {
                s.pop();
            }
            if (s.isEmpty()){
                ns[i]= height.length;
            }else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }


    private static int[] prevSmaller(int[] height) {
        int ps[] = new int[height.length];
        Stack<Integer> s = new Stack<>();

       for(int i=0; i<height.length; i++)
       {
           while (!s.isEmpty() && height[s.peek()] >= height[i])
           {
               s.pop();
           }
           if (s.isEmpty()){
               ps[i]= -1;
           }else{
               ps[i]=s.peek();
           }
           s.push(i);
       }
       return ps;
    }
}
