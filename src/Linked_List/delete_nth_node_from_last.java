package Linked_List;

import java.util.LinkedList;

public class delete_nth_node_from_last {
    public LinkedList<Integer> removeNthFromEnd(LinkedList<Integer> list, int n) {
        if (list.size() == 1) {
            return new LinkedList<>();
        }

        int size = list.size();

        if (n == size) {
            list.removeFirst();
            return list;
        }

        int indexToRemove = size - n;
        list.remove(indexToRemove);

        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(6);

        int n = 3;

        delete_nth_node_from_last solution = new delete_nth_node_from_last();
        LinkedList<Integer> newList = solution.removeNthFromEnd(list, n);

        for (int val : newList) {
            System.out.print(val + " ");
        }
    }
}


//leetcode : 19
/*
  class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }

        int size = 0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            size++;
        }

        if(n==size){
            return head.next;
        }


        int indextosearch = size-n;
        ListNode prev = head;
        int i=1;
        while(i < indextosearch){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
}
*
* */