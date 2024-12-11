package Arrays;

public class jump_game {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canreachend(nums));
    }

    private static boolean canreachend(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(i > max){
                return false;
            }
            max = Math.max(max, nums[i] + i);
            if(max >= nums.length){
                break;
            }
        }
        return true;
    }
}
