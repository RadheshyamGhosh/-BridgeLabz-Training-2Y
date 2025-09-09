import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;  // convert cm → m
        return weight / (heightM * heightM);
    }

    // Method to determine BMI Status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array: col[0] = weight, col[1] = height, col[2] = BMI
        double[][] data = new double[10][3];
        String[] status = new String[10];

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            // Calculate BMI and store
            data[i][2] = calculateBMI(data[i][0], data[i][1]);

            // Store BMI status
            status[i] = getBMIStatus(data[i][2]);
        }

        // Display results
        System.out.println("\n--- BMI Results ---");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }
}
