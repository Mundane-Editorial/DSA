package Recursion_tute_striver;

public class ispoweroftwo {
    public static void main(String[] args) {
        int n = 1024;
        System.out.println(ispower(n, 0));
    }

    private static boolean ispower(int n, int i) {
         if(Math.pow(2, i) == n){
            return true;
        }

        if(Math.pow(2, i) > n){
            return false;
        }


        return ispower(n, i+1);
    }
}
