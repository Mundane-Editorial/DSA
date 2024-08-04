package Random_Questions;

import java.io.*;

public class three_consecutive_odds {
    public static void main(String args[]) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(buf.readLine());
//        int[] arr = new int[n];
//        for(int i =0;i<n;i++){
//            arr[i] = Integer.parseInt(buf.readLine());
//        }
        int[] arr = {1,2,1,1};

        System.out.println(isconsecutive(arr));
    }

    private static boolean isconsecutive(int[] arr) {
        int length = arr.length;
        int count = 0;
        for(int i=0; i<length; i++){
            if(arr[i]%2 != 0){
                count++;
                if(count == 3){
                    return true;
                }
            }else{
                count = 0;
            }

        }
        return false;
    }
}
