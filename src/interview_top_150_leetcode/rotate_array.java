package interview_top_150_leetcode;

import java.util.Arrays;
public class rotate_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 3;

        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    private static int[] rotate(int[] nums, int k) {
        rotate(nums, 0, nums.length-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, nums.length-1);

        return nums;
    }

    private static void rotate(int[] nums, int first, int last){
        int temp = 0;
        while(first < last){
            temp = nums[first];
            nums[first++] = nums[last];
            nums[last--] = temp;
        }
    }
}
