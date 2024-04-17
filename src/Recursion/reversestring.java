package Recursion;

public class reversestring {
    public static void main(String args[])
    {
        String s = "Pavilion";
        int l = s.length()-1;
        reverse(s,l);
    }

    private static void reverse(String s, int l) {
        if(l == 0)
        {
            System.out.print(s.charAt(l));
            return;
        }
        System.out.print(s.charAt(l));
        reverse(s, l-1);
    }
}
