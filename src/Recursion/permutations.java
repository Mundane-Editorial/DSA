package Recursion;

public class permutations {
    public static void main(String args[])
    {
        String str = "abc";
        allpermutations(str, "");
    }

    private static void allpermutations(String str, String s) {
        if(str.length() == 0)
        {
            System.out.println(s);
            return;
        }
        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            String newstring = str.substring(0, i) + str.substring(i+1);
            allpermutations(newstring, s+ch);
        }
    }
}
