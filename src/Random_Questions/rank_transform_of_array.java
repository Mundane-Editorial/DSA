package Random_Questions;
import java.util.*;
public class rank_transform_of_array {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(arrayRankTransform(arr));
    }

    static public int[] arrayRankTransform(int[] arr) {
        int l = arr.length;

        if(l == 0){
            return new int[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] temp = Arrays.copyOf(arr, l);
        Arrays.sort(temp);
        int rank = 1;
        for(int i : temp){
            if(!map.containsKey(i)){
                map.put(i, rank);
                rank++;
            }
        }

        int[] res = new int[l];

        for(int i=0; i<l; i++){
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}
