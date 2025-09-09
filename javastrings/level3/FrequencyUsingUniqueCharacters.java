import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class FrequencyUsingUniqueCharacters {

    // Method to find unique characters in a string
    public static Set<Character> findUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();

        // Loop through the string to find unique characters
        for (int i = 0; i < str.length(); i++) {
            uniqueChars.add(str.charAt(i));
        }

        return uniqueChars;
    }

    // Method to find the frequency of characters in the string using unique characters
    public static void findCharacterFrequency(String str) {
        Set<Character> uniqueChars = findUniqueCharacters(str);
        int[] frequency = new int[256]; // ASCII has 256 characters

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Display the frequency of each unique character
        System.out.println("Character Frequency (using unique characters):");
        for (char c : uniqueChars) {
            System.out.println(c + ": " + frequency[c]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find the frequency of characters using unique characters
        findCharacterFrequency(input);
}
}