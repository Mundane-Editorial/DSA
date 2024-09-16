package SAP_labs;

import java.io.*;

public class rotate_a_matrix {
    public static void main(String[] args) throws IOException {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotatematrix(arr);

        // Printing the rotated matrix
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotatematrix(int[][] arr) {
        int n = arr.length;

        // Step 1: Transpose the matrix in place
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  // Start from i to avoid redundant swapping
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row of the transposed matrix
        for (int i = 0; i < n; i++) {
            reverseRow(arr[i]);
        }
    }

    private static void reverseRow(int[] row) {
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }
}
