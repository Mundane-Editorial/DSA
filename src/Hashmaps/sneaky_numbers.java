package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class sneaky_numbers {
    public static void main(String[] args) {
        int[] nums = {0,1,1,0};

        System.out.println(getSneakyNumbers(nums));
    }

    private static int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+ 1);
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                res.add(key);
            }
        }

        int[] result = new int[res.size()];

        for(int i=0; i<result.length; i++){
            result[i] = res.get(i);
        }

        return result;
    }
}
