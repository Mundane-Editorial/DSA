package Random_Questions;

import java.io.*;     // galt hai --
import java.util.ArrayList;

public class unique_binary_tree {
    public static void main (String args[])throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(buf.readLine());

        int n = 3;
        ArrayList<Integer> ans = new ArrayList<>(n-1);
        ans.add(1);
        ans.add(1);

        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                ans.add(ans.get(i - 1) * ans.get(Math.abs(j-i)));
            }
        }

        System.out.println(ans.get(n));
    }
}
