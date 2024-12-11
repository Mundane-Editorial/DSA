package Arrays;
import java.util.*;
public class majority_element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2,3,3};
        System.out.println(majority(nums));
    }

    private static int majority(int[] nums) {
        int count = 0;
        int freq = 0;

        for(int num : nums){
            if(count == 0){
                freq = num;
            }
            if(num == freq){
                count += 1;
            }else{
                count += -1;
            }
        }

        count = 0;
        for(int num : nums){
            if(num == freq){
                count++;
            }
        }

        if(count > nums.length/2){
            return freq;
        }

        return -1;
    }
}
