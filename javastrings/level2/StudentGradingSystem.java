import java.util.Random;

public class StudentGradingSystem {

    // Method to generate random 2-digit marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int numberOfStudents) {
        Random random = new Random();
        int[][] marks = new int[numberOfStudents][3];  // 3 subjects for each student

        // Fill the 2D array with random marks between 0 to 99
        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = random.nextInt(100);  // Physics
            marks[i][1] = random.nextInt(100);  // Chemistry
            marks[i][2] = random.nextInt(100);  // Maths
        }

        return marks;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] marks, int numberOfStudents) {
        double[][] result = new double[numberOfStudents][4];  // Total, Average, Percentage, and Rounded Percentage

        for (int i = 0; i < numberOfStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
            result[i][3] = Math.round(percentage * 100.0) / 100.0;  // Rounded to 2 decimal places
        }

        return result;
    }

    // Method to assign grades based on the percentage
    public static String[] calculateGrades(double[][] result, int numberOfStudents) {
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = result[i][3];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] marks, double[][] result, String[] grades, int numberOfStudents) {
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d\t\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%\t\t%s\n", 
                              i + 1, 
                              marks[i][0], marks[i][1], marks[i][2], 
                              result[i][0], result[i][1], result[i][2], 
                              grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5; // Can change to any number of students

        // Step 1: Generate random marks for students
        int[][] marks = generateMarks(numberOfStudents);

        // Step 2: Calculate total, average, and percentage
        double[][] result = calculateTotalAveragePercentage(marks, numberOfStudents);

        // Step 3: Calculate grades based on percentage
        String[] grades = calculateGrades(result, numberOfStudents);

        // Step 4: Display the scorecard
        displayScorecard(marks, result, grades, numberOfStudents);
}
}