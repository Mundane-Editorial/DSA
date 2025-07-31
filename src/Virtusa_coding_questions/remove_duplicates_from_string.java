package Virtusa_coding_questions;

import java.util.HashSet;

public class remove_duplicates_from_string {
    public static void main(String[] args) {
        String str = "racecar";

        System.out.println(remove_duplicates(str));
    }

    private static String remove_duplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();

//        String res = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(set.add(ch)){
//                res = res + ch;
                res.append(ch);
            }
        }

        return res.toString();
    }
}
