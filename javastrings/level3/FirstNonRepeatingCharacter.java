import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String str) {
        // Create an array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256]; // ASCII has 256 characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        // Return a special character if no non-repeating character is found
        return '$'; // Returning $ if no non-repeating character exists
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Display the result
        if (result != '$') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
 }
}
}