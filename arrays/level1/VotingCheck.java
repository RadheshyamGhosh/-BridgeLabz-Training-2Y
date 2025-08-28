import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array of 10 integers
        int[] ages = new int[10];

        // Take user input for student ages
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Result ---");

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age!");
            } else if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
