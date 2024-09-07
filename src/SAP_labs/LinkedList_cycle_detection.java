package SAP_labs;

import Linked_List.Linked_list_cycle_leet_141;

public class LinkedList_cycle_detection {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    private static boolean isCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode turtle = head;
        ListNode hare = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(turtle == hare){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         ListNode head = new  ListNode(3);
        head.next = new  ListNode(2);
        head.next.next = new  ListNode(0);
        head.next.next.next = new  ListNode(-4);

        head.next.next.next.next = head.next;

        System.out.println(isCycle(head));
    }

}
