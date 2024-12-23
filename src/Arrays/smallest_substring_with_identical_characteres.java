package Arrays;

public class smallest_substring_with_identical_characteres {
        static public int minLength(String s, int numOps) {
            int n = s.length();
            int left = 0;
            int maxLength = n; // Start with the maximum possible length

            // Function to calculate the minimum length of the longest substring
            // after performing the allowed flips
            for (char target : new char[]{'0', '1'}) {
                int flips = 0; // Count of flips needed
                for (int right = 0; right < n; right++) {
                    // If the current character is not the target, we need to flip it
                    if (s.charAt(right) != target) {
                        flips++;
                    }

                    // If flips exceed numOps, shrink the window from the left
                    while (flips > numOps) {
                        if (s.charAt(left) != target) {
                            flips--;
                        }
                        left++;
                    }

                    // Calculate the length of the current valid window
                    maxLength = Math.min(maxLength, right - left + 1);
                }
                // Reset left pointer for the next target character
                left = 0;
            }

            return maxLength;
        }

        public static void main(String[] args) {
            System.out.println(minLength("000001", 1)); // Output: 2
            System.out.println(minLength("0000", 2));   // Output: 1
            System.out.println(minLength("0101", 0));   // Output: 1
        }


}
