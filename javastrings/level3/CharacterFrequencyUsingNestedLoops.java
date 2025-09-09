import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static void findCharacterFrequency(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Create an array to store the frequency of each character
        int[] frequency = new int[256];  // ASCII characters (256)

        // Loop through the string to find the frequency of each character
        for (int i = 0; i < charArray.length; i++) {
            // Inner loop to check if the character is already counted
            for (int j = 0; j < i; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i] = -1;  // Mark as already counted
                    break;
                }
            }

            // Count the frequency if it's not already counted
            if (frequency[i] != -1) {
                frequency[i] = 1;
                for (int k = i + 1; k < charArray.length; k++) {
                    if (charArray[i] == charArray[k]) {
                        frequency[i]++;
                        frequency[k] = -1;  // Avoid counting the character again
                    }
                }
            }
        }

        // Display the frequency of each character
        System.out.println("Character Frequency:");
        for (int i = 0; i < charArray.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(charArray[i] + ": " + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find the frequency of characters
        findCharacterFrequency(input);
}
}