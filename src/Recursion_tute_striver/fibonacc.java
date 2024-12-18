package Recursion_tute_striver;

public class fibonacc {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(getfibo(n));
    }

    private static int getfibo(int n) {
        if(n <= 1){
            return n;
        }
        System.out.println((n-1) + " " + (n-2));
        return getfibo(n-1) + getfibo(n-2);
    }
}


/*
* time complexity :: ~O(2^N)  approx;
* */