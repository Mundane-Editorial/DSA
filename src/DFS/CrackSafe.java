package DFS;

import java.util.HashSet;
import java.util.Set;

public class CrackSafe {

    public static String crackSafe(int n, int k) {
        Set<String> seen = new HashSet<>();
        StringBuilder ans = new StringBuilder();

        String start = "0".repeat(n - 1);
        dfs(start, k, seen, ans, n);

        ans.append(start);
        return ans.toString();
    }

    private static void dfs(String node, int k, Set<String> seen, StringBuilder ans, int n) {
        for (int x = 0; x < k; x++) {
            String nei = node + x;

            if (!seen.contains(nei)) {
                seen.add(nei);
                dfs(nei.substring(1), k, seen, ans, n);
                ans.append(x);
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 2;
        System.out.println(crackSafe(n, k));
    }
}
