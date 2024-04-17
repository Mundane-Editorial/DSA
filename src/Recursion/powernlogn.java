package Recursion;

import java.io.IOException;

public class powernlogn { //stack height with complexity logn
    public static void main(String args[])throws IOException {
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

        if(n % 2 == 0) //for n = even
        {
            return calcpower(x, n/2) * calcpower(x, n/2);
        }
        else {
            return calcpower(x,n/2) * calcpower(x,n/2) * x;
        }
    }
}
