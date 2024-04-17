package Recursion;

public class allxtoend {
    public static void main(String args[])
    {
        String str = "axbcxxgghxvhxioh";
        updatedstring(str,0, 0, "");
    }

    private static void updatedstring(String str, int i, int count, String newstr) {
        if(i == str.length()-1)
        {
            for(int j=0; j<count; j++)
            {
                newstr = newstr+'x';
//                "x".concat(newstr);     -- not working
            }
            System.out.println(newstr);
            return ;
        }

        char ch = str.charAt(i);
        if(ch == 'x')
        {
            updatedstring(str, i+1, count+1, newstr);
        }
        else{
            newstr += ch;
            updatedstring(str, i+1, count, newstr);
        }

    }

}
