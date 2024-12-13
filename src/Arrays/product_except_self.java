package Arrays;

import java.util.*;
public class product_except_self {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(product(nums)));
    }

    private static int[] product(int[] nums) {
        /*
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(j != i){
                    res[i] = (res[i]*nums[j]);
                }
            }
        }
        return res;
         */
        int n = nums.length;
        int[] res = new int[n];

        // Initialize the result array
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Multiply with the product of elements to the right
        int rightProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct *= nums[i + 1];
            res[i] *= rightProduct;
        }

        return res;
    }
}
