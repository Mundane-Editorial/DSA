package Recursion_tute_striver;

import java.util.Arrays;
public class reverse_an_array {
    public static void main(String[] args) {
        int[] arr = {8,9,4,5,7,6,2,1,3,0,2,56,3};
        System.out.println(Arrays.toString(reverse(arr, 0, arr.length-1))); // using 2 variables
        System.out.println(Arrays.toString(reversesinglevariable(arr, 0))); // using single variables
    }

    private static int[] reversesinglevariable(int[] arr, int i) {
        if(i >= arr.length/2){
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        return reversesinglevariable(arr, i+1);
    }

    private static int[] reverse(int[] arr, int start, int end) {     // using  2 variables
        if(start >= end){
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverse(arr, start+1, end-1);
    }
}
