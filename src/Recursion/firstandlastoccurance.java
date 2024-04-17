package Recursion;

public class firstandlastoccurance {
        static int first = -1;
        static int last =  -1;


    public static void main(String args[])
    {
        String str = "abaacffsdgaaabfcbdsa";
        int l = 0;
        char key = 'a';
        Occurance(str, l, key);
    }

    private static void Occurance(String str, int l,char key) {
        if(l == str.length())
        {
            System.out.println("first index "+first);
            System.out.println("last  index "+last);
            return;
        }

        char ch = str.charAt(l);
        if(ch == key)
        {
            if(first == -1)
            {
                first = l;
            }
            else
            {
                last = l;
            }
        }

        Occurance(str, l+1, key);
    }
}
