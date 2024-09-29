//package contest;
//import java.util.*;
//public class maximum_total_height_of_unique_towers {
//    public static void main(String[] args) {
//        int[] maximumHeight = {2, 2, 1};
//        System.out.println(maximumTotalSum(maximumHeight));
//
//    }
//
//    static public long maximumTotalSum(int[] maximumHeight) {
//        Arrays.sort(maximumHeight);
//
//        long total = maximumHeight[maximumHeight.length - 1];
//
//        for(int i=maximumHeight.length-2; i>=0; i--){
//            if(maximumHeight[i] >= maximumHeight[i+1]){
//                maximumHeight[i] = Math.max(maximumHeight[i+1]-1, 1);
//            }
//            if(maximumHeight[i] == 0){
//                return -1;
//            }
//            total = total + maximumHeight[i];
//        }
//
//        return total;
//    }
//}


package contest;
import java.util.*;

public class maximum_total_height_of_unique_towers {
    public static void main(String[] args) {
        int[] maximumHeight = {2, 2, 1};
        System.out.println(maximumTotalSum(maximumHeight));
    }

    static public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight); // Sort the array in ascending order

        long total = maximumHeight[maximumHeight.length - 1]; // Start with the last (largest) element

        for (int i = maximumHeight.length - 2; i >= 0; i--) {
            // Reduce height to make it unique but not below 1
            if (maximumHeight[i] >= maximumHeight[i + 1]) {
                maximumHeight[i] = Math.max(maximumHeight[i + 1] - 1, 1);
            }

            // If after adjustment, the height is 0 or less, return -1 (impossible to assign unique positive heights)
            if (maximumHeight[i] == 0) {
                return -1;
            }

            total += maximumHeight[i]; // Add the height to the total
        }

        return total; // Return the total maximum height sum
    }
}