package Dcpd.DAY_1;

import java.util.Arrays;
public class Devu {
    public static void main(String args[]){
        int[] a = {1,2,3};
        int[] b = {3,4};

        System.out.println("minimum operations :: " + count(a,b));
    }

    private static int count(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int[] ans = new int[n+m];
        for(int i=0;i<n;i++)
            ans[i] = a[i];

        for(int i=0;i<m;i++)
            ans[i+n] = b[i];

        Arrays.sort(ans);
        int target = ans[(n+m)/2];
        int res = 0;

        for(int i=0;i<n;i++)
            res = res + Math.max(0, target-a[i]);

        for(int i=0;i<m;i++)
            res += Math.max(0,b[i] - target);

        return res;
    }
}
