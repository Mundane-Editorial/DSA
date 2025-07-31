package interview_top_150_leetcode;

import java.util.Arrays;
public class product_of_array_except_self {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;

        for(int i=1; i<nums.length; i++){
            res[i] = res[i-1] * nums[i-1];
        }

        int prod = 1;
        for(int i = nums.length-1; i>=0; i--){
            res[i] = res[i] * prod;
            prod = prod * nums[i];
        }

        return res;
    }
}
