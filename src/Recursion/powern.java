package Recursion;

import java.io.IOException;

public class powern {   //stack height = n  : complexity
    public static void main(String args[])throws IOException{
        int x=2;
        int n=5;

        int res = calcpower(x,n);
        System.out.print(res);
    }

    private static int calcpower(int x, int n) {
        if(n==0)
            return 1;

        if(x==0)
            return 0;

        int pnm1 = calcpower(x, n-1);
        int pown = x * pnm1;
        return pown;
    }
}
