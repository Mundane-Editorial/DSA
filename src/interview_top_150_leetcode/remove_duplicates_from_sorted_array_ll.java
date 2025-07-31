package interview_top_150_leetcode;

import java.util.Arrays;
public class remove_duplicates_from_sorted_array_ll {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3,9,9,9,9,10,10,10,10,10,11,11,11,11,11,15,15,15};

        System.out.println(Arrays.toString(removeduplicates(nums)));
    }

    private static int[] removeduplicates(int[] nums) {
        int count = 1;
        int unique = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= 2){
                nums[unique] = nums[i];
                unique++;
            }
        }

        for(int i=unique; i<nums.length; i++){
            nums[i] = 0;
        }

        return nums;
    }
}
