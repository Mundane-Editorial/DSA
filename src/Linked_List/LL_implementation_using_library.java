package Linked_List;

import java.util.LinkedList;

public class LL_implementation_using_library {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("String List");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("NULL");
        //to doelete/
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
