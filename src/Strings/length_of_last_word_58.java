package Strings;

public class length_of_last_word_58 {
    public static void main(String[] args) {
        String s = "Hello World     ";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int l = str.length - 1;
        return str[l].length();
    }
}
