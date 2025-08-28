import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication results (for 6 to 9 → 4 numbers, each 10 results)
        int[][] multiplicationResult = new int[4][10];

        // Loop through tables from 6 to 9
        for (int n = 6; n <= 9; n++) {
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[n - 6][i - 1] = n * i;
            }
        }

        // Display results
        for (int n = 6; n <= 9; n++) {
            System.out.println("\nMultiplication Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + multiplicationResult[n - 6][i - 1]);
            }
        }

        sc.close();
    }
}
