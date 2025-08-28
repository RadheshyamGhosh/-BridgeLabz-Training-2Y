import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Define array to store digits
        int maxDigit = 10;   // maximum digits to store
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 3: Extract digits and store in array
        while (number != 0 && index < maxDigit) {
            int digit = number % 10;  // last digit
            digits[index] = digit;
            index++;
            number = number / 10;    // remove last digit
        }

        // Step 4: Find largest and second largest
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;  // update second largest
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Step 5: Display results
        System.out.println("Digits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit = " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit does not exist (all digits same).");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        sc.close();
    }
}
