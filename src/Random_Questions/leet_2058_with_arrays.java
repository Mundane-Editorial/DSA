package Random_Questions;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class leet_2058_with_arrays {
    public static void main(String args[]) throws IOException{
        int[] arr = {5,3,1,2,5,1,2};
        System.out.println(calculate(arr));
    }

    private static int[] calculate(int[] arr) {
        ArrayList<Integer> templist = new ArrayList<>();
        int[] res = new int[2];
        int l = arr.length;

        int[] min = minima(arr);
        int[] max = maxima(arr);

        System.arraycopy(max, 0, min, 0, Math.min(max.length, min.length));

        Arrays.sort(min);
        res[0] = min[min.length-1] - min[min.length-2];
        res[1] = min[min.length-1] - min[0];

        return res;
    }

    private static int[] minima(int[] arr) {
        int l = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<l-1; i++){
            if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        for(int j=0;j<res.length;j++){
            res[j] = list.get(j);
        }
        return res;
    }

    private static int[] maxima(int[] arr) {
        int l = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<l-1; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        for(int j=0;j<res.length;j++){
            res[j] = list.get(j);
        }
        return res;
    };
}
