import java.io.*;
import java.util.Arrays;
class findGCD_leet_1979
{
    public static void main(String args[]) throws IOException{
        int[] nums = {12,4,61,94,21,1,21,87,65,15,23,20,10,5,3,1,66,4,1,5};
        int res = findGCD(nums);
        System.out.println(res);
    }

    static int findGCD(int[] nums)
    {
        Arrays.sort(nums);
        int smallest=nums[0];
        int greatest = nums[nums.length-1];

        int res = number(nums, smallest, greatest);
        return res;
    }

    static int number(int[] nums, int smallest, int greatest)
    {
        while(greatest!=0)
        {
            int temp = greatest;
            greatest = smallest % greatest;
            smallest = temp;
        }
        return smallest;
    }
}