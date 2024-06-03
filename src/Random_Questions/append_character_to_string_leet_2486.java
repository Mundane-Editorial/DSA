package Random_Questions;

public interface append_character_to_string_leet_2486 {
    public static void main(String args[]){
        String s = "coaching";
        String t = "coding";

        System.out.println(appendCharacters(s,t));
    }

    private static int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        int charactersToAppend = t.length() - j;

        return charactersToAppend;


    }
}
