import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Create array & variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Step b: Infinite loop
        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // Step c: Break if user enters 0 or negative
            if (num <= 0) {
                break;
            }

            // Step d: Break if array limit is reached
            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached!");
                break;
            }

            // Step e: Store number in array
            numbers[index] = num;
            index++;
        }

        // Step f: Calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Step g: Display results
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}
