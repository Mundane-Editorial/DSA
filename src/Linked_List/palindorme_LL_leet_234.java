package Linked_List;

public class palindorme_LL_leet_234 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
//        palindorme_LL_leet_234 pll = new palindorme_LL_leet_234();

        // Create a sample linked list 1->2->2->1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        // Check if the linked list is a palindrome
        boolean result = isPalindrome(head);
        System.out.println("Is palindromic LinkedList :: " + result);
    }

    private static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;

        ListNode middleNode = findMiddle(head);
        ListNode secondHalf = reverse(middleNode.next);

        ListNode firstHalf = head;
        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val){
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private static ListNode findMiddle(ListNode head) {  //turtle and hare approach : agr turtle 1 se chlega toh hare 2 se chlega : basically pointers hi hai
        ListNode turtle = head;
        ListNode hare = head;
        while(hare.next != null && hare.next.next != null){
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return turtle;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


}
