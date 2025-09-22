package ALGORITHMS;

import java.util.Arrays;
public class dutch_national_flag_algorithm {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,2,2,1,1,1,1,0,2,0,0,1,1,2,2,0,0};
//        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(algo(arr)));
    }

    private static int[] algo(int[] arr) {
        int first = 0;
        int mid = 0;
        int last = arr.length - 1;

        while(mid <= last){
            if(arr[mid] == 0){
                swap(arr, first, mid);
                first++;
                mid++;
            }else if(arr[mid] == 2){
                swap(arr, mid, last);
                last--;
            }else if(arr[mid] == 1){
                mid++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
