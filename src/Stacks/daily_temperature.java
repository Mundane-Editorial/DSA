package Stacks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class daily_temperature {
    public static void main(String args[])
    {

        int[] arr = {73,74,75,71,69,72,76,73};
//        int[] arr = {100,80,60,70,60,75,85};

        int[] result = nexthightemp(arr);
        System.out.print(Arrays.toString(result));
    }

    private static int[] nexthightemp(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = arr.length-1; i>=0;i--)
        {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()])
            {
                s.pop();
            }

            if(!s.isEmpty())
            {
                res[i] = s.peek()-i;
            }
            s.push(i);
        }
        return res;
    }
}
