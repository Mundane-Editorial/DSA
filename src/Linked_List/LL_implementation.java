package Linked_List;

public class LL_implementation {

    Node head;
    static int size;

    LL_implementation(){
        this.size = 0;
    }
    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add = addfirst, addlast
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //printlist
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void delFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;

    }

    //delete last
    public void delLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public static void main(String args[])
    {
        LL_implementation list = new LL_implementation();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();

        list.addLast("list");
        list.printList();

        list.delFirst();
        list.printList();

        list.delLast();
        list.printList();

    }
}
