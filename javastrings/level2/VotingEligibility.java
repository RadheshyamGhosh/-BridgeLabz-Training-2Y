import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // (a) Method to generate random 2-digit ages
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // generate random 2-digit number (10–99)
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    // (b) Method to check voting eligibility
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; // invalid age → cannot vote
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // eligible to vote
            } else {
                result[i][1] = "false"; // not eligible
            }
        }

        return result;
    }

    // (c) Method to display in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    // (d) Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] result = checkEligibility(ages);

        // Display result
        displayTable(result);

        sc.close();
}
}