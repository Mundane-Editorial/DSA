package Arrays;

import java.util.*;
public class h_index {
    public static void main(String[] args) {
        int[] collections = {3,0,6,1,5};
        System.out.println(hindex(collections));
    }

    private static int hindex(int[] collections) {
        Arrays.sort(collections);

        int n = collections.length;

        for(int i=0; i<collections.length; i++){
            if(collections[i] >= n-i){
                return n-i;
            }
        }
        return 0;
    }
}
