package Recursion;

public class nokiakeypad {
    public static String[] keypad = {".","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String args[])
    {
        String str = "23";
        calkeypad(str, 0, "");
    }

    public static void calkeypad(String str, int l, String s) {
        if(l == str.length())
        {
            System.out.println(s);
            return;
        }
        char ch = str.charAt(l);
        String mapping = keypad[ch - '0'];

        for(int i = 0; i<mapping.length(); i++)
        {
            calkeypad(str, l+1, s+mapping.charAt(i));
        }
    }
}
