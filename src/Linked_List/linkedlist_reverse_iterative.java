package Linked_List;

import java.util.LinkedList;

public class linkedlist_reverse_iterative {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("reverse");
        list.add("krna");
        list.add("hai");
        list.add("isko");
        System.out.println("Original List: " + list);
        reverselist(list);
        System.out.println("Reversed List: " + list);
    }

    private static void reverselist(LinkedList<String> list) {
        if (list == null || list.isEmpty() || list.size() == 1) {
            return; // No need to reverse if list is empty or has only one element
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move towards the center of the list
            left++;
            right--;
        }
    }
}
