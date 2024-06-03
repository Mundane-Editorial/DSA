package Random_Questions;
import java.util.*;
public class text_justification_leet_68 {
    public static void main(String args[]){
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxwidth = 16;

        List<String> result1 = fulljustify(words, maxwidth);
        for (String line : result1) {
            System.out.println("\"" + line + "\"");
        }
    }

    private static List<String> fulljustify(String[] words, int maxwidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxwidth)
                    break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder sb = new StringBuilder();
            int gaps = last - index - 1;

            if (last == words.length || gaps == 0) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i != last - 1) sb.append(" ");
                }
                for (int i = sb.length(); i < maxwidth; i++) {
                    sb.append(" ");
                }
            } else {
                int spaces = (maxwidth - totalChars) / gaps;
                int extraSpaces = (maxwidth - totalChars) % gaps;

                for (int i = index; i < last - 1; i++) {
                    sb.append(words[i]);
                    sb.append(" ");

                    for (int j = 0; j < spaces + (i - index < extraSpaces ? 1 : 0); j++) {
                        sb.append(" ");
                    }
                }
                sb.append(words[last - 1]);
            }

            result.add(sb.toString());
            index = last;
        }

        return result;
    }
}
