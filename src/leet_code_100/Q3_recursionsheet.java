package leet_code_100;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]

*/
//public class Q3_recursionsheet {
//    public static void main(String args[])
//    {
//        int[] nums = {1,2,3} ;
//        List<List<Integer>> subsets = subsets(nums);
//        System.out.println(subsets);
//    }
//
//    private static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        generateSubsets(nums, 0, new ArrayList<>(), result);
//        return result;
//    }
//
//    private static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
//        // Add the current subset to the result
//        if(current.size() == nums.length)
//        result.add(new ArrayList<>(current));
//
//        // Iterate through remaining elements
//        for (int i = index; i < nums.length; i++) {
//            // Include the current element in the subset
//            current.add(nums[i]);
//
//            // Recur for the next index
//            generateSubsets(nums, i + 1, current, result);
//
//            // Exclude the current element from the subset
//            current.remove(current.size() - 1);
//        }
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class Q3_recursionsheet {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);
        System.out.println(permutations);
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(nums, new ArrayList<>(), result);
        return result;
    }

    private static void generatePermutations(int[] nums, List<Integer> current, List<List<Integer>> result) {
        // If current permutation is of full length, add to result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Iterate through the array elements
        for (int i = 0; i < nums.length; i++) {
            // Skip elements that are already in the current permutation
            if (current.contains(nums[i])) {
                continue;
            }

            // Add current element to the permutation
            current.add(nums[i]);

            // Recursively generate permutations with the current element added
            generatePermutations(nums, current, result);

            // Remove the last added element for next iteration
            current.remove(current.size() - 1);
        }
    }
}
