package Random_Questions;

public class thoms_number {
    public static void main(String[] args) {
        //    int n = 3;
        int[] nums = {211};
        System.out.println(findSum(nums));
    }

    private static long findSum(int[] nums) {
        long res = 0;
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            int powdigits = temp/10;     // power digits
            int pow = 0;
            temp = temp/10;
            while(powdigits!=-1){
                pow = (temp%10) + pow*10; // finding powers
                temp = temp/10;
                powdigits--;
            }
            res += Math.pow(temp, pow);
        }
        return res;
    }
}


// wrong ouotput