package Random_Questions;

import java.util.*;
public class hand_of_straights {
    public static void main(String args[]){
        int[] hand = {5, 1};
        int groupSize = 1;
        System.out.println(isNStraightHand(hand, groupSize));
    }

    private static boolean isNStraightHand(int[] hand, int groupSize) {
        int size = hand.length;

        if (size % groupSize != 0) {
            return false;
        }

        Arrays.sort(hand);

        for (int i = 0; i < size; i++) {
            if (hand[i] >= 0) {
                if (!findSequence(hand, groupSize, i, size)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean findSequence(int[] hand, int groupSize, int i, int size) {
        int current = hand[i] + 1;
        hand[i] = -1;
        int count = 1;
        i++;

        while (i < size && count < groupSize) {
            if (hand[i] == current) {
                current = hand[i] + 1;
                hand[i] = -1;
                count++;
            }

            i++;
        }

        if (count != groupSize) {
            return false;
        } else {
            return true;
        }
    }
}
