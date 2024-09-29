package Strings;
import java.util.*;
public class substring_of_a_string {

    public static void main(String[] args) {
        String s = "abcde";
        String[] substrings = findsubstring(s);

        System.out.println(Arrays.toString(substrings));

//        for(int i=0; i<substrings.length; i++){
//            if(substrings[i].length() == 5){
//                System.out.print(substrings[i] +" ");
//            }
//        }
    }

    private static String[] findsubstring(String s) {
        int l = s.length();
        ArrayList<String> str = new ArrayList<>();
        for(int i=0; i<l; i++){
            for(int j=i+1; j<=l; j++){
                str.add(s.substring(i, j));
            }
        }

        String[] res = new String[str.size()];
        for(int i=0; i<str.size(); i++){
            res[i] = str.get(i);
        }

        return res;
    }
}
