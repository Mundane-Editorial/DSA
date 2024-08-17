package Online_Assesments;
import java.io.*;
import java.util.*;

/*There is a hostel warden in some XYZ hostel. He is very strict with students. He has some set of rules to allow
students to let them out.
Students are in random order but warden don’t allow them in that way.
Rule 1- whose initial is a prime value should go out before whose initial is a composite value.
Rule 2- if two students have prime value , a student with less value goes out first
Rule 3- if two students have composite value , a student with greater value goes out first
NOTE:- consider the ASCII value of the initial to find it is prime or composite.

Input format:
The first line of input contains the number of students N
The second line of input contains random order of the students S.
(students at index zero goes out first and students at index N-1 goes last)

Constraints
1<=number of students <=105
33<=ASCII Of Characters<=126

Output Format
The single line of output should contain the required modified order of students to go out.

Sample Input
13
Kkunjkhahorin

Sample Output
akkuronnjihhK

Explanation
For primes: a<k
For Composite: K<h<i<j<n<o<r<u
Adding up logic, the required answer is akkuronnjihhK*/

public class hostel_warden_samsung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String students = sc.next(); // Read the string of students

        ArrayList<Character> plist = new ArrayList<>(); // List for prime initials
        ArrayList<Character> clist = new ArrayList<>(); // List for composite initials

        // Separate students into prime and composite lists
        for (int i = 0; i < n; i++) {
            char student = students.charAt(i);
            if (isPrime(student)) {
                plist.add(student);
            } else if (isComposite(student)) {
                clist.add(student);
            }
        }

        // Sort the prime list in ascending order
        Collections.sort(plist);
        // Sort the composite list in descending order
        Collections.sort(clist, Collections.reverseOrder());

        // Combine the lists
        StringBuilder result = new StringBuilder();
        for (char c : plist) {
            result.append(c);
        }
        for (char c : clist) {
            result.append(c);
        }

        // Output the final order
        System.out.println(result.toString());
    }

    private static boolean isComposite(char ch) {
        int asciiValue = (int) ch;
        return asciiValue > 1 && !isPrime(ch);
    }

    private static boolean isPrime(char ch) {
        int asciiValue = (int) ch;
        if (asciiValue <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(asciiValue); i++) {
            if (asciiValue % i == 0) return false; // Found a divisor, not prime
        }
        return true;
    }
}