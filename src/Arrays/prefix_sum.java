package Arrays;
import java.util.Arrays;
public class prefix_sum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(prefixsum(nums)));
    }

    private static int[] prefixsum(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];

        temp[0] = nums[0];
        for(int i=1; i<n; i++){
            temp[i] = temp[i-1] + nums[i];
        }

        return temp;
    }
}
