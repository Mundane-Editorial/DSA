package Recursion_tute_striver;

public class print_linearly_till_n {
    public static void main(String[] args) {
        int n = 15;
        int i = 0;
        printnumbers(n, i);
    }

    private static void printnumbers(int n, int i) {
        if(i > n){
            return ;
        }
        System.out.print(i + " ");
        printnumbers(n, i+1);
    }
}
