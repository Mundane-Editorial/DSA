package Random_Questions;
import java.util.*;
public class max_product_of_3_numbers {
    public static void main(String[] args) {
        int[] nums = {1,2,-1,-2,-3, 3,4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        if(nums.length < 3){
            return -1;
        }
        Arrays.sort(nums);

        int maxpro1 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        int maxpro2 = nums[0] * nums[0] * nums[0];

        return Math.max(maxpro1, maxpro2);
    }
}
