package SAP_labs;

import java.util.*;
public class Check_anagram {
    public static void main(String[] args) {
        String a = "list3 21en";
        String b = "silen 321t";

        System.out.println(checkanagram(a,b));
    }

    private static String checkanagram(String a, String b) {
        //convert strings to char array
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        if(arr1.length !=  arr2.length){
            return "false";
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return "false";
            }
        }

        return "true";
    }
}
