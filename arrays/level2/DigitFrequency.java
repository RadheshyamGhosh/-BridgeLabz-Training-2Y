import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take the input for a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Convert number to positive if negative
        number = Math.abs(number);

        // b. Find count of digits and save digits in an array
        String numberStr = Long.toString(number);
        int length = numberStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numberStr.charAt(i) - '0'; // convert char to int
        }

        // c. Frequency array for 10 digits (0-9)
        int[] frequency = new int[10];

        // d. Count frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // e. Display frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
