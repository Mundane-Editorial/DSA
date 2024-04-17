package Random_Questions;
import java.io.*;
import java.util.Arrays;

public class codetantrawalaquestion {
    public static void main (String args[])throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(buf.readLine());
        }
        int key = Integer.parseInt(buf.readLine());

        int res[] = greatest(arr, key);
        System.out.println(Arrays.toString(res));
    }

    private static int[] greatest(int[] arr, int key) {
        int[] res = new int[arr.length - key + 1];
        for (int i = 0; i <= arr.length - key; i++) {
            int maxInWindow = Integer.MIN_VALUE;
            for (int j = i; j < i + key; j++) {
                if (arr[j] > maxInWindow) {
                    maxInWindow = arr[j];
                }
            }
            res[i] = maxInWindow;
        }
        return res;
    }
}
