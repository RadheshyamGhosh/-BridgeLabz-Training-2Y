import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if the number is valid
        if (n < 0) {
            System.out.println("The number " + n + " is not a positive integer.");
        } else {
            int factorial = 1;
            int i = 1;

            // Using while loop to calculate factorial
            while (i <= n) {
                factorial = factorial * i;
                i++;
            }

            // Print result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        sc.close();
    }
}
