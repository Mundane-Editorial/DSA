package Random_Questions;

public class leet_1608_special_array {
    public static void main(String[] args){
        int[] nums = {0,4,3,0,4};
        int res = specialArray(nums);
        System.out.println(res);
    }

    private static int specialArray(int[] nums) {
        int l = nums.length;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != 0)
                if(nums[i] >= l )
                    return l;
            else
                l--;

        }

        return -1;
    }
}
