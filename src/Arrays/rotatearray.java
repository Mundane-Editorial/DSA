package Arrays;

import java.io.IOException;
import java.util.Arrays;
class rotatearray {
    public static void main(String args[])throws IOException{
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("after before by k elements" + Arrays.toString(nums));
        rotate(nums, k);

        System.out.println("after rotating by k elements" + Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
    k=k % nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);

    }

    public static void reverse(int[] nums, int i, int j)
    {
        while(j>i)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}


/*approach used
nums[] = {1,2,3,4,5,6,7};
k=3;

therefore,
step - 1 : rotate whole array
step - 2 : rotate array till k-1 position using 2 pointer;
step - 3 : rotate array from k position to length - 1 position;
 */