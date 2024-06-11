package Leet_75;

import java.util.Arrays;

public class product_of_array_except_self {
    private static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];


        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = product;
            product *= nums[i];
        }


        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= product;
            product *= nums[i];
        }

        return res;
    }

    public static void main(String args[]){
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
