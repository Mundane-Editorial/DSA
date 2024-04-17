package Recursion;

public class climbing_stairs_70 {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;

        System.out.println("Distinct ways to climb to the top with n = " + n1 + ": " + climbStairs(n1));
        System.out.println("Distinct ways to climb to the top with n = " + n2 + ": " + climbStairs(n2));
    }
}
