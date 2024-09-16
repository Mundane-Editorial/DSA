package Random_Questions;

import java.util.HashMap;

public class StringCompressor {

    public static void main(String[] args) {
        String input = "3322251";
        String compressedString = compressString(input);
        System.out.println("Original String: " + input);
        System.out.println("Compressed String: " + compressedString);
    }

    public static String compressString(String input) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        StringBuilder temp = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char currentChar = input.charAt(i);
            int count = 1;

            while (i + 1 < input.length() && input.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            frequencyMap.put(currentChar, count);
            temp.append(currentChar).append(count);
            i++;
        }

        return temp.toString();
    }
}
