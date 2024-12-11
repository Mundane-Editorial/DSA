package Random_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinPacking {

    public static int binPacking(int[] weights, int binCapacity) {
        // Sort items in decreasing order
        List<Integer> weightList = new ArrayList<>();
        for (int weight : weights) {
            weightList.add(weight);
        }
        Collections.sort(weightList, Collections.reverseOrder());

        // List to keep track of remaining capacity in each bin
        List<Integer> bins = new ArrayList<>();

        // Iterate over each item
        for (int weight : weightList) {
            boolean placed = false;

            // Try to place the item in an existing bin
            for (int i = 0; i < bins.size(); i++) {
                if (bins.get(i) >= weight) {
                    bins.set(i, bins.get(i) - weight);
                    placed = true;
                    break;
                }
            }

            // If the item couldn't be placed in an existing bin, create a new bin
            if (!placed) {
                bins.add(binCapacity - weight);
            }
        }

        // The number of bins used is the size of the bins list
        return bins.size();
    }

    public static void main(String[] args) {
        int[] weights = {4, 8, 1, 4, 2, 1};
        int binCapacity = 10;

        int result = binPacking(weights, binCapacity);
        System.out.println("Minimum number of bins required: " + result);
    }
}

