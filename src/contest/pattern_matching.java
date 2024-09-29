package contest;

public class pattern_matching {
    public static void main(String[] args) {
        String s = "abcdefg";
        String pattern = "bcdffg";
        System.out.println(minStartingIndex(s, pattern));
    }


    static public int minStartingIndex(String s, String pattern) {
//        int m = s.length();
//        int n = pattern.length();
//
//        if(n > m){
//            return -1;
//        }
//
//        for(int i = 0; i <= m - n; i++){
//            int count = 0;
//            for(int j = 0; j<n; j++){
//                if(s.charAt(i+j) != pattern.charAt(j)){
//                    count++;
//                }
//                if(count > 1){
//                    break;
//                }
//            }
//
//            if(count <= 1){
//                return i;
//            }
//        }
//
//        return -1;

//        int m = s.length();
//        int n = pattern.length();
//
//        if (n > m) {
//            return -1;
//        }
//
//        int[] charCount = new int[26];
//        int[] patternCount = new int[26];
//
//        // Initialize character counts for the pattern
//        for (char c : pattern.toCharArray()) {
//            patternCount[c - 'a']++;
//        }
//
//        int start = 0;
//        int end = 0;
//        int count = 0;
//
//        // Slide the window
//        while (end < m) {
//            char c = s.charAt(end);
//            charCount[c - 'a']++;
//
//            // If a character becomes redundant, remove it from the starting window
//            if (charCount[c - 'a'] > patternCount[c - 'a']) {
//                count--;
//                charCount[s.charAt(start) - 'a']--;
//                start++;
//            }
//
//            // If all characters in the pattern are found, check if it's a valid match
//            if (end - start + 1 == n && count == 0) {
//                return start;
//            }
//
//            end++;
//        }
//
//        return -1;



        int m = s.length();
        int n = pattern.length();

        if (n > m) {
            return -1;
        }

        int[] charCount = new int[26];  // For counting characters in `s`
        int[] patternCount = new int[26]; // For counting characters in `pattern`

        // Initialize character counts for the pattern
        for (char c : pattern.toCharArray()) {
            patternCount[c - 'a']++;
        }

        int start = 0, end = 0, mismatchCount = 0;

        // Slide the window
        while (end < m) {
            char c = s.charAt(end);
            // If c is part of the pattern, count its occurrences
            if (end - start < n) {
                charCount[c - 'a']++;
                // Check if there's a mismatch
                if (charCount[c - 'a'] > patternCount[c - 'a']) {
                    mismatchCount++;
                }
            }

            // Ensure the window is of size `n`
            if (end - start + 1 > n) {
                char leftChar = s.charAt(start);
                // Remove the character going out of the window
                charCount[leftChar - 'a']--;
                // Check if it was a mismatch
                if (charCount[leftChar - 'a'] < patternCount[leftChar - 'a']) {
                    mismatchCount--;
                }
                start++;
            }

            // If window size is n and we have at most one mismatch
            if (end - start + 1 == n && mismatchCount <= 1) {
                return start; // Return the starting index
            }

            end++;
        }

        return -1; // No valid match found
    }
}

