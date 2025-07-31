package Random_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_prime_sum {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (calculate(i)) {
                sum += i;
            }
        }
        System.out.print(sum);
    }

    private static boolean calculate(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
