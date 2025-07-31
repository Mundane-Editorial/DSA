package interview_top_150_leetcode;

import java.util.Arrays;
public class major_element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2,};

        System.out.println(majorElement(nums));
    }

    private static int majorElement(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length/2];
    }
}
