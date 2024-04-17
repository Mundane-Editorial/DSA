//package Recursion;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class allpossiblepermutations
//{
//    public static void main(String args[])
//    {
//        List<String> list = new ArrayList<>();
//        String str  = "abc";
//        possibecombination(str, 0, "",  list);
//    }
//
//    private static void possibecombination(String str, int i, String s, List<String> list) {
//        if(i == str.length())
//        {
//            if(s.length() == str.length()-1)
//            {
//                list.add(s);
//                return;
//            }
//        }
//
//        char ch = str.charAt(i);
//        possibecombination(str, i+1, s+ch, list);
//        possibecombination(str, i+1, s, list);
//
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class allpossiblepermutations{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str = "abc";
        possibleCombinations(str, 0, "", list);
        for (String permutation : list) {
            System.out.println(permutation);
        }
    }

    private static void possibleCombinations(String str, int index, String current, List<String> list) {
        if (index == str.length()) {
            list.add(current);
            return;
        }

        char ch = str.charAt(index);
        // Include current character
        possibleCombinations(str, index + 1, current + ch, list);
        // Exclude current character
        possibleCombinations(str, index + 1, current, list);
    }
}
