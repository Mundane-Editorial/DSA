import java.io.*;
class recursion1
{
    public static void main(String args[])throws IOException{
        int n=1;
        printnum(n);
    }

    private static void printnum(int n) {
        if(n>5)
        {
            return;
        }

        System.out.println(n);
        printnum(n+1);
    }
}