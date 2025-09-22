package usthaan;

public class first_missing_positive_number {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(findNum(nums));
    }

    private static int findNum(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1)/2;


        int sum= 0;
        for(int num : nums){
            if(num < 0){
                num = 0;
            }
            sum += num;
        }

        return expected - sum;

    }
}
