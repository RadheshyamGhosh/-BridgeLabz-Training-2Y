import java.util.Arrays;
import java.util.Scanner;

public class Numbercheckers {

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // 0-9 digits
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;  // digit
            freq[i][1] = 0;  // frequency
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Harshad Number? " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies (digit -> count):");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
            }
        }
    }
}
