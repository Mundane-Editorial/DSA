package Random_Questions;

import java.util.Scanner;

public class roller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] coasters = new int[n][3];
        for (int i = 0; i < n; i++) {
            coasters[i][0] = scanner.nextInt();
            coasters[i][1] = scanner.nextInt();
            coasters[i][2] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] times = new int[q];
        for (int i = 0; i < q; i++) {
            times[i] = scanner.nextInt();
        }

        for (int i = 0; i < q; i++) {
            System.out.println(getMaxFun(coasters, times[i]));
        }
    }

    private static int getMaxFun(int[][] coasters, int time) {
        int maxFun = 0;
        for (int i = 0; i < coasters.length; i++) {
            int currentFun = 0;
            int currentTime = 0;
            int k = 1;
            while (currentTime + coasters[i][2] <= time) {
                currentFun += coasters[i][0] - (k - 1) * (k - 1) - coasters[i][1];
                currentTime += coasters[i][2];
                k++;
            }
            maxFun = Math.max(maxFun, currentFun);
        }
        return maxFun;
    }
}