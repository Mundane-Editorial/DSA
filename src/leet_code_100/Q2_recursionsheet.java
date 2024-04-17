//package leet_code_100;   // leet question no 78;
//
//import java.util.ArrayList;
//import java.util.List;
//
///*
//Given an integer array nums of unique elements, return all possible
//subsets
// (the power set).
//
//The solution set must not contain duplicate subsets. Return the solution in any order.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//Example 2:
//
//Input: nums = [0]
//Output: [[],[0]]
// */
//public class Q2_recursionsheet {
//    public static void main(String args[])
//    {
//        List<List<Integer>> listoflist = new ArrayList<>();
//        List<Integer> innerList = new ArrayList<>();
//        listoflist.add(innerList);
//        String nums = "123";
//        pattern(nums, 0, "");
//    }
//
//    private static void pattern(String nums, int i, String s) {
//        if(i==nums.length())
//        {
//            System.out.println(s);
//            return;
//        }
//
//        char ch = nums.charAt(i);
//        pattern(nums, i+1 , s+ch);
//        pattern(nums, i+1 , s);
//
//    }
//}


import java.util.ArrayList;
import java.util.List;

public class Q2_recursionsheet {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Iterate through remaining elements
        for (int i = index; i < nums.length; i++) {
            // Include the current element in the subset
            current.add(nums[i]);

            // Recur for the next index
            generateSubsets(nums, i + 1, current, result);

            // Exclude the current element from the subset
            current.remove(current.size() - 1);
        }
    }
}

// ook ... toh is wale question mai ye pta hai ki approach kya hai lekin ye ni pta ki list inside a list ko kaise solve krna hai
// i mean ye ni pta ni list k andr jo list hoti hai usko kaise access krna hai baaki isa normal se solution toh nikal diya tha maine upr cjo comments mai hai.

// time complexity : O(n * 2^n)