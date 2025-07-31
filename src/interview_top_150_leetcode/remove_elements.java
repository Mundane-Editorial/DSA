package interview_top_150_leetcode;

public class remove_elements {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(remove(nums, val));
    }

    private static int remove(int[] nums, int val) {
        int index = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
