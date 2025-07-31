package interview_top_150_leetcode;

public class jump_game {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4,5};
        System.out.println(canjump(nums));
    }

    private static boolean canjump(int[] nums) {
        int max = 0;

        for(int i=0; i< nums.length; i++){
            if(i > max){
                return false;
            }

            max = Math.max(max, i + nums[i]);

            if(max >= nums.length-1){
                break;
            }
        }

        return true;
    }
}
