package Virtusa_coding_questions;

public class reverse_each_word {
    public static void main(String[] args) {
        String str = "this is test question";

        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String[] arr = str.split(" ");
        StringBuilder res = new StringBuilder();

        for(int i=0; i<arr.length; i++){
//            String temp = wordReverse(arr[i]);
             res.append(wordReverse(arr[i])).append(" ");
        }

        return res.toString();
    }

    private static String wordReverse(String s) {
//        String res = "";
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            res = ch + res;
//        }
//        return res;
        return new StringBuilder(s).reverse().toString();
    }
}
