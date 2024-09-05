package SAP_labs;
import java.util.*;
public class Nth_smalles_and_largest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k =3;


        System.out.println(calculate(arr, k));
    }

    private static String calculate(int[] arr, int k) {
        Arrays.sort(arr);
        String res = Integer.toString(arr[k-1]) + " " + Integer.toString(arr[(arr.length) - k]);
        return res;
    }
}
