package Strings;

public class longest_common_substring {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Our world";

        System.out.println(findsubstring(s1, s2));
    }

    private static String findsubstring(String s1, String s2) {
        String longest = "";

        for(int i=0; i<s1.length(); i++){
            for(int j=i+1; j<=s1.length(); j++){
                String sub = s1.substring(i, j);
                if(s2.contains(sub) && sub.length() > longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }
}
