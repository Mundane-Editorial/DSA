package Dcpd.DAY_1;

public class minimum_taps {
    public static void main(String[] args) {
        int n = 5;
        int[] ranges = {3, 4, 1, 1, 0, 0};
        int minTaps = minTaps(n, ranges);
        System.out.println("Minimum number of taps to be opened is " + minTaps);
    }

    public static int minTaps(int n, int[] ranges) {
        int[] intervals = new int[n + 1];
        for (int i = 0; i < ranges.length; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);
            intervals[left] = Math.max(intervals[left], right - left);
        }

        int taps = 0;
        int maxReach = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            maxReach = Math.max(maxReach, i + intervals[i]);
            if (i == end) {
                if (maxReach <= i) return -1;
                taps++;
                end = maxReach;
            }
        }

        return taps;
    }
}
