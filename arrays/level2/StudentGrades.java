import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for the number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        // b. Create arrays to store marks, percentage, and grade
        int[][] marks = new int[n][3]; // [physics, chemistry, maths]
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // c. Take input and validate
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "  Physics: " : (j == 1) ? "  Chemistry: " : "  Maths: ";

                System.out.print(subject);
                int mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("    Invalid mark! Enter positive value between 0 and 100.");
                    i--; // Restart input for this student
                    break;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        // d. Calculate percentage and assign grades
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
