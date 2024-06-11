package Leet_75;

public class is_subsequence_392 {
    public static void main(String args[]){
        String s = "acb";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s,t));
    }
    private static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length())
        {
            char ch_i = s.charAt(i);
            char ch_t = t.charAt(j);

            if(ch_i == ch_t){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i == s.length()){
            return true;
        }
        return false;
    }
}
