package Leet_75;

public class increasing_triplet_subsequence {
    private static boolean increasingTriplet(int[] nums) {
        int i=0;
        int j=1;
        int k=2;

        for(int index=0;index<nums.length-2;index++){
            if(nums[i]<nums[j]){
                if(nums[j]<nums[k]){
                    return true;
                }
            }

            i++;
            j++;
            k++;
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums = {2,1,5,0,4,6};
        boolean res = increasingTriplet(nums);
        System.out.println(res);
    }
}
