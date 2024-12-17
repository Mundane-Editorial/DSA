package Recursion_tute_striver;

public class n_to_one_using_backtracking {
    public static void main(String[] args) {
        int n = 5;
        printfromn(1,n);
    }

    private static void printfromn(int i, int n) {
        if(i > n){
            return;
        }

        printfromn(i+1, n);
        System.out.print(i + " ");
    }
}
