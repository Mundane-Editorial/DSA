package Recursion;

public class subsequences
{
    public static void main(String[] args)
    {
        String str = "abc";
        figsubsequences(str, 0, "");
    }

    private static void figsubsequences(String str, int i, String s) {
        if(i == str.length())
        {
            System.out.println(s);
            return;
        }

        char ch = str.charAt(i);
        //agr vo element rehna chahta hai toh add krenge
        figsubsequences(str, i+1, s+ch);

        //agr vo element rehna nahi chahta toh "s" ko aise hi return krwa denge
        figsubsequences(str, i+1, s);
    }
}
