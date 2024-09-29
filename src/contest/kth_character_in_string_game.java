package contest;

import java.util.HashMap;

public class kth_character_in_string_game {


    public static void main(String[] args) {
        String word = "Ieaouqqieaouqq";
        int k =1;
//        System.out.println(kthCharacter(k));
        System.out.println(countOfSubstrings(word, k));
    }

    private static int countOfSubstrings(String word, int k) {
                int n = word.length();
                int vowel = 0;
                int consonant = 0;
                int start = 0;
                int total = 0;

                HashMap<Character, Integer> map = new HashMap<>();
                map.put('a', 0);
                map.put('e', 0);
                map.put('i', 0);
                map.put('o', 0);
                map.put('u', 0);

                for (int i = 0; i < n; i++) {
                    char ch = word.charAt(i);

                    if (map.containsKey(ch)) {
                        map.put(ch, map.get(ch) + 1);
                        if (map.get(ch) == 1) {
                            vowel++;
                        }
                    } else if (Character.isLetter(ch)) {
                        consonant++;
                    }

                    while (vowel >= 5 && consonant > k) {
                        char ch1 = word.charAt(start);

                        if (map.containsKey(ch1)) {
                            map.put(ch1, map.get(ch1) - 1);
                            if (map.get(ch1) == 0) {
                                vowel--;
                            }
                        } else if (Character.isLetter(ch1)) {
                            consonant--;
                        }

                        start++;
                    }

                    if (vowel >= 5 && consonant <= k) {
                        total++;
                    }
                }

                return total;

    }


//    static public char kthCharacter(int k) {
//            int currentLength = 1; // Initial string length is 1 (containing "a")
//            int nextLength = 2; // Next string length after the first operation
//            char currentChar = 'a'; // Initial character
//
//            while (currentLength < k) {
//                // Calculate the number of characters to be added in the next operation
//                int charactersToAdd = nextLength - currentLength;
//
//                // Check if the k-th character is within the newly added characters
//                if (k <= currentLength + charactersToAdd) {
//                    // Calculate the offset from the beginning of the newly added characters
//                    int offset = k - currentLength;
//                    // Determine the character based on the offset
//                    currentChar = (char) ('a' + offset - 1);
//                    break;
//                }
//
//                // Update the current length and next length for the next operation
//                currentLength = nextLength;
//                nextLength *= 2; // Double the length for the next operation
//            }
//
//            return currentChar;
//        }
}
