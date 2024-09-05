package SAP_labs;

import java.util.HashMap;
import java.util.Set;

public class Max_unique_exponent {
    public static void main(String[] args) {
        String s = "aabbbbeeeeffggg";
        count(s);
    }

    private static void count(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }

        for (char key : map.keySet()) {
            System.out.print(key + "" + map.get(key));
        }
    }
}
