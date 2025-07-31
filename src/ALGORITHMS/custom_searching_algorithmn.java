package ALGORITHMS;

public class custom_searching_algorithmn {
    public static void main(String[] args) {
        int[] nums = {3, 7, 12, 18, 21, 25, 29, 34, 38, 41, 45, 49, 53, 57, 61, 65, 70, 75, 80, 85};
        int key = 62;
        boolean isSorted = true;

        System.out.println(find(nums, key, isSorted));
    }

    private static boolean find(int[] nums, int key, boolean isSorted) {
        if(nums == null || nums.length <= 0){
            return false;
        }

        int n = nums.length;

        if(isSorted){
            int step = (int) Math.sqrt(n);
            int prev = 0;

            //jump
            while(prev < n && nums[Math.min(step, n) - 1] < key){
                prev = step;
                step += (int) Math.sqrt(n);
                if(prev >= n){
                    return false;
                }
            }

            //binary search into block
            int low = prev;
            int high = Math.min(step, n) - 1;

            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] == key){
                    return true;
                }
                if(nums[mid] > key){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}
