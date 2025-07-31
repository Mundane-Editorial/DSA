package Queues;

import java.util.*;
//import java.util.Arrays;
public class sliding_window_maximum_239 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingwindow(nums, k)));
    }

    private static int[] maxSlidingwindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0){
            return new int[0];
        }

        int n = nums.length-1;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k-1){
                res[i-k+1] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}
