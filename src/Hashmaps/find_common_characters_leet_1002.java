package Hashmaps;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class find_common_characters_leet_1002 {
    public static void main(String args[]){
        String[] words = {"bella","label","roller", "stella"};

        System.out.println( commonCharacters(words));
        
    }

    private static List<String> commonCharacters(String[] words) {
        List<String> freq = new ArrayList<>();

        int[] min_freq = new int[26];  //minimum requency
        Arrays.fill(min_freq , Integer.MAX_VALUE);  //sbki value maximum hogyi aage min nikalne mein easy hoga

        for(String curr : words){ // check krenge vo value list mein hai ya nahi
            int[] character_freq = new int[26]; //  saare charctechar ki actual frequency k liye new array bnaya

            for(char ch : curr.toCharArray()){  //jitne bhi charcters mile unki frequency count kri
                character_freq[ch - 'a']++;
            }

            for(int i=0;i<26;i++){  // overall minimum frequency vs particular character ki frequency ka miniumum check
                min_freq[i] = Math.min(min_freq[i], character_freq[i]);
            }
        }

        for(int i=0;i<26;i++){
            while(min_freq[i]>0){
                freq.add(""+(char)(i+'a'));
                min_freq[i]--;
            }
        }
        return freq;
    }
}
