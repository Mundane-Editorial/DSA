package Recursion_tute_striver;

public class one_to_n_using_backtracking {
    public static void main(String[] args) {
        int n = 5;
        printoneton(5,5);
    }

    private static void printoneton(int n, int i) {
        if(i < 1){
            return;
        }
        printoneton(n, i-1);
        System.out.print(i + " ");
    }
}
