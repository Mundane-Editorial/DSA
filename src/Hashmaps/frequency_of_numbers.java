package Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class frequency_of_numbers {
    public static void main(String args[]){
        int[] arr = {1,2,2,2,3,1,4};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Set<Integer> keys = map.keySet();
        int maxFrequency = Integer.MIN_VALUE;
        for (int key : keys) {
            if (map.get(key) > maxFrequency) {
                maxFrequency = map.get(key);
            }
        }

        System.out.println(maxFrequency);

//        for(int key : map.keySet()){
//            if(map.get(key) >= n/3){
//                System.out.println(key);
//            }
//        }


    }
}
