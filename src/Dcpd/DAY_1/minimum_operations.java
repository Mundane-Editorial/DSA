package Dcpd.DAY_1;

import java.util.HashMap;
public class minimum_operations {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        int minOperations = minOperations(nums);
        System.out.println(minOperations);
}

    private static int minOperations(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int operations = 0;

        while (!countMap.isEmpty()) {
            boolean foundPair = false;
            boolean foundTriplet = false;

            for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int count = entry.getValue();
                if (count >= 2) {
                    entry.setValue(count - 2);
                    foundPair = true;
                    if (count - 2 == 0) {
                        countMap.remove(entry.getKey());
                    }
                    break;
                }
            }

            for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int count = entry.getValue();
                if (count >= 3) {
                    entry.setValue(count - 3);
                    foundTriplet = true;
                    if (count - 3 == 0) {
                        countMap.remove(entry.getKey());
                    }
                    break;
                }
            }
            if (!foundPair && !foundTriplet) {
                break;
            }
            operations++;
        }
        if (!countMap.isEmpty()) {
            return -1;
        }
        return operations;
    }
}
