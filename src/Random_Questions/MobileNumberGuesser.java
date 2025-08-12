package random_questions;
import java.util.Random;
import java.util.Scanner;

public class MobileNumberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        long targetNumber = 9816348388L;
        long guessedNumber;
        int attempts = 0;
        long startTime = System.currentTimeMillis();

        do {
            guessedNumber = 1000000000L + (long)(random.nextDouble() * 9000000000L);
            attempts++;
        } while (guessedNumber != targetNumber);

        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000.0;

        System.out.println("Password Bypassed! Mobile number found: " + guessedNumber);
        System.out.println("Attempts: " + attempts);
        System.out.println("Time taken: " + timeTaken + " seconds");

        scanner.close();
    }
}
