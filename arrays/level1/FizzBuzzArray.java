import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        // Step 2: Create a String array to save results
        String[] results = new String[num + 1]; // include 0 also

        // Step 3: Loop from 0 to num and store values
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i); // save number as string
            }
        }

        // Step 4: Print the results with index positions
        for (int i = 0; i <= num; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
