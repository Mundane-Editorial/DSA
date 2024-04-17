package Random_Questions;

public class alphabettoAscii {
    public static void main(String[] args) {
        int n = 132;
        String result = numberToAlphabet(n);
        System.out.println(n + " = " + result);
    }

    public static String numberToAlphabet(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int remainder = (n - 1) % 26;
            char letter = (char) ('A' + remainder);
            sb.insert(0, letter);
            n = (n - remainder) / 26;
        }
        return sb.toString();
    }
}
