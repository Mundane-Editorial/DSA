package Recursion;

import com.sun.source.tree.UsesTree;

import java.util.HashSet;

public class uniquesubsequesnce
{
    public static void main(String[] args)
    {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        figsubsequences(str, 0, "", set);
    }

    private static void figsubsequences(String str, int i, String s, HashSet<String> set) {
        if(i == str.length())
        {if(set.contains(s))
        {
            set.add(s);
            return;
        }else {
            System.out.println(s);
            set.add(s);
            return;
        }
        }

        char ch = str.charAt(i);
        //agr vo element rehna chahta hai toh add krenge
        figsubsequences(str, i+1, s+ch, set);

        //agr vo element rehna nahi chahta toh "s" ko aise hi return krwa denge
        figsubsequences(str, i+1, s, set);
    }
}
