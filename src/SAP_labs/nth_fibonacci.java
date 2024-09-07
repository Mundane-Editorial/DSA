package SAP_labs;

public class nth_fibonacci {
    public static void main(String[] args) {
        long n = 50;

        System.out.println(findfibonacci(n));   // it will take O(2^n) time complexity and O(n) space complexity
    }

/*
    private static int findfibonacci(int n) {  // recursive approach
        if(n <= 1){
            return n;
        }
        return findfibonacci(n-1) + findfibonacci(n-2);
    }
*/

    private static long findfibonacci(long n){  // time complexity : O(n) space complexity : O(1)
        if(n<=1){
            return n;
        }

        int prev1 = 1, prev2 = 0;
        for(int i=2; i<=n; i++){
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
