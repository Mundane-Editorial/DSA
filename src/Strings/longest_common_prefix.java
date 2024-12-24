package Strings;

public class longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        if(strs == null || n == 0){
            return "";
        }

        int len = Integer.MAX_VALUE;
        for(String str : strs){
            len = Math.min(str.length(), len);
        }

        for(int i=0; i<len; i++){
            char ch = strs[0].charAt(i);
            for(int j=1; j<n; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != ch){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, len);
    }
}
