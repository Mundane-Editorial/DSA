package Random_Questions;

import java.io.*;
import java.util.Arrays;

class Rotate_Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {12,45,196,46,64,1,61,3,16,1,64,65,32,68,42,21,35,13};
        int n = Integer.parseInt(buf.readLine());

        rotate(arr, n);
        System.out.println(Arrays.toString(arr));

    }

    private static void rotate(int[] arr, int n) {
       n = n % arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, n-1);
        reverse(arr, n, arr.length-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while(j>i)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}