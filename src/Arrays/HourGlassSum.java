package Arrays;

public class HourGlassSum {
    public static int findMaxHourglassSum(int[][] matrix) {
        int n = matrix.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                int currentSum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]
                        + matrix[i+1][j+1]
                        + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 0, 0},
                {0, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 2, 4, 4},
                {0, 0, 0, 2, 0}
        };

        int maxSum = findMaxHourglassSum(matrix);
        System.out.println("Maximum hourglass sum: " + maxSum);
    }
}
