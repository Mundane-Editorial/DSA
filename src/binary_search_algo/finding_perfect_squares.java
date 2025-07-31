package binary_search_algo;

public class finding_perfect_squares {
    public static void main(String[] args) {
        int n = 324;
        System.out.println(findsquare(n));
    }

    private static boolean findsquare(int n) {
        if(n<=1){
            return false;
        }

        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid*mid == n){
                return true;
            }
            if(mid*mid > n){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}
