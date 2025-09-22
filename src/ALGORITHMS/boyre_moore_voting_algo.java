package ALGORITHMS;

public class boyre_moore_voting_algo {
    public static void main(String[] args) {
        int[] nums = {2,2,1,2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;

        for(int num : nums){
            if(count == 0){
                element = num;
            }
            if(num == element){
                count++;
            }else{
                count--;
            }
        }
        return count;
    }
}
