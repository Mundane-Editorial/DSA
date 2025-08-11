package ALGORITHMS;

import java.util.Arrays;
public class merge_sort {
    public static void main(String[] args) {
        int[] nums = {4,9,5,1,2,6,4,7,8,4,5,12,6,9,5,1,2,58,6,10};
        int low = 0;
        int high = nums.length - 1;
        System.out.println(Arrays.toString(mergeSort(nums, low, high)));
    }

    private static int[] mergeSort(int[] nums, int low, int high) {
        if(low < high){
            int mid = low + (high - low)/2;

            mergeSort(nums, low, mid);
            mergeSort(nums, mid+1, high);

            merge(nums, low, mid, high);
        }
        return nums;
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        int[] temp = new int[high - low + 1];
        int k = 0;

        while(i<=mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i];
                i++;
            }else{
                temp[k++] = nums[j];
                j++;
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=high){
            temp[k++] = nums[j++];
        }

        for(int t=0; t< temp.length; t++){
            nums[low + t] = temp[t];
        }
    }
}
