import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array of 5 elements
        int[] numbers = new int[5];

        // Take input from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number " + num + " is Zero.");
            }
        }

        // Compare first and last element
        System.out.println("\n--- Comparison of First and Last Element ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ").");
        }

        sc.close();
    }
}
