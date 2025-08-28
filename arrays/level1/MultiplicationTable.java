import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define array for storing results (1 to 10)
        int[] table = new int[10];

        // Store multiplication results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
