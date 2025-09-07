import java.util.Scanner;

public class SumNaturalNumbers {

    static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int result = findSum(n);
            System.out.println("The sum of " + n + " natural numbers is " + result);
        } else {
            System.out.println("Please enter a natural number (greater than 0).");
        }

        sc.close();
    }
}
