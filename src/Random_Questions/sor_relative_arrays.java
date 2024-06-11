package Random_Questions;

import java.util.Arrays;

public class sor_relative_arrays {
    private static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        int[] ans = new int[arr1.length];
        int ansIndex = 0;
        for(int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }

        for(int i = 0; i < arr2.length; i++) {
            while(count[arr2[i]]-- > 0) {
                ans[ansIndex++] = arr2[i];
            }
        }

        for(int i = 0; i < count.length; i++) {
            while(count[i]-- > 0) {
                ans[ansIndex++] = i;
            }
        }

        return ans;
    }

    public static void main(String args[]){
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
}
