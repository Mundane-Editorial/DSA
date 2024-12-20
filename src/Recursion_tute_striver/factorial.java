package Recursion_tute_striver;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findfactorial(n));
    }

    private static int findfactorial(int n) {
        if(n<1){
            return 1;
        }
        return n * findfactorial(n-1);
    }
}
