package Recursion_tute_striver;

public class print_names_till_n {
    static int n = 0;

    public static void main(String[] args) {
        printnames(n);
    }

    private static int printnames(int n) {
        if(n>=20){
            return 0;
        }
        System.out.println(n);
        return printnames(n+1);
    }
}


// time complexity : n functions are called so time will be O(n)
// stack space complexity : O(n)
