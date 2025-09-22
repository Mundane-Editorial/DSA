package ALGORITHMS;

public class matrix_chain_multiplication {
    public static void main(String[] args) {
        int[] arr = {5,4,6,2,7};  // dimensions
        int n = arr.length;

        int[][] m = new int[n][n];
        int[][] s = new int[n][n];

        // cost is zero when multiplying one matrix
        for (int i = 1; i < n; i++) {
            m[i][i] = 0;
        }

        // chain length (l) starts from 2 to n-1
        for (int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k+1][j] + arr[i-1]*arr[k]*arr[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }

        System.out.println("Minimum number of multiplications: " + m[1][n-1]);
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
