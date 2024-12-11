package Arrays;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps: " + jump(nums));
    }

    public static int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;  // The farthest index you can reach with the current jump
        int farthest = 0;    // The farthest index you can reach from any index in the current range

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest position you can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we've reached the end of the current jump range
            if (i == currentEnd) {
                jumps++;  // Make a jump
                currentEnd = farthest;  // Update the range to the farthest we can reach

                // If currentEnd reaches or exceeds the last index, we're done
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
