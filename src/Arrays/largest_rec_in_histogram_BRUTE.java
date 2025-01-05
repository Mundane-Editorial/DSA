package Arrays;

public class largest_rec_in_histogram_BRUTE {
    private int calculatemaxarea(int[] heights){
        int n = heights.length;
        int maxarea = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int minheight = Integer.MAX_VALUE;

                for(int k=i; k<=j; k++){
                    minheight = Math.min(minheight, heights[k]);
                }

                int width = j - i + 1;
                maxarea = Math.max(maxarea, minheight * width);
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        largest_rec_in_histogram_BRUTE obj = new largest_rec_in_histogram_BRUTE();
        int[] heights = {2,1,5,6,2,3};
        System.out.println(obj.calculatemaxarea(heights));
    }
}

/*
* time complexity : O(n^3)
* */