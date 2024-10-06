package Strings;

public class maximum_possible_number_by_string_concatination {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(maxGoodNumber(nums));
    }

    private static int maxGoodNumber(int[] nums) {
        int l = nums.length;
        int maxnum = 0;
        for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                if(i == j){
                    continue;
                }
                for(int k=0; k<l; k++){
                    if(k == i || k == j){
                        continue;
                    }
                    System.out.println("i = "+ i + ": j = "+ j + ": k = "+ k);
                    String str = binarystring(nums[i]) + binarystring(nums[j]) + binarystring(nums[k]);

                    int decimal = Integer.parseInt(str, 2);

                    maxnum = Math.max(maxnum, decimal);
                }
            }
        }
        return maxnum;
    }

    private static String binarystring(int num) {
        StringBuilder str = new StringBuilder();

        if(num == 0){
            return "0";
        }

        while(num>0){
            int rem = num % 2;
            str.append(rem);
            num = num/2;
        }

        return str.reverse().toString();
    }
}
