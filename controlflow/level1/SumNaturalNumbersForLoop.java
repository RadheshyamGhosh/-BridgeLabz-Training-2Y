import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Using formula n*(n+1)/2
            int formulaSum = n * (n + 1) / 2;

            // Using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Print results
            System.out.println("Sum of first " + n + " natural numbers using formula: " + formulaSum);
            System.out.println("Sum of first " + n + " natural numbers using for loop: " + loopSum);

            // Compare both
            if (formulaSum == loopSum) {
                System.out.println("✅ Both computations are correct!");
            } else {
                System.out.println("❌ The results do not match!");
            }
        }

        sc.close();
    }
}
