import java.util.Scanner;

public class BMICalculator {

    // Method to take user input for weight and height and store in a 2D array
    public static double[][] getUserInput(int numberOfPeople) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[numberOfPeople][2];  // First column: weight, second column: height
        
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        return data;
    }

    // Method to calculate BMI and status based on the weight and height
    public static String[][] calculateBMIAndStatus(double[][] data, int numberOfPeople) {
        String[][] result = new String[numberOfPeople][4];  // First column: BMI, second column: status
        
        for (int i = 0; i < numberOfPeople; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;  // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            result[i][0] = String.format("%.2f", bmi);
            
            // Assign BMI status
            if (bmi <= 18.4) {
                result[i][1] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                result[i][1] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                result[i][1] = "Overweight";
            } else {
                result[i][1] = "Obese";
            }
            
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = result[i][1];
        }
        return result;
    }

    // Method to display the BMI results in a tabular format
    public static void displayResults(String[][] result, int numberOfPeople) {
        System.out.println("Person No.\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println((i + 1) + "\t\t" + result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        int numberOfPeople = 10;

        // Step 1: Get user input for height and weight
        double[][] data = getUserInput(numberOfPeople);

        // Step 2: Calculate BMI and status
        String[][] result = calculateBMIAndStatus(data, numberOfPeople);

        // Step 3: Display the results
    displayResults(result, numberOfPeople);
}
}