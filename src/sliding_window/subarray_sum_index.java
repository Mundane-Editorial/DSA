package sliding_window;

import java.util.Arrays;
public class subarray_sum_index {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 5};
        int key = 12;
        System.out.println(Arrays.toString(findSum(nums, key)));
    }

    private static int[] findSum(int[] nums, int key) {
        int start = 0;
        int currSum = 0;
        for(int end = 0; end<nums.length; end++){
            currSum += nums[end];

            while(currSum > key && start <= end){
                currSum -= nums[start];
                start++;
            }

            if(currSum == key){
                return new int[]{start, end};
            }
        }

        return new int[]{-1, -1};
    }
}
