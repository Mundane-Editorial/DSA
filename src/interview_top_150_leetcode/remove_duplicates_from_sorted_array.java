package interview_top_150_leetcode;

import java.util.Arrays;

public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(removeSorted(nums)));
    }

    private static int[] removeSorted(int[] nums) {
        int unique = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[unique] = nums[i];
                unique++;
            }
        }
        for(int i = unique; i<nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
}
