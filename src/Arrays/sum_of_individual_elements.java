package Arrays;

import java.util.Arrays;
public class sum_of_individual_elements {
    public static void main(String[] args) {
        int[] nums = {12, 34, 122, 98, 66};
        int[] res = calsum(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] calsum(int[] nums) {
        int res[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = sum(nums[i]);
        }
        return res;
    }

    private static int sum(int num) {
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}
