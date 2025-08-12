package Greedy_questions;

public class maximum_subarray_sum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSum(nums));
    }

    private static int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for(int n : nums){
            curr = curr + n;

            max = Math.max(max, curr);

            if(curr < 0){
                curr = 0;
            }
        }
        return max;
    }
}
