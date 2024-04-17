package Recursion;

public class removeduplicates {
    public static boolean map[] = new boolean[26];

    public static void main(String args[])
    {
        String str = "abbabsbdbchbfjfbghxshvvhvnvcxnbvfd";
        remDuplicates(str, 0, "");
    }

    private static void remDuplicates(String str, int i, String s) {
        if(i == str.length())
        {
            System.out.println(s);
            return;
        }

        char ch = str.charAt(i);
        if(map[ch - 'a'])
        {
            remDuplicates(str, i+1, s);
        } else
        {
            s = s+ch;
            map[ch - 'a'] = true;
            remDuplicates(str, i+1, s);
        }
    }
}
