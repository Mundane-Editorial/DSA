import java.io.*;
import java.util.Arrays;
class arraypartition {
    public static void main(String args[]) throws IOException {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int sum = arrayPairSum(nums);
        System.out.println(sum);
    }
    static int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;

    for(int i=0; i<nums.length; i=i+2)
    {
        sum = sum + nums[i];
    }
    return sum;

    }
}
