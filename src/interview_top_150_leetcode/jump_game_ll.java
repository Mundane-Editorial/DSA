package interview_top_150_leetcode;

public class jump_game_ll {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(maxJumps(nums));
    }

    private static int maxJumps(int[] nums) {
        int farthest = 0;
        int current = 0;
        int jump = 0;

        for(int i=0; i<nums.length; i++){
            farthest = Math.max(farthest, i+nums[i]);

            if(i == current){
                jump++;
                current = farthest;

                if(current >= nums.length-1){
                    break;
                }
            }
        }
        return jump;
    }
}
