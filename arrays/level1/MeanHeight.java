import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array for 11 players' heights
        double[] heights = new double[11];

        // Step 2: Take input for each player's height
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Step 3: Find the sum of all heights
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Step 4: Calculate mean height
        double mean = sum / heights.length;

        // Step 5: Print result
        System.out.println("\nThe mean height of the football team is: " + mean);

        sc.close();
    }
}
