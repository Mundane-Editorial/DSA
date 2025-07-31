package Virtusa_coding_questions;
import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {4,9,5,1,3,6,4,1,6,1,6,1};

        System.out.println(Arrays.toString(reverse(arr)));
    }

    private static int[] reverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while(last > first){
            arr[first] = arr[first] ^ arr[last];
            arr[last]  = arr[first] ^ arr[last];
            arr[first] = arr[first++] ^ arr[last--];
        }

        return arr;
    }
}
