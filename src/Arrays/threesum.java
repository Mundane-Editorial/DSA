package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class threesum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    static public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int start = i + 1;
            int target = -nums[i];
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[start] + nums[end];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    while (start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }

                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }

                    start++;
                    end--;
                }else if(sum < target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return result;
    }
}
