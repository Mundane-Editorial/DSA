package Arrays;

public class spiral_sort {
    public static void main(String[] args) {
        int[] nums = {1, 10, 14, 20, 18, 12, 5 };
        System.out.println(isspiralsort(nums));
    }

    private static boolean isspiralsort(int[] nums) {
        int n = nums.length-1;
        for(int i=0; i<n/2; i++){
            if(nums[i] <= nums[n - i] && nums[n - i] <= nums[i + 1]){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}


// appraoch : check for 3 indexs at a time , "" 0 : n-1 : 1 ""