package ALGORITHMS;


/*

Kadence algorithmn : it is  used to find the maximum subarray sum in a given array.
EG:   arr = {5, 4, -2, 6, 1}
    output = 14
*/

public class Kadance_Algorithmn {
    public static void main(String[] args) {
        int[] arr = {5, 4, -2, 6, 1};

        System.out.println(" sum  :: " + kadancealgo(arr));
    }

    private static int kadancealgo(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i=0 ;i<arr.length; i++){
            currsum += arr[i];

            if(currsum > maxsum){
                maxsum = currsum;
            }

            if(currsum < 0){
                currsum = 0;
            }
        }
        return maxsum;
    }
}


//time complexity : O(N)
// brute force time complexity : O(N*N)