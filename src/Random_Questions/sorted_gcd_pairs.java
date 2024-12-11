package Random_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class sorted_gcd_pairs {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        long[] queries = {0,2,2};

        int[] res = gcdValues(nums, queries);
        System.out.println(Arrays.toString(res));
    }

    private static int[] gcdValues(int[] nums, long[] queries) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length-1; i++){
            list.add(findGCD(nums[i], nums[i+1]));
        }

        Collections.sort(list);
        int[] res = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int qi = (int) queries[i];
            if(qi >= 0 && qi < list.size()){
                res[i] = list.get(qi);
            }else{
                res[i] = -1;
            }
        }

        return res;
    }

    private static int findGCD(int a, int b) {
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
