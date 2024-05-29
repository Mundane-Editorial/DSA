package Dcpd.DAY_1;

public class sum_of_region {
    public static void main(String args[]){
        int[] heights = {3,5,6};
        System.out.println("Sum of all regions :: " + sum(heights));
    }

    private static int sum(int[] heights) {
        int n = heights.length;
        int res = 0;

        for(int i=0; i<n; i++){
            int max = heights[i];
            int left = i;
            int right = i;

            while(left-1 >= 0 && heights[left-1]<max)
                left--;

            while(right+1 < n && heights[right+1]<max)
                right++;

            res = res + right - left + 1;
        }
        return res;
    }
}
