import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number (less than 100): ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 100; // start from 100

            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--; // decrease counter
            }
        } else {
            System.out.println("Please enter a positive integer less than 100!");
        }

        sc.close();
    }
}
