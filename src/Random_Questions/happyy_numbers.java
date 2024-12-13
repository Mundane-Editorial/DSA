package Random_Questions;

import java.util.HashMap;

public class happyy_numbers {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));
    }

    private static boolean isHappy(int n) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        while(n!=1 && !seen.containsKey(n)){
            seen.put(n, 1);
            int total = 0;
            while(n > 0){
                int rem = n%10;
                total = total + (rem * rem);
                n = n/10;
            }
            n = total;
        }
        return n == 1;
    }
}
