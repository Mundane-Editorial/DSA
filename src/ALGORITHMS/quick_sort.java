package ALGORITHMS;

import java.util.*;
public class quick_sort {
    public static void main(String[] args) {
        int[] nums = {10,16,8,12,15,6,3,9,5};
        System.out.println(Arrays.toString(Quicksort(nums, 0, nums.length-1)));
    }

    private static int[] Quicksort(int[] nums, int low, int high) {
        if(low < high){
            int j = partition(nums, low, high);
            Quicksort(nums, low, j);
            Quicksort(nums, j+1, high);
        }
        return nums;
    }

    private static int partition(int[] nums, int low, int high) {
        int i=low-1;
        int j=high+1;
        int pivot = nums[low];

        while(i < j){
            do{
                i++;
            }while(nums[i] <= pivot);

            do{
                j--;
            }while(nums[j] > pivot);

            if(i < j){
                swap(nums, i, j);
            }
        }
        swap(nums, low, j);

        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
