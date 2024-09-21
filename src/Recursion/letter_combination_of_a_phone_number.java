package Recursion;
import java.util.*;
public class letter_combination_of_a_phone_number {
    public static void main(String[] args) {
        String str = "23";
        System.out.println(letterCombinations(str));
    }

    public static String[] keypad = {" ", ".","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits.length() == 0) {
            return list;
        }

        backtrack("", digits, 0, list);
        return list;
    }

    private static void backtrack(String combination, String digits, int index, List<String> list){
        if(index == digits.length()){
            list.add(combination);
            return;
        }

        char ch = digits.charAt(index);
        String letters = keypad[Character.getNumericValue(ch)];

        for (char letter : letters.toCharArray()) {
            backtrack(combination + letter, digits, index + 1, list);
        }
    }
}
