package Arrays;

import java.util.*;

public class distinct_elements_after_operation {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4};
        int k = 2;

        System.out.println(maxDistinctElements(nums, k));
    }

    private static int maxDistinctElements(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(nums);



        int nextAvailable = Integer.MIN_VALUE; // Start with the smallest possible integer


        for (int num : nums) {

            // Calculate the minimum candidate we can use

            int candidate = Math.max(num - k, nextAvailable);

            // If the candidate is already in the set, we need to find the next available

            while (set.contains(candidate)) {

                candidate++;

            }

            // Add the candidate to the set

            set.add(candidate);

            // Update the next available number

            nextAvailable = candidate + 1; // Increment to ensure distinctness

        }


        return set.size();
    }
}
