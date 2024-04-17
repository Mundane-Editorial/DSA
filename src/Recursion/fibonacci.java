package Recursion;

import java.io.IOException;

public class fibonacci {
    public static void main(String args[])throws IOException{
        printfibo(0, 1, 10);
    }

    private static void printfibo(int a, int b, int n) {
       if(n == 0)
       {
           return;
       }
        int c = a+b;
        System.out.println(c);
        printfibo(b,c,n-1);

    }
}
