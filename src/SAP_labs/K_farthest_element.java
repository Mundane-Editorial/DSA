package SAP_labs;
import java.util.*;
public class K_farthest_element {
    public static void main(String[] args) {
        int len = 5, k=3, x=20;
        int[] arr = {21, 4, 15, 17, 11};

        System.out.println("K farthest elements:: " + farthest(arr, len, k, x));
        System.out.println("K nearest elements :: " + K_nearest_elements(arr, len, k, x));

    }

    private static int farthest(int[] arr, int len, int k, int x) {
        return 0;
    }

    private static int K_nearest_elements(int[] arr, int len, int k, int x) {
        int[] temp = new int[len];

        for(int i=0; i<len; i++){
            temp[i] = Math.abs(x - arr[i]);
        }
        Arrays.sort(temp);
        int sum = 0;
        for(int j=0; j<k; j++){
            sum += temp[j];
        }
        return sum;
    }
}
