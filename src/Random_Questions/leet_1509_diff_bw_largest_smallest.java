package Random_Questions;
import java.io.*;
import java.util.*;
public class leet_1509_diff_bw_largest_smallest {
    public static void main(String args[])throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {82,81,95,75,20};
        System.out.println(minDifference(nums));
    }
    private static int minDifference(int[] nums) {
        int l = nums.length;

        if(l<=4){
            return 0;
        }

        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;

        int left = 0;
        int right = l-4;
        while(left<4){
            diff = Math.min(diff, nums[right] - nums[left]);
            left++;
            right++;
        }
        return diff;
    }
}
