import java.util.Scanner;

public class NumberChecker {

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

    // Method to check if Duck number (contains zero but not starting zero)
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int[] digits, int number) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Duck Number? " + isDuckNumber(digits));
        System.out.println("Armstrong Number? " + isArmstrong(digits, number));

        int[] largestPair = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestPair[0] + ", Second Largest: " + largestPair[1]);

        int[] smallestPair = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestPair[0] + ", Second Smallest: " + smallestPair[1]);
    }
}
