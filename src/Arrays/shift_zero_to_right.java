package Arrays;

import java.util.Arrays;

public class shift_zero_to_right {
    public static void main(String[] args) {
        int[] arr = {4, 6, 0, 6, 6, 0, 36, 1, 0, 6, 5, 6, 0, 3, 2, 6, 0, 3, 1, 6, 0};
        System.out.println(Arrays.toString(shift(arr)));
    }

    private static int[] shift(int[] arr) {
        int nonZeroIndex = 0; // Pointer for the position of non-zero elements

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }

        return arr;
    }
}
