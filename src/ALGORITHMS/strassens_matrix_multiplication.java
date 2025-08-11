package ALGORITHMS;

import java.util.Arrays;

public class strassens_matrix_multiplication {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] B = {
                {17, 18, 19, 20},
                {21, 22, 23, 24},
                {25, 26, 27, 28},
                {29, 30, 31, 32}
        };

        int[][] res = result(A, B, A.length);
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] result(int[][] A, int[][] B, int n) {
        int[][] C = new int[n][n];

        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int mid = n / 2;

        // Divide matrices into 4 parts
        int[][] A11 = new int[mid][mid];
        int[][] A12 = new int[mid][mid];
        int[][] A21 = new int[mid][mid];
        int[][] A22 = new int[mid][mid];

        int[][] B11 = new int[mid][mid];
        int[][] B12 = new int[mid][mid];
        int[][] B21 = new int[mid][mid];
        int[][] B22 = new int[mid][mid];

        split(A, A11, 0, 0);
        split(A, A12, 0, mid);
        split(A, A21, mid, 0);
        split(A, A22, mid, mid);

        split(B, B11, 0, 0);
        split(B, B12, 0, mid);
        split(B, B21, mid, 0);
        split(B, B22, mid, mid);

        // Strassen's formulas
        int[][] P1 = result(add(A11, A22), add(B11, B22), mid);
        int[][] P2 = result(add(A21, A22), B11, mid);
        int[][] P3 = result(A11, subtract(B12, B22), mid);
        int[][] P4 = result(A22, subtract(B21, B11), mid);
        int[][] P5 = result(add(A11, A12), B22, mid);
        int[][] P6 = result(subtract(A21, A11), add(B11, B12), mid);
        int[][] P7 = result(subtract(A12, A22), add(B21, B22), mid);

        // Compute resulting submatrices
        int[][] C11 = add(subtract(add(P1, P4), P5), P7);
        int[][] C12 = add(P3, P5);
        int[][] C21 = add(P2, P4);
        int[][] C22 = add(subtract(add(P1, P3), P2), P6);

        // Combine submatrices into result
        join(C11, C, 0, 0);
        join(C12, C, 0, mid);
        join(C21, C, mid, 0);
        join(C22, C, mid, mid);

        return C;
    }

    private static void split(int[][] P, int[][] C, int row, int col) {
        for (int i = 0; i < C.length; i++)
            for (int j = 0; j < C.length; j++)
                C[i][j] = P[i + row][j + col];
    }

    private static void join(int[][] C, int[][] P, int row, int col) {
        for (int i = 0; i < C.length; i++)
            for (int j = 0; j < C.length; j++)
                P[i + row][j + col] = C[i][j];
    }

    private static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    private static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }
}
