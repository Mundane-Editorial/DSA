package usthaan;

import java.util.*;
public class rotate_array_by_k {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 6;

        System.out.println(Arrays.toString(rotateRight(arr, k)));
    }

    private static int[] rotateRight(int[] arr, int k) {
        swap(arr, 0, arr.length-1);
        swap(arr, 0, k-1);
        swap(arr, k, arr.length -1);

        return arr;
    }

    private static void swap(int[] arr, int first, int last) {
        while(first <= last){
            int temp = arr[first];
            arr[first++] = arr[last];
            arr[last--] = temp;
        }
    }
}
