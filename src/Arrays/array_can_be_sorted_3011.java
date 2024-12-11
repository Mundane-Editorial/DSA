package Arrays;

public class array_can_be_sorted_3011 {
    public static void main(String[] args) {
        int[] nums = {8,4,2,30,15};
        System.out.println(canSortArray(nums));
    }

    private static boolean canSortArray(int[] nums) {
        int[] binaryLengths = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            binaryLengths[i] = countSetBits(nums[i]);
        }

        for (int i = 1; i < binaryLengths.length; i++) {
            if (binaryLengths[i] < binaryLengths[i - 1]) {
                return false;
            }
        }

        return true;
    }

//    private static int getBinaryLength(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        int len = 0;
//        while (n != 0) {
//            n = n / 2;
//            len++;
//        }
//        return len;
//    }
    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Increment count if the last bit is 1
            n >>= 1; // Right shift to check the next bit
        }
        return count;
    }
}
