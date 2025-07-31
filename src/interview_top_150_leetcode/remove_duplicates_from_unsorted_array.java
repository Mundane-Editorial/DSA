package interview_top_150_leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class remove_duplicates_from_unsorted_array {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 4, 9, 2, 1, 5, 7, 6, 3, 8, 1, 0, 5};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }

    private static int[] removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();


        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!seen.contains(nums[i])) {
                seen.add(nums[i]);
                nums[unique] = nums[i];
                unique++;
            }
        }

        for (int i = unique; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }
}
