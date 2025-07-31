package Virtusa_coding_questions;

import java.util.*;
public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 4, 9, 9, 9};

        System.out.println(Arrays.toString(findunique(nums)));
    }

    private static int[] findunique(int[] nums) {
        int unique = 1;
        int n = nums.length;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[unique] = nums[i];
                unique++;
            }
        }
        for(int i=unique; i<n; i++){
            nums[i] = 0;
        }
        return nums;
    }
}
