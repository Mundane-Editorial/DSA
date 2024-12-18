package Recursion_tute_striver;

import java.util.Arrays;
public class reverse_an_array {
    public static void main(String[] args) {
        int[] arr = {8,9,4,5,7,6,2,1,3,0,2,56,3};
        System.out.println(Arrays.toString(reverse(arr, 0, arr.length-1)));
    }

    private static int[] reverse(int[] arr, int start, int end) {
        if(start >= end){
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverse(arr, start+1, end-1);
    }
}
