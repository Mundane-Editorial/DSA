package Recursion;

import java.util.ArrayList;

public class permutations {
    public static void main(String args[])
    {
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        allpermutations(str, "", list);
        System.out.println(list.toString());
    }

    private static void allpermutations(String str, String s, ArrayList<String> list) {
        if(str.length() == 0)
        {
            System.out.println(s);
            list.add(s);
            return;
        }
        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            String newstring = str.substring(0, i) + str.substring(i+1);
            allpermutations(newstring, s+ch, list);
        }
    }
}
