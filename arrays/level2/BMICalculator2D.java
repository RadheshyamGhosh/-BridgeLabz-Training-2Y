import java.util.Scanner;

public class BMICalculator2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        // b. Create 2D array for height, weight, BMI, and 1D array for status
        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number];

        // c. Take input and validate positive values
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Height
            double height;
            do {
                System.out.print("  Height (in meters): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("    Please enter a positive height.");
                }
            } while (height <= 0);

            // Weight
            double weight;
            do {
                System.out.print("  Weight (in kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("    Please enter a positive weight.");
                }
            } while (weight <= 0);

            // Store height and weight
            personData[i][0] = height;
            personData[i][1] = weight;

            // d. Calculate BMI and determine status
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4)
                weightStatus[i] = "Underweight";
            else if (bmi <= 24.9)
                weightStatus[i] = "Normal";
            else if (bmi <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // e. Display results
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
