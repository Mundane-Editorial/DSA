package Binary_Trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class unique_binary_tree {
    public static void main(String args[])throws IOException {
        BufferedReader buf = new BufferedReader((new InputStreamReader(System.in)));
        int t = Integer.parseInt(buf.readLine());

        int[] node = new int[t];
        for(int i=0; i<t; i++){
            node[i] = Integer.parseInt(buf.readLine());
        }

        System.out.println(Arrays.toString(uniquetrees(node)));
    }

    private static int[] uniquetrees(int[] node) {
        int l = node.length;
        int[] res = new int[l];
        for(int i=0;i<l;i++){
            res[i] = calcunique(node[i]);
        }
        return res;
    }

    private static int calcunique(int n) {
        int[] trees = new int[n + 1];
        trees[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                trees[i] += trees[k - 1] * trees[i - k];
            }
        }

        return trees[n];
    }
}

