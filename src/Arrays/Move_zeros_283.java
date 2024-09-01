package Arrays;
import java.util.Arrays;
public class Move_zeros_283 {
    void movezeros(){
        int[] nums = {0,1,0,3,12,80,20,0,1,0,3,0,95};
        int insertposition = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[insertposition] = nums[i];
                insertposition++;
            }
        }

        while(insertposition < nums.length){
            nums[insertposition] = 0;
            insertposition++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Move_zeros_283 obj = new Move_zeros_283();
        obj.movezeros();
    }
}
