package binary_search_algo;

public class find_peak_element {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,7,8,9,8,7,6,4};

        System.out.println(findPeakElement(nums));
    }

    private static int findPeakElement(int[] nums) {
        if(nums.length < 2){
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(low == high){
                return mid;
            }

            if(nums[mid] < nums[mid + 1]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return 0;
    }
}
