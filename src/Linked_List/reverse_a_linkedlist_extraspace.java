package Linked_List;

import java.util.LinkedList;

public class reverse_a_linkedlist_extraspace {
    public static void main(String args[]){
        LinkedList<String> list1 = new LinkedList<>();
        list1.addFirst("list");
        list1.addFirst("is");
        list1.addFirst("this");
        reverselist(list1);
    }

    private static void reverselist(LinkedList<String> list1) {
        LinkedList<String> temp = new LinkedList<>();
        for(int i=list1.size()-1;i>=0;i--)
        {
            temp.add(list1.get(i));
            list1.remove(i);
        }
        System.out.println(temp);
        System.out.println(list1);
    }
}
