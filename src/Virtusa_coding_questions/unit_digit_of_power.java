package Virtusa_coding_questions;

import java.util.*;
public class unit_digit_of_power {
    public static void main(String[] args) {
        int n = 8;
        int k = 30;

        System.out.println(unitDigit(n, k));
    }

    private static int unitDigit(int n, int k) {
        int base = n%10;
        int pow = k%4;
        int res = (int)Math.pow(base, pow);
        return res%10;
    }
}
