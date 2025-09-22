package Arrays;

import java.util.Arrays;

public class two_integer_sum_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 3;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length-1;

        while(first < last){

            if(numbers[first] + numbers[last] == target){
                return new int[]{first+1, last+1};
            }

            if(numbers[first] + numbers[last] > target){
                last--;
                System.out.println("last"+last);
            }else{
                first++;
            }
        }
        return new int[]{-1, -1};
    }
}
