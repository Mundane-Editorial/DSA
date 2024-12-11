package Arrays;
import java.util.*;
public class search_in_sorted_array_II {
    public static void main(String[] args) {
        int[] nums = {9,8,4,6,2,0,1,5,6,3,2,0,0,0,1,5,7,8,9};
        int target = 8;
        System.out.println(search(nums, target));
    }
    static public boolean search(int[] nums, int target) {
        int[] arr = nums.clone();
        Arrays.sort(arr);

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == target){
                return true;
            }

            if(arr[mid] < target){
                end = mid + 1;
            }else{
                start = mid - 1;
            }
        }
        return false;
    }
}
