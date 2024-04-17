package Recursion;
import java.io.*;
public class nnaturalnumbers {
    public static void main(String args[])throws IOException
    {
//        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        int n = 1,
        sum(1, 5, 0);
    }

    private static void sum(int i, int n, int sum) {
    if(i == n)
    {
        sum = sum+i;
        System.out.println(sum);
        return;
    }
    sum=sum+i;
    sum(i+1, n, sum);
    }
}
