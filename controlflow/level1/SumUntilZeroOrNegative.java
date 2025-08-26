import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0; // to store sum

        System.out.println("Enter numbers to sum (enter 0 or negative number to stop):");

        while (true) {
            double number = sc.nextDouble(); // take user input

            if (number <= 0) { // stop if 0 or negative
                break;
            }

            total += number; // add to total
            System.out.println("Current total = " + total);
        }

        // After loop ends
        System.out.println("Final total = " + total);

        sc.close();
    }
}
