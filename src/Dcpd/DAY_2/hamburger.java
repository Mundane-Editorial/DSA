package Dcpd.DAY_2;

import java.util.HashMap;

public class hamburger {
    public static void main(String args[]){
        String ingredients = "BBBSSC";
        int[] quantity = {6,4,1};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('B', 1);
        map.put('S', 2);
        map.put('C', 3);
        int ruble = 4;

        System.out.println("Maximum hamburgers :: "+ maximumHamburgers(ingredients, map, ruble));
    }

    private static String maximumHamburgers(String ingredients, HashMap<Character, Integer> map, int ruble) {
        for(int i=0; i<ingredients.length();i++){
            char ch = ingredients.charAt(i);

        }
    }
}
