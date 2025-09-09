import java.util.Arrays;
import java.util.Scanner;

public class number {

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits in array
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        // Duck number cannot start with zero
        if (digits[0] == 0) return false;
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);

        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Arrays Equal? " + arraysEqual(digits, reversed));
        System.out.println("Palindrome? " + isPalindrome(number));
        System.out.println("Duck Number? " + isDuckNumber(number));
    }
}
