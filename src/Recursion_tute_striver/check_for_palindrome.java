package Recursion_tute_striver;

public class check_for_palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(ispalindrome(s, 0));
    }

    private static Boolean ispalindrome(String s, int i) {
        if(i > s.length()/2){
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length() - i - 1)){
            return false;
        }

        return ispalindrome(s, i+1);
    }
}
