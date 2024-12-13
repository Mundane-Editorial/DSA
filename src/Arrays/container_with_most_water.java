package Arrays;

public class container_with_most_water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    static public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int first = 0;
        int last = height.length - 1;

        while (first < last) {
            int area = Math.min(height[first], height[last]) * (last - first);
            max = Math.max(area, max);

            if (height[first] < height[last]) {
                first++;
            } else {
                last--;
            }
        }
        return max;
    }
}
