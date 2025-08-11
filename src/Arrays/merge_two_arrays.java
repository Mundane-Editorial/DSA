package Arrays;

import java.util.ArrayList;
public class merge_two_arrays {
    public static void main(String[] args) {
        int[] num1 = {2,8,15,18};
        int[] num2 = {5,9,12,17,19};

        System.out.println(merger(num1, num2));
    }

    private static ArrayList<Integer> merger(int[] num1, int[] num2) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;
        int m = num1.length;
        int n = num2.length;

        while (i<m && j<n){
            if(num1[i] < num2[j]){
                res.add(num1[i]);
                i++;
            }else{
                res.add(num2[j]);
                j++;
            }
        }

        while (i < m) res.add(num1[i++]);
        while (j < n) res.add(num2[j++]);

        return res;
    }
}
