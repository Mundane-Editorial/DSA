package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class operations_to_make_distinct {
    public static void main(String[] args) {
        int[] nums = {6,7,8,9};
        System.out.println(minimumOperations(nums));
    }

    static public int minimumOperations(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }

        int operations = 0;
        while (!hasdistinctelements(list)) {
            for (int i = 0; i < 3; i++) {
                if (!list.isEmpty()) {
                    list.remove(0);
                }
                operations++;
            }
        }

        return operations/3;
    }

    public static boolean hasdistinctelements(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}
