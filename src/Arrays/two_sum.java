package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class two_sum {
    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
