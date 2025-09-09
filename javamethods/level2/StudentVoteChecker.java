import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // invalid age
        } else if (age >= 18) {
            return true;  // eligible to vote
        } else {
            return false; // not eligible
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker svc = new StudentVoteChecker();

        int[] ages = new int[10];

        // Take input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = svc.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") cannot vote.");
            }
        }

        sc.close();
    }
}
