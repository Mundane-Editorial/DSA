package Stacks;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.HashMap;

public class next_greater_leet_469 {

    public static void main(String args[]){
        int[] nums1 = {3,1,5,7,9,2,6};
        int[] nums2 = {1,2,3,5,6,7,9,11};

        List<Integer> result = nextgreater(nums1, nums2);
        System.out.println(result);
    }

    private static List<Integer> nextgreater(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int res = Integer.MIN_VALUE;

        int l = nums2.length;
        for(int i=l-1; i>=0; i--){
            int element = nums2[i];
            while(!s.isEmpty() && s.peek()<=element){
                s.pop();
            }
            if(s.empty())
            {
                res = -1;
            }else {
                res = s.peek();
            }
            map.put(element, res);
            s.push(element);
        }
        List<Integer> ans = new ArrayList<>();
        for (int x : nums1) {
            ans.add(map.get(x));
        }
        return ans;
    }
}
