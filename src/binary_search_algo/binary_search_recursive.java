package binary_search_algo;

import java.util.Arrays;
public class binary_search_recursive {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,7,8,9,8,7,6,4};
        int key = 9;
        int mid = 0;
        Arrays.sort(nums);
        System.out.println(find(nums, key, 0, nums.length - 1));
    }

    private static boolean find(int[] nums, int key, int low, int high) {
        if(low > high){
            return false;
        }

        int mid = low + (high - low)/2;

        if(nums[mid] == key){
            return true;
        } else if (nums[mid] < key) {
            return find(nums, key, mid + 1, high);
        } else{
            return find(nums, key, low, mid - 1);
        }
    }
}
