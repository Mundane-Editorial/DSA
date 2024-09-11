package Random_Questions;

import java.util.Arrays;

public class Tournament {

    public static int findCapableWinners(int[] power_a, int[] power_b, int[] power_c) {
        int n = power_a.length;
        int[][] players = new int[n][3];

        // Combine the power boosters into a single array for each player
        for (int i = 0; i < n; i++) {
            players[i][0] = power_a[i];
            players[i][1] = power_b[i];
            players[i][2] = power_c[i];
            Arrays.sort(players[i]); // Sort each player's boosters
        }

        int capableCount = 0;

        // Check each player against all others
        for (int i = 0; i < n; i++) {
            boolean canDefeatAll = true;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (!canDefeat(players[i], players[j])) {
                        canDefeatAll = false;
                        break;
                    }
                }
            }

            if (canDefeatAll) {
                capableCount++;
            }
        }

        return capableCount;
    }

    private static boolean canDefeat(int[] playerX, int[] playerY) {
        int wins = 0;

        // Compare sorted power boosters
        for (int k = 0; k < 3; k++) {
            if (playerX[k] > playerY[k]) {
                wins++;
            }
        }

        // Player X can defeat Player Y if they win at least 2 out of 3 rounds
        return wins >= 2;
    }

    public static void main(String[] args) {
        // Sample Input
        int[] power_a = {3, 4, 1, 16};
        int[] power_b = {2, 11, 5, 6};
        int[] power_c = {8, 7, 9, 10};

        // Function Call
        int result = findCapableWinners(power_a, power_b, power_c);
        System.out.println(result); // Output: 2
    }
}



// glt hai iska answer .. dekhna pdega kya scene hai
