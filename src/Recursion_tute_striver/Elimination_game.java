package Recursion_tute_striver;

import java.util.ArrayList;

public class Elimination_game {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(lastRemaining(n));
    }

    private static int lastRemaining(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        return lastone(list, true);
    }

    static public int lastone(ArrayList<Integer> list, boolean isleft) {
        if (list.size() == 1) {
            return list.get(0);
        }

        ArrayList<Integer> nextRound = new ArrayList<>();

        for (int i = (isleft ? 1 : 0); i < list.size(); i += 2) {
            nextRound.add(list.get(i));
        }

        return lastone(nextRound, !isleft);
    }
}
