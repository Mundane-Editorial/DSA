package Random_Questions;

import java.io.IOException;

public class lettercount {


    public static void main(String args[])throws IOException{
        String s = "abaabba";
        int n = 20;

        System.out.println(repeat(s, n));

    }
    public static int repeat(String s, int n){
        int a = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a')
            {
                a++;
            }
        }
        int repeats = n/s.length();
        int remchars = n % s.length();

        int remcount = 0;
        for(int i=0; i<remchars; i++)
        {
            if(s.charAt(i)=='a'){
                remcount++;
            }
        }

        int totalcount = repeats * a + remcount;
        return totalcount;
    }


}
