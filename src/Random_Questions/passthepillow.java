package Random_Questions;
import java.io.*;
public class passthepillow {
    public static void main(String args[])throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(buf.readLine());
        int time = Integer.parseInt(buf.readLine());

        System.out.println(pillowposition(n, time));
    }

    private static int pillowposition(int n, int time) {
        if(time<n){
            return 1+time%n;
        }
        // if(time>n){
        //     return ;
        // }
        return (n-1)-time%n;
    }
}
