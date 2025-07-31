package Arrays;

public class Maximum_subarray_sum_of_size_k {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 2;

        System.out.println(findSum(nums, k));
    }

    private static int findSum(int[] nums, int k) {
        if(nums.length == 0 || nums == null){
            return 0;
        }

        int windowSum = 0;
        int maxSum = 0;

        for(int i=0; i<k; i++){
            windowSum += nums[i];
        }

        maxSum = windowSum;

        for(int end=k; end<nums.length; end++){
            windowSum += nums[end] - nums[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
