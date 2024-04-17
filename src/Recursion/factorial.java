package Recursion;

import java.io.*;
class factorial
{
    public static void main(String args[])throws IOException
    {
//        int n = 5;
        printfact(1, 5, 1);
    }

    private static void printfact(int i, int n, int product)
    {
        if(i == n)
        {
            product = product * i;
            System.out.println(product);
            return;
        }
        product=product*i;
        printfact(i+1, n, product);

    }

}