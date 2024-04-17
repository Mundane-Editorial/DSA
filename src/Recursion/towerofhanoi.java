package Recursion;
import java.io.*;
public class towerofhanoi
{
    public static void main(String args[])throws IOException
    {
        int n = 3;
        swapdisk(n, "src", "help", "dest");
    }

    private static void swapdisk(int n, String src, String help, String dest) {
        if(n == 1)
        {
            System.out.println("transfer disk " + n + " from "+ src + " to "  + dest);
            return;
        }

        swapdisk(n-1, src, dest, help);
        System.out.println("transfer disk " + n + " from "+ src + " to " + dest);
        swapdisk(n-1, help, src, dest);
    }
}
