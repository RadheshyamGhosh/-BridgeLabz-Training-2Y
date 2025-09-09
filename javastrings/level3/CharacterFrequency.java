import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static void findCharacterFrequency(String str) {
        // Create an array to store the frequency of characters (ASCII values)
        int[] frequency = new int[256]; // ASCII has 256 characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Display the frequency of characters
        System.out.println("Character Frequency:");
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
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