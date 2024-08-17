package Random_Questions;

import java.util.Scanner;

public class Maximum_number_of_points_with_cost_1937 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] points = {{1,2,3},{1,5,1},{3,1,1}};
        System.out.println(maxPoints(points));
    }
    private static long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;

        long totalPoints = 0;
        int[] maxPoints = new int[m];
        int[] maxIndices = new int[m];

        for (int i = 0; i < m; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (points[i][j] > max) {
                    max = points[i][j];
                    maxIndices[i] = j;
                }
            }
            maxPoints[i] = max;
            totalPoints += max;
        }

        long totalCost = 0;
        for (int i = 1; i < m; i++) {
            int previousMaxIndex = maxIndices[i - 1];
            int currentMaxIndex = maxIndices[i];

            long moveCost = Math.abs(previousMaxIndex - currentMaxIndex);
            totalCost += moveCost;
        }

        return totalPoints - totalCost;

    }
}
