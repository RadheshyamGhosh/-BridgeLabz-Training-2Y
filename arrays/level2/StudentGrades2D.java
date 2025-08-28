import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Input number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        // b. Create 2D array for marks [students][3 subjects]
        int[][] marks = new int[n][3]; // [physics, chemistry, maths]
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // c. Input marks for each student and subject
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = switch (j) {
                    case 0 -> "  Physics: ";
                    case 1 -> "  Chemistry: ";
                    default -> "  Maths: ";
                };

                System.out.print(subject);
                int mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("    Invalid mark! Please enter a value between 0 and 100.");
                    j--; // Repeat this subject input
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        // d. Calculate percentages and grades
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            double perc = percentages[i];
            if (perc >= 80)
                grades[i] = 'A';
            else if (perc >= 70)
                grades[i] = 'B';
            else if (perc >= 60)
                grades[i] = 'C';
            else if (perc >= 50)
                grades[i] = 'D';
            else if (perc >= 40)
                grades[i] = 'E';
            else
                grades[i] = 'R';
        }

        // e. Display results
        System.out.printf("%-10s %-10s %-10s %-15s %-10s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-15.2f %-10c%n",
                    marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
