import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        // b. Create arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // c. Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("  Height (in meters): ");
            height[i] = scanner.nextDouble();
            System.out.print("  Weight (in kg): ");
            weight[i] = scanner.nextDouble();
        }

        // d. Calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // e. Display results
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", height[i], weight[i], bmi[i], status[i]);
        }

        scanner.close();
    }
}
