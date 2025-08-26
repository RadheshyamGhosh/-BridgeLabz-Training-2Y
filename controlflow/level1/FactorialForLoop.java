import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if the number is valid (natural number)
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int factorial = 1;

            // Using for loop to calculate factorial
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            // Print result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        sc.close();
    }
}
