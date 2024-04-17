package Random_Questions;

import java.util.ArrayList;
import java.util.List;

public class alphabetcombinations {
    public static void main(String args[]) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        List<String> list = new ArrayList<String>();
        testcombo(s, 0, "", list);
        System.out.println(list); // Print the final list after generating combinations
    }

    private static void testcombo(String s, int i, String current, List<String> list) {
        if (i == s.length()) {
            list.add(current); // Add the current combination to the list
            return;
        }

        // Include the current character
        testcombo(s, i + 1, current + s.charAt(i), list);

        // Exclude the current character
        testcombo(s, i + 1, current, list);
    }
}


//okkk mtlb ye program pc ki poori ram ni use krra, compiler usko 4 gb usage k baad hi ou of heap storage bta rha hai ... heap storage full horhi hai mtlb iski ..
// got it