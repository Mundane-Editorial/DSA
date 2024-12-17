package Arrays;

public class Trapping_rain_water_42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapwater(height));
    }

    private static int trapwater(int[] height) {
        if (height == null || height.length == 0)
            return 0;

        int n = height.length;
        int[] left_max = new int[n];
        int[] right_max = new int[n];

        int ans = 0;

        left_max[0] = height[0];
        for(int i=1; i<n; i++){
            left_max[i] = Math.max(left_max[i-1], height[i]);
        }

        right_max[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            right_max[i] = Math.max(right_max[i+1], height[i]);
        }

        for(int i=0; i<n; i++){
            ans += Math.max(0, Math.min(left_max[i], right_max[i]) - height[i]);
        }

        return ans ;
    }
}
