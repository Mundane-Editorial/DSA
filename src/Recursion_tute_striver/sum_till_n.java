package Recursion_tute_striver;

public class sum_till_n {
    public static void main(String[] args) {
        int n = 10;
        sum(n, 0); // parameterized way
        System.out.println(funtionalwayoffindingsum(3));
    }

    private static int funtionalwayoffindingsum(int n) {
        if(n == 0){
            return 0;
        }
        return n + funtionalwayoffindingsum(n-1);
    }

    private static void sum(int n, int total) {  // parameterized answer
        if(n<0){
            System.out.println(total);
            return;
        }
        sum(n-1, total+n);
    }
}
