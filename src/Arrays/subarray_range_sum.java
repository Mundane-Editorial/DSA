package Arrays;
import java.util.Arrays;
import java.util.*;
public class subarray_range_sum {
    public static void main(String args[]){
        int[] nums = {1,2,3,4};
        int n = 4;
        int left = 1;
        int right = 5;
        System.out.println(rangeSum(nums, n, left, right));
    }
    public static int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                list.add(sum);
            }
        }

        Collections.sort(list);



        System.out.println(list.toString());
        return 0;
    }
}
